package be.intecbrussel.exercise10_10;

import java.util.Arrays;

public class Drawing {
    private Shape[] shapes;
    private int size; // holds the number of saved figures

    public Drawing(){
        this.shapes = new Shape[10];
        this.size = 0;
    }

    public void add(Shape shape){
        if(isPresent(shape)){
            System.out.println(shape + " is already in the drawing. Try another one!");
            return;
        }
        int index = getFreeLocation();
        this.shapes[index] = shape;
        this.size++;
    }

    private boolean isPresent(Shape shape){
        for (int i = 0; i < this.shapes.length; i++) {
                if(this.shapes[i] != null && this.shapes[i].equals(shape)){
                    return true;
                }
            }
        return false;
    }

    private int getFreeLocation(){
        int freeLocation = 0;
        for (int i = 0; i < this.shapes.length; i++) {
            if(this.shapes[i] == null){
                freeLocation = i;
                return freeLocation;
            }
        }
        return freeLocation;
    }

    public void remove(Shape shape){
        int index = findIndexOfShape(shape);
        this.shapes[index] = null;

        // if the removed shape is not at the end of the array, move the last shape to the index of removed
        adjustArray(index);
        this.size--;
    }

    private int findIndexOfShape(Shape shape){
        for (int i = 0; i < this.shapes.length; i++) {
            if(this.shapes[i] != null && this.shapes[i].equals(shape)){
                return i;
            }
        }
        return -1;
    }

    public void adjustArray(int index){
        // start loop from the index of the removed shape
        for (int i = index+1; i < this.shapes.length; i++) {
            if(this.shapes[i] == null){
                // the index of the last shape is one index before the first null object
                this.shapes[index] = this.shapes[i-1];
                break;
            }
        }
    }

    public void clear(){
        int index = 0;
        while(this.shapes[index] != null){
            this.shapes[index] = null;
            index+=1;
        }
        this.size = 0;
    }

    @Override
    public String toString() {
        return "Drawing{" +
                "shapes=" + Arrays.toString(shapes) +
                ", size=" + size +
                '}';
    }
}
