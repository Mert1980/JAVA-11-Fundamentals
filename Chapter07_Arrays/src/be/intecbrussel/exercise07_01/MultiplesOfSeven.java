package be.intecbrussel.exercise07_01;

public class MultiplesOfSeven {

    public static void main(String[] args) {
        int [] numbers = new int[20];
        numbers[0] = 7;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i-1] + 7;
        }
        printArray(numbers);
        System.out.println("");
        printInReverseOrder(numbers);
    }
    public static void printArray(int[] numbers){
        for(int n: numbers){
            System.out.print(n + " ");
        }
    }

    public static void printInReverseOrder(int[] numbers){
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

}
