package be.intecbrussel.exercise03;

import java.util.stream.Stream;

public class StreamingApp {
    public static void main(String[] args) {
        Person person1 = new Person("Mert", "Demirok", Person.Gender.MALE, 40, 82, 182);
        Person person2 = new Person("Ali", "Kaptan", Person.Gender.MALE, 34, 70, 169);
        Person person3 = new Person("Suzan", "Bekci", Person.Gender.FEMALE, 25, 60, 170);

        Person[] sa = Stream.of(person1, person2, person3).toArray(Person[]::new);
        for (Person person : sa) {
            System.out.println(person);
        }
    }
}
