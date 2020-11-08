package be.intecbrussel.exercise10_08;

public class ShapeApp {
    public static void main(String[] args) {
        Circle circle = new Circle(5, 3, 3);
        Rectangle rectangle = new Rectangle(15, 20, 5, 5);
        Square square = new Square(4, 6, 6);
        Triangle triangle = new Triangle(10, 20, 5, 7, 7);
        IsoScelesTriangle isoScelesTriangle = new IsoScelesTriangle(20, 20, 3, 3);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(triangle);
        System.out.println(isoScelesTriangle);
        System.out.println(Shape.getCount()); // prints 5
        System.out.println();

        Circle circle2 = new Circle(5, 3, 3);
        Rectangle rectangle2 = new Rectangle(15, 20, 5, 5);
        Square square2 = new Square(4, 6, 6);
        Triangle triangle2 = new Triangle(10, 20, 5, 7, 7);
        IsoScelesTriangle isoScelesTriangle2 = new IsoScelesTriangle(20, 20, 3, 3);

        System.out.println();
        System.out.println(circle.equals(circle2)); // true
        System.out.println(rectangle.equals(rectangle2)); // true
        System.out.println(square.equals(square2)); // true
        System.out.println(rectangle.equals(rectangle)); // true
        System.out.println(isoScelesTriangle.equals(isoScelesTriangle2)); // true

        System.out.println();
        /*circle2.setRadius(6);
        System.out.println(circle.equals(circle2)); // false*/

        // before overriding hasCode() method
        System.out.println(circle.hashCode()); // 2081303229
        System.out.println(circle2.hashCode()); // 1223685984

        // after overriding hasCode() method
        System.out.println(circle.hashCode()); // 450
        System.out.println(circle2.hashCode()); // 450

    }
}
