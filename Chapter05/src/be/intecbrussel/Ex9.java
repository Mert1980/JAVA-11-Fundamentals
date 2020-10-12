package be.intecbrussel;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.print(number);
        System.out.print(" ");
        while(true){
            if(number == 1){
                break;
            }
            if(number % 2 == 0){
                number/=2;
                System.out.print(number);
                System.out.print(" ");
            } else{
                number = number * 3 + 1;
                System.out.print(number);
                System.out.print(" ");
            }
        }
    }
}
