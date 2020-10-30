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

    /*public void setColor(String color) {
        this.color = color;
    }*/

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setLightOn() {
        this.isLightOn = true;
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

    // methods
    public void accelerate(int speed){
        this.speed+=speed;
    }

    public void slowDown(int speed){
        if(this.speed > speed){
            this.speed-=speed;
        }
    }

    public void parkCar(){
        this.speed = 0;
        this.isLightOn = false;
    }

    public int rePaintCar(String color){
        this.color = color;
        int cost = 0;
        char[] chars = color.toCharArray();
        for (char letter:chars
             ) {
            cost+=letter;
        }
        return cost;
    }

    public void toggleLight(){
        this.isLightOn = !this.isLightOn;
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
