package be.intecbrussel.exercise10_07;

public class Square extends Rectangle{
    public final String DESCRIPTION =  super.DESCRIPTION + "(Square)";
    private static int count = 0;

    {
        count++;
    }

    public Square(){
        super();
    }

    public Square(int side){
        super(side, side);
    }

    public Square(int side, int x, int y){
        super(side, side, x, y);
    }

    public Square(Square sq){
        super(sq.getSide(), sq.getSide());
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
