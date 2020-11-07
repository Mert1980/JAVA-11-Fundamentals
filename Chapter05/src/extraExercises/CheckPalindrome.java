package extraExercises;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text  = new StringBuilder(scanner.nextLine());
        System.out.println(text.reverse());

        if(text.toString().contains(text.reverse().toString())){
            System.out.println("This text is a palindrome!");
        } else {
            System.out.println("Not a palindrome!");
        }
    }
}
