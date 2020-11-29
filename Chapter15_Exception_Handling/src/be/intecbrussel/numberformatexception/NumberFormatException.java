package be.intecbrussel.numberformatexception;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = readNumber(reader);
        System.out.println(number);
    }

    public static int readNumber(Scanner reader){
        while(true){
            System.out.print("Enter a number: ");
            try{
                int number = Integer.parseInt(reader.nextLine());
                return number;
            } catch (Exception e){
                System.out.println("Your input is an invalid number.");
            }
        }
    }
}
