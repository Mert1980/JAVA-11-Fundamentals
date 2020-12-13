package be.intecbrussel.exercise02_hashset;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class EuroMillion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        Set<Integer> luckyNumbers = new HashSet<>();
        int count = 0;

        while(true){
            int number = random.nextInt(46)+1;

            if (luckyNumbers.contains(number)) {
                continue;
            }
            luckyNumbers.add(number);
            count++;

            if(count == 6){
                break;
            }
        }
        luckyNumbers.forEach(number -> System.out.print(number + " "));
        System.out.println();

        count = 0;
        while(true){
            System.out.print("Enter a number between [1 - 45]: ");
            int number = scanner.nextInt();

            if(checkValidity(numbers, number) == false){
                continue;
            }
            numbers.add(number);
            count++;
            if(count == 6){
                break;
            }
        }

        showResults(numbers, luckyNumbers);

    }
    private static boolean checkValidity(Set<Integer> set, int number){
        if (number < 1 || number > 45) {
            System.out.println("Enter a valid number between [1 - 45]");
            return false;
        }

        if (set.contains(number)) {
            System.out.println("You have chosen " + number + " before. Enter a different number.");
            return false;
        }
        return true;
    }

    private static void showResults(Set<Integer> set, Set<Integer> luckyNumbers){
        if(set.retainAll(luckyNumbers)){
            System.out.print("You guessed " + set.size() + " numbers correct: ");
            set.forEach(number -> System.out.print(number + " "));
        } else {
            System.out.println("You have no matched number");
        }
    }
}
