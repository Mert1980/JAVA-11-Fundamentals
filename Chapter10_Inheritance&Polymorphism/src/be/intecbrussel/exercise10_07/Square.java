package be.intecbrussel.exercise10_07;

public class Square extends Rectangle{
    public final String DESCRIPTION =  super.DESCRIPTION + "(Square)";
    private static int count = 0;

    {
        count++;
    }

    public Square(){
        this(1, 1, 1);
    }

    public Square(int side){
        this(side, 1, 1);
    }

    public Square(int side, int x, int y){
        this.setSide(side);
        this.setX(x);
        this.setY(y);
        count++;
    }

    public Square(Square sq){
        this(sq.getSide(), sq.getX(), sq.getY());
    }

    public static int getCount(){
        return count;
    }

    public int getSide(){
        return getHeight();
    }

    public void setSide(int side){
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setHeight(int height){
        setSide(height);
    }

    @Override
    public void setWidth(int width){
        setSide(width);
    }
}
