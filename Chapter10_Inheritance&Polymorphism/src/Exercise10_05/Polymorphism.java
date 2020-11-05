package Exercise10_05;

public class Polymorphism {
    public static void main(String[] args) {
        Rectangle rect = new Square();
        //rect = new Rectangle();
        System.out.println(rect.getHeight());

        rect.setWidth(5);
        System.out.println(rect.getHeight());


    }
}
