package be.intecbrussel.exercise10_10;

import java.util.Arrays;

public class Drawing {
    private Shape[] shapes;
    private int size; // holds the number of saved figures

    public Drawing(){
        this.shapes = new Shape[5];
        this.size = 0;
    }

    // getter
    public int getSize() {
        return size;
    }

    public void add(Shape shape){
        if(isPresent(shape)){
            System.out.println(shape + " is already in the drawing. Try another one!");
            return;
        }
        int index = getFreeLocation();
        // if array is not full, add shape
        if(index != -1){
            this.shapes[index] = shape;
            this.size++;
        }
        // else if array is full increase the size of the array and add shape
        if(index == -1){
            this.shapes = Arrays.copyOf(this.shapes, this.shapes.length + size);
            index = getFreeLocation();
            this.shapes[index] = shape;
            this.size++;
        }
    }

    private boolean isPresent(Shape shape){
        return findIndexOfShape(shape) != -1;
    }

    private int findIndexOfShape(Shape shape){
        for (int i = 0; i < this.shapes.length; i++) {
            if(this.shapes[i] != null && this.shapes[i].equals(shape)){
                return i;
            }
        }
        return -1;
    }

    private int getFreeLocation(){
        for (int i = 0; i < this.shapes.length; i++) {
            if(this.shapes[i] == null){
                return i;
            }
        }
        return -1;
    }

    public void remove(Shape shape){
        int index = findIndexOfShape(shape);
        this.shapes[index] = null;

        // move the last shape to the index of removed
        adjustArray(index);
        this.size--;
    }

    public void adjustArray(int index){
        // start loop from the index of the removed shape
        for (int i = index+1; i < this.shapes.length; i++) {
            // if the array is full, move the last shape to the index of removed shape
            if(this.shapes[this.shapes.length -1] != null){
                this.shapes[index] = this.shapes[this.shapes.length -1];
                this.shapes[this.shapes.length -1] = null;
                break;
            }
            // if the array is not full move the last non-null shape to the index of removed shape
            if(this.shapes[i] == null){
                // the index of the last shape is one index before the first null object
                this.shapes[index] = this.shapes[i-1];
                this.shapes[i-1] = null;
                break;
            }
        }
    }

    public void clear(){
        Arrays.fill(this.shapes, null);
        this.size = 0;
    }

    @Override
    public String toString() {
        return "Drawing{" +
                "shapes=" + Arrays.toString(shapes) +
                ", size=" + size +
                ", length=" + this.shapes.length +
                '}';
    }
}
