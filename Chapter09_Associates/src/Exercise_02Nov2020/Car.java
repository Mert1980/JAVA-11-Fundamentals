package Exercise_02Nov2020;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Car {
    private String brand;
    private int speed;
    private Color color;
    private Engine engine;
    private Person driver;
    private Person[] seats;

    public Car(int numberOfSeats){
       this.seats = new Person[numberOfSeats];
    }

    public Car(String brand, Color color){
        this.brand = brand;
        this.speed = 0;
        this.color = color;
        this.engine = new Engine();
    }

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

    public void getPassengers(){
        System.out.println(this.seats.length == 0 ? "" : "Passengers:");
        for (Person person:this.seats
             ) {
            System.out.println(person.getName());
        }
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

    public void setSeats(Person[] seats) {
        this.seats = seats;
    }

    // methods
    public void sortPassengers(){
        Arrays.sort(this.seats, new SortByAge());
    }

    public void addPassenger(Person person){
        for (int i = 0; i < seats.length; i++) {
            if(seats[i] == null){
                seats[i] = person;
                break;
            }
        }
    }

    public void accelerate(int amount){
        if(this.driver == null){
            this.speed = 0;
            System.out.println("You can not drive the car without a driver!");
            return;
        }
        if(this.engine.getFuel() == 0){
            this.speed = 0;
            System.out.println("You are run out of fuel! Please fill up the fuel tank.");
            return;
        }
        if(this.engine.getFuel() >= amount){
            this.speed+=amount;
            engine.burnFuel(amount);
            System.out.println("Drive safe!");
        } else {
            System.out.println("You don't have enough fuel!");
        }
    }

    public int repaint(Color color){
        int price = 0;
        this.color = color;
        for (int rgb:color.getRgb()
             ) {
            price+=rgb;
        }
        return price;
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

class SortByAge implements Comparator<Person>{
    public int compare(Person a, Person b){
        return b.getAge() - a.getAge();
    }
}
