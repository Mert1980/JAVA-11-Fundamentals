package Exercise08_08;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 15);

        System.out.println("rect1: ");
        System.out.println("Height = " + rectangle.getHeight());
        System.out.println("Width = " + rectangle.getWidth());

        System.out.println("rect2");
        Rectangle rect2 = new Rectangle(1, 2, 3, 4);
        System.out.println("Height = " + rect2.getHeight());
        System.out.println("Width = " + rect2.getWidth());
        System.out.println("xPos = " + rect2.getX());
        System.out.println("yPos = " + rect2.getY());

        System.out.println("rect3: ");
        Rectangle rect3 = new Rectangle(rectangle);
        System.out.println("Height = " + rect3.getHeight());
        System.out.println("Width = " + rect3.getWidth());
        System.out.println("xPos = " + rect3.getX());
        System.out.println("yPos = " + rect3.getY());

        System.out.println("rect4");
        Rectangle rect4 = new Rectangle();
        System.out.println("Height = " + rect4.getHeight());
        System.out.println("Width = " + rect4.getWidth());
        System.out.println("xPos = " + rect4.getX());
        System.out.println("yPos = " + rect4.getY());

    }
}
