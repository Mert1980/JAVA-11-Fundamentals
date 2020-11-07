package be.intecbrussel.exercise08_03;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.height = 10;
        rect1.width = 8;
        rect1.xPos = 15;
        rect1.yPos = 15;

        Rectangle rect2 = new Rectangle();

        rect2.height = 5;
        rect2.width = 3;
        rect2.xPos = 20;
        rect2.yPos = 20;

        System.out.println(rect1.height);
        System.out.println(rect1.width);
        System.out.println(rect1.xPos);
        System.out.println(rect1.yPos);

        System.out.println();

        System.out.println(rect2.height);
        System.out.println(rect2.width);
        System.out.println(rect2.xPos);
        System.out.println(rect2.yPos);
    }
}
