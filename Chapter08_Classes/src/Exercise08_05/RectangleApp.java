package Exercise08_05;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setHeight(10);
        rectangle.setWidth(15);
        rectangle.setPosition(10, 10);

        int area = rectangle.getArea();
        System.out.println("The area of the the rectangle is: " + area);

        int perimeter = rectangle.getPerimeter();
        System.out.println("There perimeter of the rectangle is " + perimeter);

        rectangle.setHeight(45);
        rectangle.setWidth(35);
        System.out.println("Height = " + rectangle.getHeight());
        System.out.println("Width = " + rectangle.getWidth());

        rectangle.grow(5);
        System.out.println("Height = " + rectangle.getHeight());
        System.out.println("Width = " + rectangle.getWidth());
    }
}
