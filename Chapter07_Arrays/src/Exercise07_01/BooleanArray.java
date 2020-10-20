package Exercise07_01;

import java.util.Random;
import java.util.Scanner;

public class BooleanArray {
    public static void main(String[] args) {
        boolean[] statistics = new boolean[10];
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(10);
        System.out.println(randomNumber);
        int userInput;
        int index = 0;

        do {
            System.out.println("Guess the number:");
            userInput = scanner.nextInt();

            if (userInput < randomNumber) {
                System.out.println("Try bigger ;)");
            } else if (userInput > randomNumber) {
                System.out.println("Try smaller ;)");
            } else {
                statistics[index] = true;
            }
            index++;
        } while (userInput != randomNumber);

        printResult(index);
        printStatistics(statistics);
    }

    public static void printResult(int counter) {
        if (counter == 1) {
            System.out.println("Congratulations! You found the number in " + counter + " attempt.");
        } else {
            System.out.println("Congratulations! You found the number in " + counter + " attempts.");
        }
    }

    public static void printStatistics(boolean[] statistics) {
        for (boolean value : statistics) {
            System.out.println(value);
        }
    }
}
