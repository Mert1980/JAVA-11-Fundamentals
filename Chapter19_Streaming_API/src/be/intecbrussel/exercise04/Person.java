package be.intecbrussel.exercise04;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
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
