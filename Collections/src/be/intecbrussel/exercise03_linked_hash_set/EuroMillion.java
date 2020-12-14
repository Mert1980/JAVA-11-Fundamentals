package be.intecbrussel.exercise03_linked_hash_set;

import java.util.*;

public class EuroMillion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Set<Integer> numbers = new LinkedHashSet<>();
        Set<Integer> luckyNumbers = new LinkedHashSet<>();

        while(luckyNumbers.size() < 6){
            int number = random.nextInt(45)+1;
            luckyNumbers.add(number);
        }
        luckyNumbers.forEach(number -> System.out.print(number + " "));
        System.out.println();

        while(numbers.size() < 6){
            System.out.print("Enter a number between [1 - 45]: ");
            int number = scanner.nextInt();

            if(!checkValidity(numbers, number)) {
                continue;
            }
            numbers.add(number);
        }

        numbers.forEach(number -> System.out.print(number + " ")); // the print order is different than the entry order
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
        set.retainAll(luckyNumbers);
        if(set.equals(luckyNumbers)){
            System.out.println("Congratulations! You guessed all the numbers correct.");
        } else if(set.size() > 0){
            System.out.print("You guessed " + set.size() + " numbers correct: ");
            set.forEach(number -> System.out.print(number + " "));
        } else {
            System.out.println("You have no matched number");
        }
    }
}
