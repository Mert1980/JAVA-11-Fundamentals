package be.intecbrussel.exercise06_deque;

public class Person {
    private String name;
    private Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public enum Gender{
        MALE,
        FEMALE;
    }

    @Override
    public String toString() {
        return name;
    }
}
