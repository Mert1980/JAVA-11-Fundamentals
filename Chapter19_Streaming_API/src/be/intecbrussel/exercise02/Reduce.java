package be.intecbrussel.exercise02;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
       IntStream numbers = IntStream.range(1, 100);
       System.out.println(numbers.count());

       IntStream numbers2 = IntStream.range(1, 100);
       System.out.println(numbers2.max().getAsInt());

       IntStream numbers3 = IntStream.range(1, 100);
       System.out.println(numbers3.min().getAsInt());

       IntStream numbers4 = IntStream.range(1, 100);
       System.out.println(numbers4.average().getAsDouble());

       IntStream numbers5 = IntStream.range(1, 100);
       System.out.println(numbers5.sum());

       IntStream numbers6 = IntStream.range(1, 100);
       System.out.println(numbers6.reduce(0, (acc, el) -> acc + el));

       String[] colors = {"blue", "white", "red", "yellow", "purple"};
       System.out.println(Stream.of(colors).reduce("", (acc, el) -> acc + el + ";" ));
    }
}
