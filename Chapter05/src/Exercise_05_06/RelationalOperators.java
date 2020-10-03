package Exercise_05_06;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number one: ");
        int num1 = scan.nextInt();

        System.out.println("Enter number two: ");
        int num2 = scan.nextInt();

        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
    }
}
