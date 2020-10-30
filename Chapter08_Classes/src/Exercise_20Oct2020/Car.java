package Exercise_20Oct2020;

public class Car {
    private int speed;
    private int horsePower;
    private String color;
    private boolean isLightOn;

    // constructors
    public Car(){
        this.horsePower = 100;
        this.color = "white";
    }

    // setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setLightOn() {
        this.isLightOn = !this.isLightOn;
    }

    // getters

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", horsePower=" + horsePower +
                ", color='" + color + '\'' +
                ", isLightOn=" + isLightOn +
                '}';
    }
}
