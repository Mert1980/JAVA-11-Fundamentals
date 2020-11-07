package be.intecbrussel.exercise10_04;

public class SquareApp {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setHeight(5);
        sq.setWidth(5);

        System.out.println(sq.getArea()); // prints 25
    }


}
