package be.intecbrussel.exercise01;

public class DuoApp {
    public static void main(String[] args) {
        Duo<String> text = new Duo<>("Hello", "World");
        System.out.println(text.getFirst() + " " + text.getSecond());

        Duo<Integer> number = new Duo<>(3, 6);
        System.out.println(number.getFirst() + number.getSecond());

    }
}
