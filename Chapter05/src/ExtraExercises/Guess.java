package ExtraExercises;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(10);
        System.out.println(randomNumber);
        System.out.println("Guess the number:");
        int userInput;
        int numberOfTries = 0;

        do{
            userInput = scanner.nextInt();
            numberOfTries++;
            if(userInput < randomNumber){
                System.out.println("Try bigger ;)");
            } else {
                System.out.println("Try smaller ;)");
            }
        } while (userInput != randomNumber);
        printResult(numberOfTries);
    }

    public static void printResult(int counter){
        System.out.println("Congratulations! You found the number in " + counter + (counter ==1 ? " attempt." : " attempts"));
    }
}
