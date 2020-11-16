package be.intecbrussel.exercise03;

public interface Pig {
    void grunt();
    default void fly(){
        System.out.println("I can also fly!");
    };
}
