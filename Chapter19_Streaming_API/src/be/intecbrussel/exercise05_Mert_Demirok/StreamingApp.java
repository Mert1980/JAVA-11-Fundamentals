package be.intecbrussel.exercise05_Mert_Demirok;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamingApp {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 44, 23, 54, 7, 45, 99, 33, 12};
        String[] colors = {"green", "blue", "orange", "white", "yellow"};


        // Create a stream that will multiply each integer by 5 and then print it if the integer is greater than 50.
        IntStream.of(numbers).map(number -> number * 5)
                            .filter(number -> number>50)
                            .forEach(number -> System.out.print(number + " "));
        System.out.println("\n----------------------------------------------");
        // Create a stream that will divide each integer in the array by 2 and collect the new stream in a new array
        double[] doubles = IntStream.of(numbers).mapToDouble(number -> 1.0 * number/2).toArray();
        DoubleStream.of(doubles).forEach(number -> System.out.print(number + " "));
        System.out.println("\n-----------------------------------------------");

        //Create a stream that will capitalize the first two strings and then combine the 2 strings to 1 string.
        String text = Stream.of(colors).limit(2)
                                        .map(color -> color.toUpperCase())
                                        .reduce("", (acc, el) -> acc + el + " ");
        System.out.print(text);
        System.out.println("\n-----------------------------------------------");

        // Create a stream that will calculate the sum of all integers in the array, except the first 2 integers.
        int sum = IntStream.of(numbers).skip(2).sum();
        System.out.println(sum);
        System.out.println("-----------------------------------------------");

        // Create a Stream that will convert all strings that can be converted to integers. (Tip: Use a tool to capture an exception)
        String[] numbersAsString = {"2", "4", "34", "45", "one", "5"};
        Stream.of(numbersAsString).filter(num -> convertableToInt(num))
                .mapToInt(number -> Integer.valueOf(number))
                .forEach(number -> System.out.print(number + " "));

    }

    private static boolean convertableToInt(String number){
        if(Integer.valueOf(number) == null){
            return false;
        }
        return true;
    }
}
