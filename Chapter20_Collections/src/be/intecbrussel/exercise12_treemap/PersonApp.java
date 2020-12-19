package be.intecbrussel.exercise12_treemap;

import java.util.*;

public class PersonApp {
    public static void main(String[] args) {
        SortedMap<String, Person> people = new TreeMap<>();
        Person person1 = new Person("Mert", "Demirok", "male", 40, 82.4, 182);
        Person person2 = new Person("Asena", "Demirok", "female", 39, 72.4, 165);
        Person person3 = new Person("Yigit", "Aslan", "male", 12, 40.4, 154);
        Person person4 = new Person("Yigit", "Aslan", "male", 12, 40.4, 154);
        Person person5 = new Person("Almira", "Demirok", "female", 3, 17.4, 54);
        Person person6 = new Person("Hakan", "Demirok", "male", 40, 70.4, 182);
        Person person7 = new Person("Hasan", "Kus", "male", 40, 85.4, 182);

        List<Person> personList = List.of(person1, person2, person3, person4, person5, person6, person7);
        for (Person person : personList) {
           people.put(person.getFirstName(), person);
        }
        people.forEach((name,person) -> System.out.println(person)); // print order is the alphbetical order of the keys
        System.out.println(people.get("Mert"));  // case sensitive - "mert" returns null
        System.out.println(people.firstKey());
        System.out.println(people.lastKey());
    }
}
