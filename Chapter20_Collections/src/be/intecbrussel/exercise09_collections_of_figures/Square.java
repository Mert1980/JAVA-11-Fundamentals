package be.intecbrussel.exercise09_collections_of_figures;

/** This class is square in a two dimensional area.
 * This class can be used the following way:
 * <pre>
 *     Square sq = new Square(5);
 * </pre>
 * @author Mert Demirok
 * @version 1.0
 * @see Rectangle
 */
public class Square extends Rectangle {
    /** Description of the shape */
    public final String DESCRIPTION =  super.DESCRIPTION + "(Square)";
    /** The number of instances */
    private static int count = 0;

    {
        count++;
    }

    public Square(){
        this(1, 1, 1);
    }

    public Square(int side) throws NegativeSizeException {
        this(side, 1, 1);
    }

    /**
     * This constructor creates a square with specified side.
     * @param side The initial side of the square
     * @param x The x position of the square
     * @param y The y position of the square
     * @throws NegativeSizeException The side is negative.
     */
    public Square(int side, int x, int y) throws NegativeSizeException{
        this.setSide(side);
        this.setX(x);
        this.setY(y);
        count++;
    }

    public Square(Square sq) throws NegativeSizeException{
        this(sq.getSide(), sq.getX(), sq.getY());
    }

    public static int getCount(){
        return count;
    }

    /** Returns the side of the square.
     * The side of the square can be set using
     * {@link Square#setSide(int)}.
     * @return The side of the square.
     * @see Square#setSide(int)
     */
    public int getSide(){
        return getHeight();
    }

    public void setSide(int side) throws NegativeSizeException{
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setHeight(int height) throws NegativeSizeException{
        if(height < 0 ) throw new NegativeSizeException("Negative height");
        setSide(height);
    }

    @Override
    public void setWidth(int width) throws NegativeSizeException{
        if(width < 0 ) throw new NegativeSizeException("Negative width");
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
