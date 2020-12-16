package be.intecbrussel.exercise06_deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<Person> persons = new LinkedList<>();
        persons.offerFirst(new Person("Mert", Person.Gender.MALE));
        persons.offerFirst(new Person("John", Person.Gender.MALE));
        persons.offerFirst(new Person("Matt", Person.Gender.MALE));
        persons.offerLast(new Person("Mary", Person.Gender.FEMALE));
        persons.offerLast(new Person("Suzan", Person.Gender.FEMALE));
        persons.offerLast(new Person("Katy", Person.Gender.FEMALE));

        Person person = persons.pollFirst();
        while(person != null){
            System.out.print("Couples are: " + person + " and " + persons.pollLast() + "\n");
            person = persons.pollFirst();
        }
    }
}
