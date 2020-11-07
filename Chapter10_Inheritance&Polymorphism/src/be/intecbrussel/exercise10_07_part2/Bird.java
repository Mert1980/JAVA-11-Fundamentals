package be.intecbrussel.exercise10_07_part2;

public class Bird extends Animal{
    public Bird(){
        this("");
    }

    public Bird(String name){
        super(name);
    }

    public void move(){
        System.out.println("Bird moves");
    }

    public void makeNoise(){
        System.out.println("Bird makes noise");
    }
}
