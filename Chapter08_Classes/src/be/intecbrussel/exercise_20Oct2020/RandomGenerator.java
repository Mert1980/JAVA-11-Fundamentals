package be.intecbrussel.exercise_20Oct2020;

import java.util.Random;

public class RandomGenerator {

    public static String createRandomColor(){
        int number = getRandomNumber(1, 5);
        switch (number){
            case 1:
                return "white";

            case 2:
                return "green";

            case 3:
                return "blue";

            case 4:
                return "black";

            case 5:
                return "orange";

            default:
                return "white";
        }
    }

    public static int createRandomHorsePower(){
        int number = getRandomNumber(100, 300);
        return number;
    }

    public static int createRandomSpeed(){
        int number = getRandomNumber(0, 100);
        return number;
    }

    public static boolean createRandomLight(){
        int number = getRandomNumber(0, 2);
        return number == 1;
    }

    public static int getRandomNumber(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }
}
