package be.intecbrussel.exercise01_nested_classes;

public class Musician {
     public class Instrument {
        public void makeSound(){
            System.out.println("Violin makes sound!");
        }
    }
    public void play(){
         Instrument violin = new Instrument();
         violin.makeSound();
    }
}
