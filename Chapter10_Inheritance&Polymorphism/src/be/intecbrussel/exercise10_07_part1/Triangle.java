package be.intecbrussel.exercise10_07_part1;

public class Triangle extends Shape{
    public static final int ANGLES = 3;
    private static int count;
    private int height;
    private int width;
    private int perpendicular;

    public Triangle(){
        this(1, 1, 1, 1, 1);
    }

    public Triangle(int w, int h, int p){
        this(w, h, p, 1, 1);
    }

    public Triangle(int w, int h, int p, int x, int y){
        this.width = w;
        this.height = h;
        this.perpendicular = p;
        super.setPosition(x, y);
        count++;
    }

    public Triangle(Triangle triangle){
        this(triangle.getWidth(), triangle.getHeight(), triangle.getPerpendicular(), triangle.getX(), triangle.getY());
    }

    public void setWidth(int w){
        this.width = w;
    }

    public int getWidth(){
        return this.width;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public int getHeight(){
        return this.height;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    @Override
    public double getArea() {
        return 1.0 * this.height * this.width / 2;
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow(this.width-this.perpendicular,2) + Math.pow(this.height, 2)) +
                Math.sqrt(Math.pow(this.perpendicular,2) + Math.pow(this.height, 2)) + this.width;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", perpendicular=" + perpendicular +
                ", xPos=" + this.getX() +
                ", yPos=" + this.getY() +
                '}';
    }
}
