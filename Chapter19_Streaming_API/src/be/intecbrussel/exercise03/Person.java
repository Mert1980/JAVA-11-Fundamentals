package be.intecbrussel.exercise03;

public class Person {
    private String name;
    private String surname;
    private Gender gender;
    private int age;
    private float weight;
    private float height;

    public Person(String name, String surname, Gender gender, int age, float weight, float height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", gender=" + gender + ", age=" + age + ", weight=" + weight + ", height=" + height + '}';
    }

    public enum Gender{
        MALE, FEMALE;
    }
}
