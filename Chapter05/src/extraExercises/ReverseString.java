package extraExercises;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text  = new StringBuilder(scanner.nextLine());
        System.out.println(text.reverse());
    }
}
