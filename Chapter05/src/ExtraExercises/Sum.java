package ExtraExercises;

import java.awt.image.BandedSampleModel;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Please enter the first number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Please enter the second number: ");
            int secondNumber = scanner.nextInt();

            sum(firstNumber, secondNumber);

            System.out.println("Do you want to continue?");
            String answer = scanner.next();

            if (!isContinue(answer)) {
                break;
            }
        } while (true);
    }

    public static void sum(int first, int second) {
        System.out.println(first + second);
    }

    public static boolean isContinue(String answer) {
        if (answer.contains("Yes")) {
            return true;
        }
        if (answer.contains("No")) {
            return false;
        }
        return true;
    }
}
