package be.intecbrussel;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your brut wage? ");
        int brutWage = scanner.nextInt();
        double netWage = 0;

        if(brutWage > 3000){
            netWage = brutWage- (1.0 * brutWage / 100 * 38);
        } else if (brutWage > 2000){
            netWage = brutWage- (1.0 * brutWage / 100 * 35);
        } else {
            netWage = brutWage- (1.0 * brutWage / 100 * 27);
        }
        System.out.println("Your net wage is: " + netWage);
    }
}
