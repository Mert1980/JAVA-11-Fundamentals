package be.intecbrussel.exercise09_collections_of_figures;

import java.util.*;

public class Drawing extends RuntimeException implements Drawable {
    private Collection<Drawable> drawables;

    public Drawing(){
        this.drawables = new ArrayList<>();
    }

    // getters
    public Collection<Drawable> getDrawables() {
        return drawables;
    }

    public int getSize() {
        return drawables.size();
    }

    public void add(Drawable shape){
        this.drawables.add(shape);
    }


    public void remove(Drawable shape){
        this.drawables.remove(shape);
    }

    public void clear(){
        this.drawables.removeAll(drawables);
    }

    public void removeAtIndex(int index){
        this.drawables.remove(index);
    }

    @Override
    public void draw(DrawingContext dc) {
        for(Drawable drawable:drawables){
            if(drawable != null){
                drawable.draw(dc);
            }
        }
    }

    @Override
    public void scale(int factor) {
        for(Drawable drawable:drawables){
            if(drawable != null){
                drawable.scale(factor);
            }
        }
    }

    @Override
    public String toString() {
        return "Drawing{" +
                "shapes=" + drawables.toString() +
                ", size=" + this.drawables.size() +
                '}';
    }


}
