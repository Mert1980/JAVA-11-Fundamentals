package be.intecbrussel.exercise10_05;

public class SquareApp {
    public static void main(String[] args) {
        Rectangle sq1 = new Square();
        Rectangle sq2 = new Square(5);
        Rectangle sq3 = new Square(7, 3, 3);
        Rectangle sq4 = new Square(new Square(8));

        System.out.println(sq1); // Rectangle{height=1, width=1, xPos=1, yPos=1}
        System.out.println();

        System.out.println(sq2); // Rectangle{height=5, width=5, xPos=1, yPos=1}
        System.out.println();

        System.out.println(sq3); // Rectangle{height=7, width=7, xPos=3, yPos=3}
        System.out.println();

        System.out.println(sq4); // Rectangle{height=8, width=1, xPos=1, yPos=1}
        System.out.println(Square.CORNERS); // prints 4
        System.out.println(Square.getCount());// prints 5
    }
}
