package be.intecbrussel.exercise_20Oct2020;

public class Car {
    private int speed;
    private int horsePower;
    private String color;
    private boolean isLightOn;
    private static int counter = 0;

    // constructors
    public Car(){
        this(0, 100, "white", false);
    }

    public Car(String color){
        this(0, 100, color, false);
    }

    public Car(int horsePower){
        this(0, horsePower, "white", false);
    }

    public Car(int speed, String color){
       this(speed, 100, color , false);
    }

    public Car(int speed, int horsePower, String color, boolean isLightOn){
        this.speed = speed;
        this.horsePower = horsePower;
        this.color = color;
        this.isLightOn = isLightOn;
        this.counter++;
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

    public static int getCounter(){
        return counter;
    }

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
