package be.intecbrussel.exercise07_sorting_objects;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class PersonApp {
    public static void main(String[] args) {
        // causes ClassCastException if Comparable Interface is not implemented
        /*Collection<Person> personSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (int)o1.getWeight() - (int)o2.getWeight();
            }
        });*/

        // Change the anonymous nested Comparator Class with Lambda Expression
        // Collection<Person> personSet = new TreeSet<>(((o1, o2) -> (int)o1.getWeight() - (int)o2.getWeight()));

        // Use static method of Comparator to sort persons
        Collection<Person> personSet = new TreeSet<>((Comparator.comparingInt(o -> (int) o.getWeight())));

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
