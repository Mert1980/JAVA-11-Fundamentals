package Exercise_20Oct2020;

import java.util.Random;

public class RandomCarApp {
    public static void main(String[] args) {

        /*Car firstCar = new Car(getRandomNumber(90, 190));
        Car secondCar = new Car(getRandomNumber(90, 190));
        Car thirdCar = new Car(getRandomNumber(90, 190));

        System.out.println(firstCar);
        System.out.println(secondCar);
        System.out.println(thirdCar);*/

       /* Car firstCar = new Car(RandomGenerator.createRandomSpeed(), RandomGenerator.createRandomHorsePower(), RandomGenerator.createRandomColor(), RandomGenerator.createRandomLight());
        Car secondCar = new Car(RandomGenerator.createRandomSpeed(), RandomGenerator.createRandomHorsePower(), RandomGenerator.createRandomColor(), RandomGenerator.createRandomLight());
        Car thirdCar = new Car(RandomGenerator.createRandomSpeed(), RandomGenerator.createRandomHorsePower(), RandomGenerator.createRandomColor(), RandomGenerator.createRandomLight());

        System.out.println(firstCar);
        System.out.println(secondCar);
        System.out.println(thirdCar);*/

       Car[] cars = new Car[20];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(RandomGenerator.createRandomSpeed(), RandomGenerator.createRandomHorsePower(), RandomGenerator.createRandomColor(), RandomGenerator.createRandomLight());
        }

        for (Car car:cars
             ) {
            System.out.println("Speed: " + car.getSpeed());
        }

        for (int i = 0; i < cars.length; i++) {
            cars[i].parkCar();
        }

        for (Car car:cars
        ) {
            System.out.println("Parked cars: ");
            if (car.getSpeed() == 0){
                System.out.println(car);
            }
        }
    }

    /*public static int getRandomNumber(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }*/
}
