package extraExercises;

import java.util.Scanner;

public class LastThreeLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = scanner.nextLine();

        int index = text.length() - 3;

        String withoutLastThreeLetters = text.substring(0, index);
        String lastThreeLetters = text.substring(index).toUpperCase();

        System.out.println(withoutLastThreeLetters + lastThreeLetters);
    }
}
