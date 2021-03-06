package be.intecbrussel.exercise10_05;

public class Square extends Rectangle {
    public final String DESCRIPTION =  super.DESCRIPTION + "(Square)";

    public Square(){
        super();
    }

    public Square(int side){
        super(side, side);
    }

    public Square(int side, int x, int y){
        super(side, x, y);
    }

    public Square(Square sq){
        super(sq.getSide());
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
