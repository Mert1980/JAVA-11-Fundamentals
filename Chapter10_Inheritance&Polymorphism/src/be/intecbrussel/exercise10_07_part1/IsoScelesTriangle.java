package be.intecbrussel.exercise10_07_part1;

public class IsoScelesTriangle extends Triangle{
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
}
