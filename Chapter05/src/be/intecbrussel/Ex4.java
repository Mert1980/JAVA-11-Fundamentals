package be.intecbrussel;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOf500 = 0;
        int numberOf200 = 0;
        int numberOf100 = 0;
        int numberOf50 = 0;
        int numberOf20 =0;
        int numberOf10 = 0;
        int numberOf5 = 0;
        int numberOf2 = 0;
        int numberOf1 = 0;
        int digit1,  // To hold first digit (Ones) of number
            digit2,  // To hold second digit (Tens) of number
            digit3;  // To hold third digit (Hundreds) of number
        System.out.println("Enter the amount of money (1 to 500 euros): ");
        int amount = scanner.nextInt();

            int temp = amount;
            digit1 = temp % 10;

            temp = temp / 10;
            digit2 = temp % 10;

            temp = temp / 10;
            digit3 = temp % 10;

        numberOf200 = digit3 / 2;
        numberOf100 = digit3 % 2;

        if (digit2 >= 5){
            numberOf50 = 1;
            numberOf10 = digit2 % 5;
        } else {
            numberOf10 = digit2;
        }

        if (digit1 >= 5) {
            numberOf5 = 1;
            if((9 - digit1) % 2 == 0){
                numberOf2 = (digit1 - 5)/2;
            } else{
                if (digit1 == 8){
                    numberOf2 = 1;
                    numberOf1 = 1;
                } else if (digit1 == 6){
                    numberOf1 = 1;
                }
            }
        } else {
            if(digit1 % 2 == 0){
                numberOf2 = digit1 / 2;
            } else {
                if (digit1 == 3){
                    numberOf2 = 1;
                    numberOf1 = 1;
                } else {
                    numberOf1 = digit1;
                }
            }
        }

            if(amount == 500){
                System.out.println("You need one 500 Euros banknote");
            }

            if (numberOf200 != 0){
                System.out.println("Number of 200 Euros needed: " + numberOf200);
            }
            if (numberOf100 != 0){
                System.out.println("Number of 100 Euros needed: " + numberOf100);
            }

            if (numberOf50 != 0){
                System.out.println("Number of 50 Euros needed: " + numberOf50);
            }

            if (numberOf10 != 0){
                System.out.println("Number of 10 Euros needed: " + numberOf10);
            }

            if (numberOf5 != 0){
                System.out.println("Number of 5 Euros needed: " + numberOf5);
            }

            if (numberOf2 != 0){
                System.out.println("Number of 2 Euros needed: " + numberOf2);
            }

            if (numberOf1 != 0){
                System.out.println("Number of 1 Euros needed: " + numberOf1);
            }
    }
}
