package be.intecbrussel.exercise06_object_serialization;

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
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
