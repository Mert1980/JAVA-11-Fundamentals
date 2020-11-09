package be.intecbrussel.exercise10_09;

public class ShapeApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        fillShapesWithRandomFigures(shapes);

        for (Shape shape:shapes
             ) {
            System.out.println(shape);
        }
    }

    public static void fillShapesWithRandomFigures (Shape[] shapes){
        for (int i = 0; i < shapes.length; i++) {
            int randomInt = RandomGenerator.getNextInt(1, 5);
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
