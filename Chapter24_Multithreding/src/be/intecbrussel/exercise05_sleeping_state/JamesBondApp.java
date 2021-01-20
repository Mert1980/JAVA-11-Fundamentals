package be.intecbrussel.exercise05_sleeping_state;

import java.util.Random;

public class JamesBondApp {
    public static void main(String[] args) {
        Random rand = new Random();
        TimeBomb bomb = new TimeBomb(10);
        bomb.activate();
        try {
            Thread.sleep(rand.nextInt(30000));
        } catch (InterruptedException e) {
            System.out.println("Disarmed!");
        }

        bomb.disarm();
    }
}
