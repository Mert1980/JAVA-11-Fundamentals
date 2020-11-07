package be.intecbrussel.exercise08_07;

public class Rectangle {
    private int height;
    private int width;
    private int xPos;
    private int yPos;

    public Rectangle(){
    }

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public Rectangle(int height, int width, int xPos, int yPos){
        this.height = height;
        this.width = width;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Rectangle(Rectangle rectangle){
       // this(this.height, this.width, this.xPos, this.yPos); // copy constructor
        this.height = rectangle.height;
        this.width = rectangle.width;
        this.xPos = rectangle.xPos;
        this.yPos = rectangle.yPos;
    }


    public void setHeight(int height){
        this.height = height < 0 ? -height : height;
    }

    public void setWidth(int width){
        this.width = width < 0 ? -width : width;
    }

    public void setPosition(int x , int y){
        this.xPos = x;
        this.yPos = y;
    }

    public void setXPos (int x){
        this.xPos = x;
    }

    public void setYPos (int y){
        this.yPos = y;
    }

    public void grow(int d){
        this.height = this.height + Math.abs(d);
        this.width = this.width + Math.abs(d);
    }

    public int getArea(){
        return height * width;
    }

    public int getPerimeter(){
        return (width + height)*2;
    }

    public int getHeight(){
        return this.height;
    }

    public int getWidth(){
        return this.width;
    }

    public int getX(){
        return this.xPos;
    }

    public int getY(){
        return this.yPos;
    }
}
