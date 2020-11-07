package be.intecbrussel.exercise_02Nov2020;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", new Color("Yellow"), new Person("Mert", 40));

        Car car2 = new Car("Ferrari", new Color("Red"), new Person("Kaan", 20));

        car1.getEngine().setFuel(40);
        car2.getEngine().setFuel(60);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println();
        Car car3 = new Car("Mercedes", new Color("White"));

        car3.accelerate(20); // You can not drive the car without a dreiver!
        car3.setDriver(new Person("Mert", 30));
        car3.accelerate(20); // You are run out of fuel! Please fill up the fuel tank.
        car3.getEngine().setFuel(10);
        car3.accelerate(20); // You don't have enough fuel!
        car3.getEngine().reFuel(10);
        car3.accelerate(20); // Drive safe!

        System.out.println();
        Car car4 = new Car(4);
        car4.addPassenger(new Person("Kagan", 13));
        car4.addPassenger(new Person("Almira", 3));
        car4.addPassenger(new Person("Asena", 40));
        car4.addPassenger(new Person("Mert", 45));
        car4.getPassengers();

        System.out.println();
        car4.sortPassengers();
        car4.getPassengers();


    }
}
