package Exercise_20Oct2020;

public class CarApp {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar);

        Car my2ndCar = new Car();
        my2ndCar.setColor("purple");
        my2ndCar.setLightOn();
        System.out.println(my2ndCar);

        Car my3rdCar = new Car();
        my3rdCar.setHorsePower(200);
        System.out.println(my3rdCar);

    }
}
