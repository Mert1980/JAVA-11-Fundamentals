package be.intecbrussel.exercise05;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.printf("%d/%d=%d \n", num, den, div);
            return;
        } catch (RuntimeException re){
            System.out.println("Invalid input");
            System.out.println(re.getMessage());
            re.printStackTrace();
        }
        finally {
            keyboard.close();
            System.out.println("The End");
        }
    }
}
