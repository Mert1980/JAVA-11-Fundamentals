package be.intecbrussel.exercise10_03;

public class SquareApp {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setSide(10);
        System.out.println(sq.getArea()); // prints 100
        System.out.println(sq.getPerimeter()); // prints 40

        sq.setSide(-15);
        System.out.println(sq.getArea()); // prints 225
        System.out.println(sq.getPerimeter()); // prints 60
    }
}
