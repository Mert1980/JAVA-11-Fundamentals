package be.intecbrussel.exercise10_09;

public class ShapeApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        fillShapesWithRandomFigures(shapes);

        for (Shape shape:shapes
             ) {
            System.out.println(shape);
            System.out.println("Area= " + shape.getArea());
            System.out.println("Perimeter= " + shape.getPerimeter());

            if(shape instanceof Square){
                Square sq = (Square)shape;
                System.out.println("Side= " + sq.getSide());
            }
            /* if we check "shape instanceof Triangle" before checking "shape instanceof IsoScelesTriangle"
            "Hashcode= " + isoTrg.hashCode() will never be printed.
            Because IsoScelesTriangle is not only the instanceof IsoScelesTriangle but also an instanceof Triangle
            So order matters! */
            else if(shape instanceof IsoScelesTriangle){
                IsoScelesTriangle isoTrg = (IsoScelesTriangle) shape;
                System.out.println("Hashcode= " + isoTrg.hashCode());
            } else if(shape instanceof Triangle){
                Triangle triangle = (Triangle) shape;
                System.out.println("Perpendicular= " + triangle.getPerpendicular());
            }  else if(shape instanceof Circle){
                Circle circle = (Circle) shape;
                System.out.println("Radius= " + circle.getRadius());
            }
            System.out.println();
        }
    }

    public static void fillShapesWithRandomFigures (Shape[] shapes){
        for (int i = 0; i < shapes.length; i++) {
            int randomInt = RandomGenerator.getNextInt(1, 6);
            System.out.println(randomInt);
            shapes[i] = selectRandomFigures(randomInt);
        }
    }

    public static Shape selectRandomFigures(int randomInt){

        switch (randomInt){
            case 1:
                return new Rectangle(RandomGenerator.getNextInt(2, 100), RandomGenerator.getNextInt(2, 100),
                        RandomGenerator.getNextInt(2, 100), RandomGenerator.getNextInt(2, 100));
            case 2:
                return new Square(RandomGenerator.getNextInt(2, 100), RandomGenerator.getNextInt(2, 100),
                        RandomGenerator.getNextInt(2, 100));
            case 3:
                return new Circle(RandomGenerator.getNextInt(2, 100), RandomGenerator.getNextInt(2, 100),
                        RandomGenerator.getNextInt(2, 100));
            case 4:
                return new Triangle(RandomGenerator.getNextInt(2, 100), RandomGenerator.getNextInt(2, 100),
                        RandomGenerator.getNextInt(2, 100), RandomGenerator.getNextInt(2, 100),
                        RandomGenerator.getNextInt(2, 100));
            case 5:
                return new IsoScelesTriangle(RandomGenerator.getNextInt(2, 100), RandomGenerator.getNextInt(2, 100),
                        RandomGenerator.getNextInt(2, 100), RandomGenerator.getNextInt(2, 100));
            default:
                return new Rectangle(RandomGenerator.getNextInt(1, 100), RandomGenerator.getNextInt(1, 100),
                        RandomGenerator.getNextInt(1, 100), RandomGenerator.getNextInt(1, 100));
        }
    }
}
