package ExtraExercises;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is even or not: ");
        int number = scanner.nextInt();

        if(isEven(number)){
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
