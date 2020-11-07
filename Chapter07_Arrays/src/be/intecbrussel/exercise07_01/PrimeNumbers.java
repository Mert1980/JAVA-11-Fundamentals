package be.intecbrussel.exercise07_01;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = scanner.nextInt();
        int [] primeArray = new int[limit/2];

        boolean isPrime = true;
        int counter = 0;

        for (int i = 1; i < limit ; i+=2) {
            isPrime = true;

           for (int j = 2; j < i/2; j++) {
                if(i %j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeArray[counter] = i;
                counter++;
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        for (int number: primeArray) {
            System.out.print(number + " ");
        }
    }
}
