package be.intecbrussel.exercise10_07_part1;

public class Circle extends Shape{
    public static final int ANGLES = 0;
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
        this(circle.getRadius(), circle.getX(), circle.getY());
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

    public void grow(int d){
        this.radius = this.radius + Math.abs(d);
    }

    public static int getCount(){
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
