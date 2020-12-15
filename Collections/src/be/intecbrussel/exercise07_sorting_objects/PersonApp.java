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
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        });*/

        // Change the anonymous nested Comparator Class with Lambda Expression
        // Collection<Person> personSet = new TreeSet<>(((o1, o2) -> Double.compare(o1.getWeight(), o2.getWeight())));

        // Use static method of Comparator to sort persons
        // Collection<Person> personSet = new TreeSet<>((Comparator.comparingDouble(o -> o.getWeight())));
        // Collection<Person> personSet = new TreeSet<>((Comparator.comparingDouble(Person::getWeight)));

        // Compare persons according to their age, name and weight
        Collection<Person> personSet = new TreeSet<>((Comparator
                .comparingInt(Person::getAge)
                .thenComparing(Person::getLastName)
                .thenComparingDouble(Person::getWeight)));
        Person person1 = new Person("Mert", "Demirok", "male", 40, 82.4, 182);
        Person person2 = new Person("Asena", "Demirok", "female", 39, 72.4, 165);
        Person person3 = new Person("Yigit", "Aslan", "male", 12, 40.4, 154);
        Person person4 = new Person("Yigit", "Aslan", "male", 12, 40.4, 154);
        Person person5 = new Person("Almira", "Demirok", "female", 3, 17.4, 54);
        Person person6 = new Person("Hakan", "Demirok", "male", 40, 70.4, 182);
        Person person7 = new Person("Hasan", "Kus", "male", 40, 85.4, 182);

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);
        personSet.add(person7);

        personSet.forEach(System.out::println); // order of the elements are different from the entry order
    }
}
