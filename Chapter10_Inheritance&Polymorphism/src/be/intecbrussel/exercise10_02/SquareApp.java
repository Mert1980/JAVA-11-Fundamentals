package be.intecbrussel.exercise10_02;

public class SquareApp {
    public static void main(String[] args) {
        Square sq = new Square();
        System.out.println(sq.getArea()); // prints 1
        System.out.println(sq.getPerimeter()); // prints 4

        sq.setHeight(5);
        sq.setWidth(5);
        System.out.println(sq.getArea()); // prints 25
        System.out.println(sq.getPerimeter()); // prints 20

        sq.setPosition(3, 3);
        System.out.println(sq.getX()); // prints 3
        System.out.println(sq.getY()); // prints 3
        System.out.println(Square.getCount()); // prints 1
    }
}
