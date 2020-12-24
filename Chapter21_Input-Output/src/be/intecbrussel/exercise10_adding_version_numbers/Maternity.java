package be.intecbrussel.exercise10_adding_version_numbers;

import java.io.*;
import java.time.LocalDate;

public class Maternity implements Serializable {
    public static void main(String[] args) {
        try(FileOutputStream file = new FileOutputStream("mert.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);){
            Person person = new Person("Mert", "Demirok", LocalDate.of(2000, 3, 5), "Sivas");
            out.writeObject(person);
            long serialVersionUID = ObjectStreamClass.lookup(person.getClass()).getSerialVersionUID();
            System.out.println(serialVersionUID); // -424743364485144435
            System.in.read(); // writes "*" on the console until pressing enter
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
