package Exercise_02Nov2020;

public class Engine {
    private int fuel;

    public Engine(int fuel){
        this.fuel = fuel;
    }

    //getters
    public int getFuel() {
        return fuel;
    }

    //setters
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    //methods
    public void burnFuel(int amount){
        this.fuel-=amount;
    }

    public void reFuel(int amount){
        this.fuel+=amount;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "fuel=" + fuel +
                '}';
    }
}
