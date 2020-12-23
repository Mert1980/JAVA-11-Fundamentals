package be.intecbrussel.exercise07_object_serialization.write_read_file;

import be.intecbrussel.exercise07_object_serialization.drawing.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFile {
    public static void main(String[] args) {
        try(FileOutputStream file = new FileOutputStream("drawing.ser");
            ObjectOutputStream out = new ObjectOutputStream(file)){
            Drawing myDrawing = new Drawing();
            myDrawing.add(new Circle(5, 5, 5));
            myDrawing.add(new Rectangle(10, 20, 1, 1));
            myDrawing.add(new Triangle(10, 20, 20));
            myDrawing.add(new Square(7, 1, 1));
            // write drawing object to file
            out.writeObject(myDrawing);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
