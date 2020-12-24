package be.intecbrussel.exercise09_adjusting_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public class Maternity implements Serializable {
    public static void main(String[] args) {
        try(FileOutputStream file = new FileOutputStream("mert.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);){
            Person person = new Person("Mert", "Demirok", LocalDate.of(2000, 3, 5));
            out.writeObject(person);
            System.in.read(); // writes "*" on the console until pressing enter
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
