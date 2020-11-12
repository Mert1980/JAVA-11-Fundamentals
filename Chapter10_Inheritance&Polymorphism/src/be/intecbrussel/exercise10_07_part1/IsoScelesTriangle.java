package be.intecbrussel.exercise10_07_part1;

public class IsoScelesTriangle extends Triangle{
    private static int count;

    public IsoScelesTriangle(){
        this(1, 1, 1, 1);
    }

    public IsoScelesTriangle(int w, int h){
        super(h, w, w/2);
    }

    public IsoScelesTriangle(int w, int h, int x, int y){
        super(h, w, w/2, x, y);
        count++;
    }

    public IsoScelesTriangle(IsoScelesTriangle triangle){
        super(triangle);
    }

    @Override
    public void setWidth(int w) {
        super.setWidth(w);
        super.setPerpendicular(w/2);
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
        this.setWidth(perpendicular * 2);
    }

    public static int getCount() {
        return count;
    }
}
