package be.intecbrussel.exercise09_collections_of_figures;

public class Circle extends Shape {
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
        setRadius(radius);
        super.setPosition(xPos, yPos);
    }

    public Circle(Circle circle){
        this(circle.getRadius(), circle.getX(), circle.getY());
    }

    // setters
    public void setRadius(int radius) throws NegativeSizeException {
        if(radius < 0 ) throw new NegativeSizeException("Negative radius");
        else this.radius = radius;
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
    public boolean equals(Object compared){
        // if the variables are located in the same position, they are equal
        if(this == compared){
            return true;
        }
        // if the compared object is not of type Circle, the objects are not equal
        if(!(compared instanceof Circle)){
            return false;
        }
        // convert the object into a Circle object
        Circle comparedCircle = (Circle) compared;

        // if the values of the object variables are equal, the objects are equal
        if(this.radius == comparedCircle.radius &&
           this.getX() == comparedCircle.getX() &&
           this.getY() == comparedCircle.getY()){
           return true;
        }
        // otherwise the objects are not equal
        return false;
    }

    @Override
    public int hashCode(){
        return super.hashCode() + radius * 37 + radius * 41;
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

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);

    }

    @Override
    public void scale(int factor) {
        setRadius((radius * factor) / 100);
    }

    @Override
    public void scaleDouble() {
        scale(DOUBLE);
    }

    @Override
    public void scaleHalf() {
        scale(HALF);
    }
}
