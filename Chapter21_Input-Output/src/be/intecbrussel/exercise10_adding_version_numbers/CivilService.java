package be.intecbrussel.exercise10_adding_version_numbers;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class CivilService implements Serializable {
    public static void main(String[] args) {
        try(FileInputStream file = new FileInputStream("mert.ser");
            ObjectInputStream in = new ObjectInputStream(file)){
            Person person = (Person) in.readObject();
            System.out.println(person);
            System.out.println(person.getBirthPlace()); // null
            // reason: it is defined in the previous version of the Person class
            System.in.read();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

// TERMINAL
// be.intecbrussel.exercise10_adding_version_numbers.Person; local class incompatible:
// stream classdesc
// serialVersionUID = -424743364485144435,
// local class serialVersionUID = 6383929847800967470
