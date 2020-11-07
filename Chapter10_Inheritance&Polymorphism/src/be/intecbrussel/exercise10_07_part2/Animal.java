package be.intecbrussel.exercise10_07_part2;

public abstract class Animal {
    private String name;

    public Animal(){
        this("");
    }

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void move();

    public abstract void makeNoise();
}
