package be.intecbrussel.exercise10_08;

public class IsoScelesTriangle extends Triangle {
    private static int count;

    public IsoScelesTriangle(){
        this(1, 1, 1, 1);
    }

    public IsoScelesTriangle(int w, int h){
        this(w, h, 1, 1);
    }

    public IsoScelesTriangle(int w, int h, int x, int y){
        this.setWidth(w);
        super.setHeight(h);
        super.setPosition(x, y);
        count++;
    }

    public IsoScelesTriangle(IsoScelesTriangle triangle){
        this(triangle.getWidth(), triangle.getHeight(), triangle.getX(), triangle.getY());
    }

    @Override
    public void setWidth(int w) {
        super.setWidth(w);
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object compared){
        // if the variables are located in the same position, they are equal
        if(this == compared){
            return true;
        }
        // if the compared object is not of type IsoScelesTriangle, the objects are not equal
        if(!(compared instanceof IsoScelesTriangle)){
            return false;
        }
        // convert the object into a IsoScelesTriangle object
        IsoScelesTriangle comparedIsoScelesTriangle = (IsoScelesTriangle) compared;

        // if the values of the object variables are equal, the objects are equal
        if(this.getHeight() == comparedIsoScelesTriangle.getHeight() &&
           this.getWidth() == comparedIsoScelesTriangle.getWidth() &&
           this.getPerpendicular() == comparedIsoScelesTriangle.getPerpendicular() &&
           this.getX() == comparedIsoScelesTriangle.getX() &&
           this.getY() == comparedIsoScelesTriangle.getY()){
           return true;
        }
        // otherwise the objects are not equal
        return false;
    }

    @Override
    public int hashCode(){
        return super.hashCode() + getHeight() * 59 + getWidth() * 61 + getPerpendicular() * 67;
    }
}
