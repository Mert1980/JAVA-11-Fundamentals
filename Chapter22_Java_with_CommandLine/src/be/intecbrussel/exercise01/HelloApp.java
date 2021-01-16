package be.intecbrussel.exercise01;

public class HelloApp {
    public static void main(String[] args) {
        Hello hello = new Hello();

        String name = args[0];
        String message = hello.sayHello(name);
        System.out.println(message);
    }
}
