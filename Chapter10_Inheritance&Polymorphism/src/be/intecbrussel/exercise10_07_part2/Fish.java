package be.intecbrussel.exercise10_07_part2;

public class Fish extends Animal{
    public Fish(){
        this("");
    }

    public Fish(String name){
        super(name);
    }

    public void move(){
        System.out.println("Fish moves");
    }

    public void makeNoise(){
        System.out.println("Fish makes noise");
    }
}
