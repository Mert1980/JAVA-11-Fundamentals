package be.intecbrussel.exercise10_07_part1;

public class ShapeApp {
    public static void main(String[] args) {
        Circle circle1= new Circle(5, 3, 3);
        System.out.println(circle1); // Circle{PI=3.14, radius=5, xPos=3, yPos=3}

        System.out.println();

        Triangle triangle1 = new Triangle(15, 20, 30, 10, 10);
        System.out.println(triangle1); // Triangle{height=20, width=15, perpendicular=30}
        System.out.println();

        Circle circle2 = new Circle(circle1);
        System.out.println(circle2); // Circle{PI=3.14, radius=5, xPos=3, yPos=3}
        System.out.println();

        Shape triangle2 = new Triangle(triangle1);
        System.out.println(triangle2);

        Shape triangle3 = new Triangle(6, 4, 3);
        System.out.println(triangle3.getPerimeter()); // prints 16
        System.out.println();

        Shape isoScTr = new IsoScelesTriangle(6, 4);
        System.out.println(isoScTr.getPerimeter());
        System.out.println();

        // counters
        System.out.println("Shape: " + Shape.getCount()); // Shape: 6
        System.out.println("Circle: " + Circle.getCount()); // Circle: 2
        System.out.println("Rectangle: " + Rectangle.getCount()); // Rectangle: 0
        System.out.println("Square: " + Square.getCount()); // Square: 0
        System.out.println("Triangle: " + Triangle.getCount()); // Triangle: 4
        System.out.println("IsoScelesTriangle: " + IsoScelesTriangle.getCount()); // IsoScelesTriangle: 1

    }
}
