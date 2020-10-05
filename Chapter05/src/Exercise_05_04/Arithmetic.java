package Exercise_05_04;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int x = keyboard.nextInt();

        System.out.println("Enter the second number:");
        int y = keyboard.nextInt();

        System.out.println("The sum of x and y = " + ((char)x + y));
        System.out.println("The difference between x and y = " + (x - y));
        System.out.println("The multiplication of x and y = " + (x * y));
        System.out.println("The division of x and y = " + ((double)x / y));
        System.out.println("x  % y = " + (x%y));
        System.out.println("x++ = " + x++); // 10
        System.out.println("--x = " + --x); // 11 - 1 = 10
        System.out.println("++x = " + ++x); // 10 + 1 = 11
        System.out.println("x-- = " + x--); // 11

        char myCharacter = 'f';

        System.out.println((char)(myCharacter + y));


        keyboard.close();
    }
}
