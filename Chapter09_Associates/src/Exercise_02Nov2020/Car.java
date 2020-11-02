package Exercise_02Nov2020;

public class Car {
    private String brand;
    private int speed;
    private Color color;
    private Engine engine;
    private Person driver;

    public Car(String brand, int speed, Color color, Engine engine, Person driver){
        this.brand = brand;
        this.speed = speed;
        this.color = color;
        this.engine = engine;
        this.driver = driver;
    }

    public void accelerate(int amount){
        this.speed+=amount;
    }

    public void repaint(Color color){
        this.color = color;
    }
}
