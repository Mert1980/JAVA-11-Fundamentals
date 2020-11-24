package be.intecbrussel.exercise06;

public class Rectangle extends Shape implements Scaleable{
    private int height;
    private int width;
    public static final int CORNERS;
    private static int count;
    public final String DESCRIPTION = "Rectangle";

    {
        count++;
    }

    static {
        CORNERS = 4;
    }
    // CONSTRUCTORS
    public Rectangle(){
        this(1, 1);
    }

    public Rectangle(int height, int width){
        this(height, width, 1, 1);
    }

    public Rectangle(int height, int width, int xPos, int yPos){
        this.height = height;
        this.width = width;
        super.setPosition(xPos, yPos);
        count++;
    }

    public Rectangle(Rectangle rectangle){
        this(rectangle.height, rectangle.width, rectangle.getX(), rectangle.getY());
    }

    // GETTERS
    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    // SETTERS
    public void setWidth(int width){
        this.width = width < 0 ? -width : width;
    }

    public void setHeight(int height){
        this.height = height < 0 ? -height : height;
    }

    // METHODS
    public double getArea(){
        return height * width;
    }

    public double getPerimeter(){
        return (width + height)*2;
    }

    public void grow(int d){
        this.height = this.height + Math.abs(d);
        this.width = this.width + Math.abs(d);
    }

    public static int getCount(){
        return count;
    }

    @Override
    public void scale(int factor) {
        setHeight((height * factor) / 100);
        setWidth((width * factor) / 100);
    }

    @Override
    public void scaleDouble() {
        scale(DOUBLE);
    }

    @Override
    public void scaleHalf() {
        scale(HALF);
    }

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }

    @Override
    public boolean equals(Object compared){
        // if the variables are located in the same position, they are equal
        if(this == compared){
            return true;
        }
        // if the compared object is not of type Rectangle, the objects are not equal
        if(!(compared instanceof Rectangle)){
            return false;
        }
        // convert the object into a Rectangle object
        Rectangle comparedRectangle = (Rectangle) compared;

        // if the values of the object variables are equal, the objects are equal
        if(this.height == comparedRectangle.height &&
           this.width == comparedRectangle.width &&
           this.getX() == comparedRectangle.getX() &&
           this.getY() == comparedRectangle.getY()){
            return true;
        }
        // otherwise the objects are not equal
        return false;
    }

    @Override
    public int hashCode(){
        return super.hashCode() + height * 17 + width * 23;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", xPos=" + super.getX() +
                ", yPos=" + super.getY() +
                '}';
    }


}
