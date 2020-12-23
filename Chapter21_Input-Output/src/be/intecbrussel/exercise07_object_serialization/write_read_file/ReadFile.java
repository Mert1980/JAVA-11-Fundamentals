package be.intecbrussel.exercise07_object_serialization.write_read_file;

import be.intecbrussel.exercise07_object_serialization.drawing.Drawing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFile {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("drawing.ser");
             ObjectInputStream in = new ObjectInputStream(file)) {
            // read Drawing object from file
            Drawing drawing = (Drawing) in.readObject();
            for (Object o : drawing) {
                System.out.println(o);
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException cnfe){
            System.out.println(cnfe.getException());
        }
    }
}
