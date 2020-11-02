package Exercise_02Nov2020;

public class Engine {
    private int fuel;

    public Engine(int fuel){
        this.fuel = fuel;
    }

    public void burnFuel(int amount){
        this.fuel-=amount;
    }

    public void reFuel(int amount){
        this.fuel+=amount;
    }
}
