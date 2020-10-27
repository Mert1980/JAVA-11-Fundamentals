package Exercise08_12;

public class Circle {
    final double PI = 3.14;
    private int radius;
    private int xPos;
    private int yPos;
    private static int counter;

    // constructors
    static {
        counter = 0;
    }

    public Circle(){
        this(1);

    }

    public Circle(int radius){
        this(radius, 1, 1);
    }

    public Circle(int radius, int xPos, int yPos){
        this.radius = radius;
        this.xPos = xPos;
        this.yPos = yPos;
        counter++;
    }

    // setters
    public void setRadius(int radius){
        this.radius = radius;
    }

    // getters
    public int getRadius(){
        return this.radius;
    }

    public double getArea(int radius){
        return radius * radius * PI;
    }

    public double getPerimeter(int radius){
        return 2 * PI * radius;
    }

    public static int getCounter(){
        return counter;
    }

}
