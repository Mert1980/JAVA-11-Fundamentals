package Exercise07_01;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100];
        int[] temp = new int[1];


        for (int i = 0; i < 100 ; i++) {
            numbers[i]= rand.nextInt(100);
        }

        for (int number:numbers
        ) {
            System.out.print(number + " ");
        }

        System.out.println("");

        for (int i = 0; i < 99 ; i++) {
            for (int j = 1; j < 100; j++) {
                if (numbers[i] >= numbers[j]){
                    temp[0] = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp[0];
                } else {
                    break;
                }
            }
        }




        for (int number:numbers
             ) {
            System.out.print(number + " ");
        }
    }
}
