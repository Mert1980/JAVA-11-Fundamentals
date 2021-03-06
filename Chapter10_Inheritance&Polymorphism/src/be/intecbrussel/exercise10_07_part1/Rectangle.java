package be.intecbrussel.exercise10_07_part1;

public class Rectangle extends Shape{
    public static final int CORNERS;
    public static final int ANGLES = 4;
    private static int count;
    public final String DESCRIPTION = "Rectangle";

    private int height;
    private int width;

    {
        count++;
    }

    static {
        CORNERS = 4;
    }

    public Rectangle(){
        this(1, 1);
    }

    public Rectangle(int height, int width){
        this(height, width, 1, 1);
    }

    public Rectangle(int height, int width, int xPos, int yPos){
        setHeight(height);
        setWidth(width);
        super.setPosition(xPos, yPos);
        count++;
    }

    public Rectangle(Rectangle rectangle){
        this(rectangle.height, rectangle.width, rectangle.getX(), rectangle.getY());
    }

    public int getWidth(){
        return this.width;
    }

    public void setWidth(int width){
        this.width = width < 0 ? -width : width;
    }

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int height){
        this.height = height < 0 ? -height : height;
    }

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
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", xPos=" + super.getX() +
                ", yPos=" + super.getY() +
                '}';
    }
}
