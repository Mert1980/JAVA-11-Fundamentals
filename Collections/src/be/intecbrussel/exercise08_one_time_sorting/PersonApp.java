package be.intecbrussel.exercise08_one_time_sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class PersonApp {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        Person person1 = new Person("Mert", "Demirok", "male", 40, 82.4, 182);
        Person person2 = new Person("Asena", "Demirok", "female", 39, 72.4, 165);
        Person person3 = new Person("Yigit", "Aslan", "male", 12, 40.4, 154);
        Person person4 = new Person("Yigit", "Aslan", "male", 12, 40.4, 154);
        Person person5 = new Person("Almira", "Demirok", "female", 3, 17.4, 54);
        Person person6 = new Person("Hakan", "Demirok", "male", 40, 70.4, 182);
        Person person7 = new Person("Hasan", "Kus", "male", 40, 85.4, 182);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);

        persons.forEach(System.out::println);
        System.out.println();
        // sort persons list by natural order
        persons.sort(Comparator.naturalOrder());
        persons.forEach(System.out::println);
        System.out.println();

        // sort persons list by weight
        persons.sort(Comparator.comparing(Person::getWeight));
        persons.forEach(System.out::println);
    }
}
