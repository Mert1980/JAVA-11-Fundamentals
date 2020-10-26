package Exercise08_09;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println(rect.toString());
        System.out.println(Rectangle.CORNERS);

        Rectangle rect2 = new Rectangle();
        System.out.println(Rectangle.count);
    }
}
