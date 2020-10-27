package Exercise08_09;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println(rect.toString());
        System.out.println(Rectangle.CORNERS);
        System.out.println(Rectangle.count);

        Rectangle rect2 = new Rectangle();
        System.out.println(Rectangle.count);

        Rectangle rect3 = new Rectangle();
        System.out.println(Rectangle.count);
    }
}
