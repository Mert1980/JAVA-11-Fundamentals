package be.intecbrussel.exercise04_iterator;

import java.util.Arrays;
import java.util.Iterator;

public class Drawing implements Drawable, Iterable{
    private Drawable[] drawables;
    private int size; // holds the number of saved figures

    public Drawing(){
        this.drawables = new Drawable[5];
        this.size = 0;
    }

    @Override
    public Iterator iterator() {
        return new DrawableIterator();
    }

    class DrawableIterator implements Iterator {
        private int index = -1;

        @Override
        public boolean hasNext() {
            for (int i = index +1; i < getDrawables().length; i++) {
                if(drawables[i] != null){
                    index = i;
                    return true;
                }
            }
            return false;
        }

        @Override
        public Object next() {
            return getDrawables()[index];
        }
    }

    // getters
    public Drawable[] getDrawables() {
        return drawables;
    }

    public int getSize() {
        return size;
    }

    public void add(Drawable shape){
        if(isPresent(shape)){
            System.out.println(shape + " is already in the drawing. Try another one!");
            return;
        }
        int index = getFreeLocation();
        // if array is not full, add shape
        if(index != -1){
            this.drawables[index] = shape;
            this.size++;
        }
        // else if array is full increase the size of the array and add shape
        if(index == -1){
            this.drawables = Arrays.copyOf(this.drawables, this.drawables.length + size);
            index = getFreeLocation();
            this.drawables[index] = shape;
            this.size++;
        }
    }

    private boolean isPresent(Drawable shape){
        return findIndexOfShape(shape) != -1;
    }

    private int findIndexOfShape(Drawable shape){
        for (int i = 0; i < this.drawables.length; i++) {
            if(this.drawables[i] != null && this.drawables[i].equals(shape)){
                return i;
            }
        }
        return -1;
    }

    private int getFreeLocation(){
        for (int i = 0; i < this.drawables.length; i++) {
            if(this.drawables[i] == null){
                return i;
            }
        }
        return -1;
    }

    public void remove(Drawable shape){
        int index = findIndexOfShape(shape);
        this.drawables[index] = null;

        // move the last shape to the index of removed
        adjustArray(index);
        this.size--;
    }

    public void adjustArray(int index){
        // start loop from the index of the removed shape
        for (int i = index+1; i < this.drawables.length; i++) {
            // if the array is full, move the last shape to the index of removed shape
            if(this.drawables[this.drawables.length -1] != null){
                this.drawables[index] = this.drawables[this.drawables.length -1];
                this.drawables[this.drawables.length -1] = null;
                break;
            }
            // if the array is not full move the last non-null shape to the index of removed shape
            if(this.drawables[i] == null){
                // the index of the last shape is one index before the first null object
                this.drawables[index] = this.drawables[i-1];
                this.drawables[i-1] = null;
                break;
            }
        }
    }

    public void clear(){
        Arrays.fill(this.drawables, null);
        this.size = 0;
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
                "shapes=" + Arrays.toString(drawables) +
                ", size=" + size +
                ", length=" + this.drawables.length +
                '}';
    }


}
