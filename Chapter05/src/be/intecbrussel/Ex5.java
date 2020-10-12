package be.intecbrussel;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Please enter the number of children you have: ");
        int numberOfChildren = scanner.nextInt();

        System.out.println("Please enter your yearly income: ");
        int yearlyIncome = scanner.nextInt();

        double discount = 0; // initial discount is 0€

        // apply 2€ discount if the age is older than 50
        if (age > 50){
            discount+=2;
        }

        // apply 1€ discount per child
        if(numberOfChildren <= 5){
            discount = discount + (numberOfChildren * 1);
        } else {
            discount+=5;
        }

        // apply 2.5€ discount if the yearly income is lower than 12500€
        if(yearlyIncome < 12_500){
            discount = 1.0 * discount + 2.5;
        }

        // check if the total discount is not more than 8.5€
        if (discount < 8.5){
            System.out.println("You will pay " + (10 - discount) + "€ for membership.");
        } else {
            System.out.println("You will pay 1.5€ for membership");
        }
    }
}
