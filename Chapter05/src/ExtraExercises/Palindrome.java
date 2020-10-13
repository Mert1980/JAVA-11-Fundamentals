package ExtraExercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to chekck palindrome: ");
        String number = String.valueOf(scanner.nextInt());
        if(isPalindrome(number)){
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String value){
        int l = value.length();
        for (int i = 0; i < l ; i++) {
            if(value.charAt(i) != value.charAt(l - 1- i)){
                return false;
            }
        }
        return true;
    }
}
