package Exercise_02Nov2020;

public class Car {
    private String brand;
    private int speed;
    private Color color;
    private Engine engine;
    private Person driver;

    public Car(String brand, int speed, Color color, Person driver){
        this.brand = brand;
        this.speed = speed;
        this.color = color;
        this.engine = new Engine(60);
        this.driver = driver;
    }

    public void accelerate(int amount){
        this.speed+=amount;
    }

    public void repaint(Color color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", color=" + color +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
