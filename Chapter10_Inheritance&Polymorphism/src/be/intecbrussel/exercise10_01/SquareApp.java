package be.intecbrussel.exercise10_01;

public class SquareApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        System.out.println(square); // prints: Rectangle{height=1, width=1, xPos=1, yPos=1};

        System.out.println(rectangle.DESCRIPTION);// prints: Rectangle
        System.out.println(square.DESCRIPTION); // prints: Rectangle(Square)

        Square sq = new Square();
        System.out.println(sq.getArea()); // prints 1
        System.out.println(sq.getPerimeter()); // prints 4
    }
}
