package be.intecbrussel.example01_local_nested_class;

public class Outer {
    public Object getInner(){
        int a = 5;
        class Inner{
            @Override
            public String toString() {
                return "Inner " + a;
            }

            public void greet(){
                System.out.println("Hello from the Inner class");
            }
        }
        Inner inner = new Inner();
        inner.greet();
        return new Inner();
    }

}
