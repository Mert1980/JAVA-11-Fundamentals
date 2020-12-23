package be.intecbrussel.exercise06_object_serialization;

import java.io.*;

public class CivilService implements Serializable {
    public static void main(String[] args) {
        try(FileInputStream file = new FileInputStream("mert.ser");
            ObjectInputStream in = new ObjectInputStream(file)){
            Person person = (Person) in.readObject();
            System.out.println(person);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
