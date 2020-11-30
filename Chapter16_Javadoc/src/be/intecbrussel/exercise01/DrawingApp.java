package be.intecbrussel.exercise01;

import java.util.Iterator;

public class DrawingApp {
    public static void main(String[] args) {

        Drawing myDrawing = new Drawing();
        myDrawing.add(new Circle(5, 5, 5));
        myDrawing.add(new Rectangle(10, 20, 1, 1));
        myDrawing.add(new Triangle(10, 20, 20));
        myDrawing.add(new Square(7, 1, 1));

        Iterator iterator = myDrawing.new DrawableIterator(); // more simply

        while(iterator.hasNext()){
            try{
                System.out.println(iterator.next());
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        /*for (Object drawable:myDrawing
             ) {
            System.out.println(drawable);
        }*/
    }
}


