package be.intecbrussel;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your capital: ");
        int capital = scanner.nextInt();

        System.out.println("Enter the interest rate: ");
        double interestRate = scanner.nextDouble();

        System.out.println("Enter the duration of the contract in years: ");
        int duration = scanner.nextInt();

        double interest = 0;
        int counter = 1;
        while(counter <= duration){
            interest = capital * (interestRate/100);
            capital+=interest;
            System.out.println("Total amount of money after " + counter + " years: " + capital);
            counter++;
        }
    }
}
