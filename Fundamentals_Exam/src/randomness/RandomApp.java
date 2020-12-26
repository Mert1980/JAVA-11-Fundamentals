package randomness;

import java.util.Random;
import java.util.Scanner;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner kbd = new Scanner(System.in);
        int[] dice = new int[6];

        System.out.println("How many times do you want to throw the dice?");
        int number = kbd.nextInt();

        for (int i = 0; i < number; i++) {
            throwDice(random, dice);
        }
        printResult(dice, number);
        showPercentage(dice, number);
    }

    public static void showPercentage(int[] dice, int number){
        System.out.println("Printed in percentage: ");
        for (int i = 0; i < dice.length; i++) {
            System.out.printf("%d %5.2f %s\n", i+1, 1.0 * dice[i]/number, "%");
        }
    }

    public static void printResult(int[] dice, int number){
        String text = "The number of times thrown : " + number;
        System.out.println(text);

        String repetitiveText = "Number of times ";
        StringBuilder sb = new StringBuilder();

        sb.append(repetitiveText).append("one: ").append(dice[0]).append("\n")
                .append(repetitiveText).append("two: ").append(dice[1]).append("\n")
                .append(repetitiveText).append("three: ").append(dice[2]).append("\n")
                .append(repetitiveText).append("four: ").append(dice[3]).append("\n")
                .append(repetitiveText).append("five: ").append(dice[4]).append("\n")
                .append(repetitiveText).append("six: ").append(dice[5]);
        System.out.println(sb.toString());
    }

    public static void throwDice(Random random,int[] dice){
        switch (random.nextInt(6) + 1){
            case 1:{
                dice[0] = dice[0] + 1;
                break;
            }
            case 2:{
                dice[1] = dice[1] + 1;
                break;
            }
            case 3:{
                dice[2] = dice[2] + 1;
                break;
            }
            case 4:{
                dice[3] = dice[3] + 1;
                break;
            }
            case 5:{
                dice[4] = dice[4] + 1;
                break;
            }
            case 6:{
                dice[5] = dice[5] + 1;
            }
        }
    }
}
