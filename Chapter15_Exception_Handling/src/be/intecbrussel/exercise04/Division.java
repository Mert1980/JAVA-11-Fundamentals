package be.intecbrussel.exercise04;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.printf("%d/%d=%d", num, den, div);
            keyboard.close();
        } catch (NumberFormatException | ArithmeticException e){ // multiple exception handler
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        /*catch (RuntimeException re){ // common superclass
            System.out.println("Invalid input");
            System.out.println(re.getMessage());
            re.printStackTrace();
        }*/
    }
}
