package be.intecbrussel.exercise_car_inheritance;

public abstract class Car {
    private String color;
    private int speed;
    private int hp;

    public Car(){
        this.color = "white";
        this.speed = 0;
        this.hp = 100;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void accelerate(int amount){
        this.speed+=amount + (hp/100);
    }

    public void slow(int amount){
        this.speed-=amount - (hp/100);
    }

    public void park(){
        this.speed = 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", hp=" + hp +
                '}';
    }
}
