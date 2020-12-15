package be.intecbrussel.exercise07_sorting_objects;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class PersonApp {
    public static void main(String[] args) {
        Collection<Person> personSet = new TreeSet<>(new AgeComparator()); // causes ClassCastException if Comparable Interface is not
        // implemented

        Person person1 = new Person("Mert", "Demirok", "male", 40, 82.4, 182);
        Person person2 = new Person("Asena", "Bekci", "female", 39, 72.4, 165);
        Person person3 = new Person("Yigit", "Aslan", "male", 12, 40.4, 154);
        Person person4 = new Person("Yigit", "Aslan", "male", 12, 40.4, 154);
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);

        personSet.forEach(System.out::println); // order of the elements are different from the entry order
    }
}
