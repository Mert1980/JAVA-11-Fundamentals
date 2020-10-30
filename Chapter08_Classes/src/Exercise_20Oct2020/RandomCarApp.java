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

        Car firstCar = new Car(RandomGenerator.createRandomSpeed(), RandomGenerator.createRandomHorsePower(), RandomGenerator.createRandomColor(), RandomGenerator.createRandomLight());
        Car secondCar = new Car(RandomGenerator.createRandomSpeed(), RandomGenerator.createRandomHorsePower(), RandomGenerator.createRandomColor(), RandomGenerator.createRandomLight());
        Car thirdCar = new Car(RandomGenerator.createRandomSpeed(), RandomGenerator.createRandomHorsePower(), RandomGenerator.createRandomColor(), RandomGenerator.createRandomLight());

        System.out.println(firstCar);
        System.out.println(secondCar);
        System.out.println(thirdCar);
    }

    public static int getRandomNumber(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }


}
