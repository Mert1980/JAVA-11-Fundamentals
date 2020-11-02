package Exercise_02Nov2020;

public class Car {
    private String brand;
    private int speed;
    private Color color;
    private Engine engine;
    private Person driver;

    public Car(String brand, Color color, Person driver){
        this.brand = brand;
        this.speed = RandomGenerator.getRandomNumber(100, 300);
        this.color = color;
        this.engine = new Engine();
        this.driver = driver;
    }

    //getters
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public Color getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public Person getDriver() {
        return driver;
    }

    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setDriver(Person driver) {
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
