package Exercise08_05;

public class Rectangle {
    private int height;
    private int width;
    private int xPos;
    private int yPos;

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
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
        this.height+=d;
        this.width+=d;
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
