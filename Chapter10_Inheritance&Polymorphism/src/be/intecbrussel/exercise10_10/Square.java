package be.intecbrussel.exercise10_10;

public class Square extends Rectangle {
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

    @Override
    public boolean equals(Object compared){
        // if the variables are located in the same position, they are equal
        if(this == compared){
            return true;
        }
        // if the compared object is not of type Square, the objects are not equal
        if(!(compared instanceof Square)){
            return false;
        }
        // convert the object into a Rectangle object
        Square comparedSquare = (Square) compared;

        // if the values of the object variables are equal, the objects are equal
        if(this.getHeight() == comparedSquare.getHeight() &&
                this.getWidth() == comparedSquare.getWidth() &&
                this.getX() == comparedSquare.getX() &&
                this.getY() == comparedSquare.getY()){
            return true;
        }
        // otherwise the objects are not equal
        return false;
    }

    @Override
    public int hashCode(){
        return super.hashCode() + getSide() * 29+ getSide() * 31;
    }
}
