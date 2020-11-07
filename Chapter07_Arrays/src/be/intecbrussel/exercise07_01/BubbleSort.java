package be.intecbrussel.exercise07_01;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numbers = new int[50];
        int[] temp = {0};
        int counter = numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(50);
            System.out.print(numbers[i] + " ");
        }

        System.out.println("");

        do{
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i-1] >= numbers[i]){
                    temp[0] = numbers[i-1];
                    numbers[i-1] = numbers[i];
                    numbers[i] = temp[0];
                }
        }
            counter--;
    } while(counter > 0);
        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}
