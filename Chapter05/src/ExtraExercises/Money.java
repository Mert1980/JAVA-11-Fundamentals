package ExtraExercises;

import java.util.Scanner;

public class Money {
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

        System.out.println("Enter the amount of money (1 to 500 euros): ");
        int amount = scanner.nextInt();

        if(amount == 500){
            System.out.println("You have one 500 Euros banknote");
            amount = 0;
        }

        while(amount > 0){
            if(amount == 500){
                numberOf500 = 1;
                amount = amount - 500;
            }
            if(amount >= 400){
                numberOf200 = 2;
                amount = amount - 400;
            }
            if(amount >= 300){
                numberOf200 = 1;
                numberOf100 = 1;
                amount = amount - 300;
            }
            if(amount >= 200){
                numberOf200=1;
                amount = amount - 200;
            }
            if(amount >=100){
                numberOf100 = 1;
                amount = amount - 1;
            }
            if(amount >= 50){
                numberOf50 = 1;
                amount = amount - 50;
            }
            if(amount >= 20){
                numberOf20++;
                amount = amount -20;
                continue;
            }
            if(amount >= 10){
                numberOf10++;
                amount = amount -10;
                continue;
            }
            if(amount >= 5){
                numberOf5 = 1;
                amount = amount - 5;
            }
            if(amount >= 2){
                numberOf2++;
                amount = amount - 2;
                continue;
            }
            if(amount >= 1){
                numberOf1++;
                amount = amount -1;
                continue;
            }
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

        if (numberOf20 != 0){
            System.out.println("Number of 20 Euros needed: " + numberOf20);
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
