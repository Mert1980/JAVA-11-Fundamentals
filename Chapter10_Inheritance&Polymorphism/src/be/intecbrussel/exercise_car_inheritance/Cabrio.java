package be.intecbrussel.exercise_car_inheritance;

public class Cabrio extends Car {
    private boolean sunroof;

    public Cabrio(){
        this.sunroof = false;
    }

    public Cabrio(String color, int hp){
        super.setColor(color);
        super.setHp(hp);
        this.sunroof = false;
    }

    public boolean openRoof(boolean status){
        this.sunroof = status;
        return this.sunroof;
    }

    public boolean getRoof(){
        return this.sunroof;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "Cabrio{" +
                "sunroof= " + this.sunroof +
                ", " + "speed= " + this.getSpeed() +
                ", " + "hp= " + this.getHp() +
                ", " + "color= " + this.getColor() +
                '}';
    }
}
