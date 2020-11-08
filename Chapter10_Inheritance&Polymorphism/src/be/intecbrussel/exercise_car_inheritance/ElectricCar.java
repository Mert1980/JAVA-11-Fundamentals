package be.intecbrussel.exercise_car_inheritance;

public class ElectricCar extends Car{
    private int battery;

    public ElectricCar(){
        this.battery = 0;
    }

    public ElectricCar(String color, int battery){
        super.setColor(color);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    @Override
    public void accelerate(int amount) {
        this.setSpeed(this.getSpeed() + amount + (this.battery/100));
    }

    @Override
    public void slow(int amount) {
        this.setSpeed(this.getSpeed() - amount - (this.battery/100));
    }

    @Override
    public void park() {
        super.park();
    }

    public void charge(int amount){
        this.battery+=amount;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "speed= " + this.getSpeed() +
                ", " + "battery= " + this.getBattery() +
                ", " + "color= " + this.getColor() +
                '}';
    }
}
