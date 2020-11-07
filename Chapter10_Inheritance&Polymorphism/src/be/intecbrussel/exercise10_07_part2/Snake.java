package be.intecbrussel.exercise10_07_part2;

public class Snake extends Animal{
    public Snake(){
        this("");
    }

    public Snake(String name){
        super(name);
    }

    public void move(){
        System.out.println("Fish moves");
    }

    public void makeNoise(){
        System.out.println("Fish makes noise");
    }
}
