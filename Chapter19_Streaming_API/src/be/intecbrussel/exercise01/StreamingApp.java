package be.intecbrussel.exercise01;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamingApp {
    public static void main(String[] args) {
        String[] colors = {"blue", "white", "red", "yellow", "purple"};
        Stream.of(colors)
                .forEach(System.out::println);

        IntStream.range(1, 100)
                .forEach(System.out::println);

        Person[] people = {new Person("Mert", "Demirok", Person.Gender.MALE, 40, 82, 182),
                new Person("Ali", "Kaptan", Person.Gender.MALE, 34, 70, 169),
                new Person("Suzan", "Bekci", Person.Gender.FEMALE, 25, 60, 170)
        };
        Stream.of(people).forEach(System.out::println);
    }
}
