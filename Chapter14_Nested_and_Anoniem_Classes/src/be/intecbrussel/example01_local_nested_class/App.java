package be.intecbrussel.example01_local_nested_class;

public class App {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.getInner();
        // Hello from the Inner class

        System.out.println(out.getInner());
        // Hello from the Inner class
        // Inner 5



    }
}
