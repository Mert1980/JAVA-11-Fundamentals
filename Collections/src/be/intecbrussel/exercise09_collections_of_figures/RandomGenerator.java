package be.intecbrussel.exercise09_collections_of_figures;

import java.util.Random;

public class RandomGenerator {
    public static int getNextInt(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }
}
