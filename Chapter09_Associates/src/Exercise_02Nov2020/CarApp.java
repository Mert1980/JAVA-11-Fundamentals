package Exercise_02Nov2020;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", new Color("Yellow"), new Person("Mert", 40));

        Car car2 = new Car("Ferrari", new Color("Red"), new Person("Kaan", 20));

        car1.getEngine().setFuel(40);
        car2.getEngine().setFuel(60);

        System.out.println(car1);
        System.out.println(car2);
    }
}
