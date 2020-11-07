package be.intecbrussel.exercise10_06;

public class SquareApp {

    public static void main(String[] args) {

        Square square = new Square();
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Square();

        System.out.println(rect1.getCount()); // prints 3
        System.out.println(rect2.getCount()); // prints 3
        System.out.println(square.getCount());// prints 2

        System.out.println(Rectangle.getCount()); // prints 3
        System.out.println(Square.getCount()); // prints 2
    }
}
