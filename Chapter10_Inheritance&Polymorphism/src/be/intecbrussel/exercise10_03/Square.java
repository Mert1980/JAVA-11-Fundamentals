package be.intecbrussel.exercise10_03;

public class Square extends Rectangle {
    public final String DESCRIPTION =  super.DESCRIPTION + "(Square)";

    public int getSide(){
        return getHeight();
    }

    public void setSide(int side){
        setHeight(side);
        setWidth(side);
    }
}
