package be.intecbrussel.exercise06;

import java.util.Random;

public class RandomGenerator {
    public static int getNextInt(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }
}
