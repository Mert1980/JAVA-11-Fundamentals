package Exercise08_12;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle(1, 1, 1);

        System.out.println(Circle.getCounter());
    }
}
