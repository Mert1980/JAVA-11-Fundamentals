package Exercise_06_04;

import java.util.Scanner;

public class StringBuilderExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first text:");
        String textFirst = scanner.nextLine();
        StringBuilder textOne = new StringBuilder(textFirst);

        System.out.println("Enter the second text:");
        String textSecond = scanner.nextLine();
        StringBuilder textTwo = new StringBuilder(textSecond);

        textOne.append(" Hello World");
        System.out.println("1 " + textOne);

        textTwo.reverse();
        System.out.println("2 " + textTwo);

        String textWithoutSpaces = textOne.toString().replace(" ", "");
        System.out.println("3 " + textWithoutSpaces);

        String textWithDoubleT = textTwo.toString().replaceAll("t", "tt");
        System.out.println("4 " + textWithDoubleT);

    }
}
