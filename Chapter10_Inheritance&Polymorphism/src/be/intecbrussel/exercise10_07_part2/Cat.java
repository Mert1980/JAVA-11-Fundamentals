package be.intecbrussel.exercise10_07_part2;

public class Cat extends Animal{
    public Cat(){
        this("");
    }

    public Cat(String name){
        super(name);
    }

    @Override
    public void move(){
        System.out.println("Cat moves");
    }

    public void makeNoise(){
        System.out.println("Cat makes noise");
    }
}
