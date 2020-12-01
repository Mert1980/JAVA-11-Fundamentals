package be.intecbrussel.exercise03;

public class DuoApp {
    public static void main(String[] args) {
        IntegerDuo intDuo = new IntegerDuo(5, 7);
        StringDuo stringDuo = new StringDuo("Hello", "World");

        intDuo.swap();
        System.out.println(intDuo.getFirst());
        System.out.println(intDuo.getSecond());
        System.out.println("-----------------");

        String first = stringDuo.getFirst();
        String second = stringDuo.getSecond();
        System.out.println(first+ " " + second);
    }
}
