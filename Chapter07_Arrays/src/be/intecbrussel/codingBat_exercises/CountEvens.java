package be.intecbrussel.codingBat_exercises;

public class CountEvens {
    public static void main(String[] args) {
        /*
        Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

        countEvens([2, 1, 2, 3, 4]) → 3
        countEvens([2, 2, 0]) → 3
        countEvens([1, 3, 5]) → 0
        */
        int[] numbers = {2, 1, 2, 3, 4};
        int numberOfEvens = countEvens(numbers);
        System.out.println(numberOfEvens);
    }
    public static int countEvens(int[] numbers){
        int counter = 0;
        for (int number:numbers){
            if(number%2 == 0){
                counter++;
            }
        }
        return counter;
    }
}
