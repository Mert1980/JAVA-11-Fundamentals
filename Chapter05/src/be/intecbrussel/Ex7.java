package be.intecbrussel;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter math exam result:");
        int resultMath = scanner.nextInt();

        System.out.println("Enter accounting exam result:");
        int resultAccounting = scanner.nextInt();

        System.out.println("Enter ICT exam result:");
        int resultICT = scanner.nextInt();

        boolean control = true;

        while(control){
            // check the math exam result
            if (resultMath < 6){
                System.out.println("You didn't pass! Your math exam result is below 6");
                break;
            }
            // check the accounting and ICT exams together
            if ((resultAccounting + resultICT) < 12 ){
                System.out.println("You didn't pass! The total of accounting and ICT exam results is below 12");
                break;
            }
            System.out.println("You passed!");
            control = false;
        }
    }
}
