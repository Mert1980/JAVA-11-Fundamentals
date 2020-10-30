package Exercise_20Oct2020;

public class CarApp {
    public static void main(String[] args) {
        /*Car myCar = new Car();
        System.out.println(myCar);

        Car my2ndCar = new Car();
        my2ndCar.setColor("purple");
        my2ndCar.setLightOn();
        System.out.println(my2ndCar);

        Car my3rdCar = new Car();
        my3rdCar.setHorsePower(200);
        System.out.println(my3rdCar);*/

        /*Car myCar = new Car();
        System.out.println(myCar);
        System.out.println(myCar.rePaintCar("red"));

        Car my2ndCar = new Car();
        //my2ndCar.setSpeed(150);
        my2ndCar.accelerate(30);
        System.out.println(my2ndCar);

        Car my3rdCar = new Car();
        my3rdCar.setHorsePower(200);
        my3rdCar.toggleLight();
        System.out.println(my3rdCar);*/

        Car myCar = new Car();
        System.out.println(myCar);

        Car my2ndCar = new Car(250);
        System.out.println(my2ndCar);

        Car my3thCar = new Car(5, "red");
        System.out.println(my3thCar);



    }
}
