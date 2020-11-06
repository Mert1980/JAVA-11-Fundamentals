package Exercise10_07;

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

    public static int getCount(){
        return count;
    }
}
