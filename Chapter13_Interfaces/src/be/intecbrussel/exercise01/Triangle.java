package be.intecbrussel.exercise01;

public class Triangle extends Shape {
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
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }

    @Override
    public void scale(int factor) {
        setHeight((height * factor) / 100);
        setWidth((width * factor) / 100);
        setPerpendicular((perpendicular * factor) / 100);
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
    public boolean equals(Object compared){
        // if the variables are located in the same position, they are equal
        if(this == compared){
            return true;
        }
        // if the compared object is not of type Triangle, the objects are not equal
        if(!(compared instanceof Triangle)){
            return false;
        }
        // convert the object into a Triangle object
        Triangle comparedTriangle = (Triangle) compared;

        // if the values of the object variables are equal, the objects are equal
        if(this.height == comparedTriangle.height &&
                this.width == comparedTriangle.width &&
                this.perpendicular == comparedTriangle.perpendicular &&
                this.getX() == comparedTriangle.getX() &&
                this.getY() == comparedTriangle.getY()){
            return true;
        }
        // otherwise the objects are not equal
        return false;
    }

    @Override
    public int hashCode(){
        return super.hashCode() + height * 43 + width * 47 + perpendicular * 53;
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
