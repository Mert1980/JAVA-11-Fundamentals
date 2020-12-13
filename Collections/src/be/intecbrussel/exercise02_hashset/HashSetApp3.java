package be.intecbrussel.exercise02_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp3 {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();

        Person person1 = new Person("Mert", "Demirok", "male", 40, 82.4, 182);
        Person person2 = new Person("Asena", "Demirok", "female", 39, 72.4, 165);
        Person person3 = new Person("Yigit", "Demirok", "male", 12, 40.4, 154);
        Person person4 = new Person("Yigit", "Demirok", "male", 12, 40.4, 154);
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);

        personSet.forEach(System.out::println); // order of the elements are different from the entry order

        // after overriding the default equals and hashcode methods, duplication of Person objects are not allowed

    }

}
