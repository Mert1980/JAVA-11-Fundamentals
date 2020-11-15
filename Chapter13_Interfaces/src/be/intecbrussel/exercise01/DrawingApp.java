package be.intecbrussel.exercise01;

public class DrawingApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(40, 80);
        System.out.println(rectangle); // Rectangle{height=40, width=80, xPos=1, yPos=1}

        rectangle.scale(Scaleable.HALF);
        System.out.println(rectangle); // Rectangle{height=20, width=40, xPos=1, yPos=1}
    }
}
