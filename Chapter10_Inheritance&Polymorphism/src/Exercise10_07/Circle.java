package Exercise10_07;

public class Circle extends Shape{
    private final double PI = 3.14;
    private int radius;
    private static int counter;

    // constructors
    {
        counter++;
    }

    public Circle(){
        this(1);
    }

    public Circle(int radius){
        this(radius, 1, 1);
    }

    public Circle(int radius, int xPos, int yPos){
        this.radius = radius;
        super.setPosition(xPos, yPos);
    }

    public Circle(Circle circle){
        this(circle.getRadius());
    }

    // setters
    public void setRadius(int radius){
        this.radius = radius;
    }

    // getters
    public int getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius * this.radius * PI;
    }

    public double getPerimeter(){
        return 2 * PI * this.radius;
    }

    public static int getCounter(){
        return counter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                ", xPos=" + super.getX() +
                ", yPos=" + super.getY() +
                '}';
    }
}
