package be.intecbrussel.exercise08_transient_variables;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class CivilService implements Serializable {
    public static void main(String[] args) {
        try(FileInputStream file = new FileInputStream("mert.ser");
            ObjectInputStream in = new ObjectInputStream(file)){
            Person person = (Person) in.readObject();
            System.out.println(person);
            System.in.read();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
