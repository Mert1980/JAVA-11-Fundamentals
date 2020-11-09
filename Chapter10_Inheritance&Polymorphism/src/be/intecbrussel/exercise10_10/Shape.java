package be.intecbrussel.exercise10_10;

public abstract class Shape {
    private int xPos;
    private int yPos;
    private static int count = 0;

    public Shape(){
        this(1, 1);
    }

    public Shape(int x, int y){
        this.xPos = x;
        this.yPos = y;
        count++;
    }

    public int getX(){
        return this.xPos;
    }

    public void setX (int x){
        this.xPos = x;
    }

    public int getY(){
        return this.yPos;
    }

    public void setY(int y){
        this.yPos = y;
    }

    public void setPosition(int x , int y){
        this.xPos = x;
        this.yPos = y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public boolean equals(Object compared){
        // if the variables are located in the same position, they are equal
        if(this == compared){
            return true;
        }
        // if the compared object is not of type Shape, the objects are not equal
        if(!(compared instanceof Shape)){
            return false;
        }
        // convert the object into a Rectangle object
        Shape comparedShape = (Shape) compared;

        // if the values of the object variables are equal, the objects are equal
        if(this.xPos == comparedShape.getX() &&
           this.yPos == comparedShape.getY()){
            return true;
        }
        // otherwise the objects are not equal
        return false;
    };

    @Override
    public int hashCode(){
        return xPos * 7 + yPos * 13;
    }

    public static int getCount(){
        return count;
    }
}
