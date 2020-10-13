package Exercise_06_01;
import java.util.*;

public class RandomApp {
    public static void main(String[] args) {
        Random rand = new Random();
        // Print random integer values
        int number = rand.nextInt();
        for (int i = 0; i < 3; i++) {
            System.out.println(number);
        }
        System.out.println("");

        // Print a random number between 0 and 100
        number = rand.nextInt(100);
        System.out.println(number);

        System.out.println("");

        // Create 6 random numbers between 0 and 45
        int counter = 6;
        do {
            number = rand.nextInt(45);
            System.out.print(number + " ");
            counter--;
        } while (counter > 0);
    }
}
