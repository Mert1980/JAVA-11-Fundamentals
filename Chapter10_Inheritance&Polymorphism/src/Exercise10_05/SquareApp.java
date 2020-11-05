package Exercise10_05;

public class SquareApp {
    public static void main(String[] args) {
        Square sq1 = new Square();
        Square sq2 = new Square(5);
        Square sq3 = new Square(7, 3, 3);
        Square sq4 = new Square(new Square(8));

        System.out.println(sq1); // Rectangle{height=1, width=1, xPos=1, yPos=1}
        System.out.println();

        System.out.println(sq2); // Rectangle{height=5, width=5, xPos=1, yPos=1}
        System.out.println();

        System.out.println(sq3); // Rectangle{height=7, width=7, xPos=3, yPos=3}
        System.out.println();

        System.out.println(sq4); // Rectangle{height=8, width=1, xPos=1, yPos=1}
    }
}
