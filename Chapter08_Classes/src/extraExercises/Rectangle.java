package extraExercises;

public class Rectangle {
    private int base;
    private int height;
    private int xPos;
    private int yPos;

    public Rectangle(){
//        this.height = 1;
//        this. base = 1;
//        this.xPos = 1;
//        this.yPos = 1;
        // this(1, 1,); // this calls the 2nd contractor and the 2nd calls the 3th constructor
        this(1, 1, 1, 1); // calls the 3th constructor
    }

    public Rectangle(int base, int height){
//        this.base = base;
//        this.height = height;
//        this.xPos = 1;
//        this.yPos = 1;
        this(base, height, 1, 1); // calls the 3th constructor
    }

    public Rectangle(int base, int height, int xPos, int yPos){
        this.base = base;
        this.height = height;
        this.xPos = xPos;
        this.yPos = yPos;
    }


    public void setBase(int newBase){
       // this.base = newBase < 0 ? -newBase : newBase;
        this.base = Math.abs(newBase); // abs ==> absolute value
    }

    public void setHeight(int newHeight){
       // this.height = newHeight < 0 ? -newHeight : newHeight;
        this.height = Math.abs(newHeight);
    }

    public void setPosition(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getBase(){
        return this.base;
    }

    public int getHeight(){
        return this.height;
    }

    public int getXPos(){
        return xPos;
    }

    public int getYPos(){
        return yPos;
    }

    public int[] getPosition(){
        int[] array = new int[]{xPos, yPos};
        return array;
    }

    public int getArea(){
        return base * height;
    }

    public int getPerimeter(){
        return (base + height) * 2;
    }





}
