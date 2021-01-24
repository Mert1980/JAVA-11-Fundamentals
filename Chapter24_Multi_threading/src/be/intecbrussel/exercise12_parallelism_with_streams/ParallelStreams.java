package be.intecbrussel.exercise12_parallelism_with_streams;


import java.util.OptionalDouble;
import java.util.stream.LongStream;

public class ParallelStreams {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        /*OptionalDouble sum = LongStream.rangeClosed(1, 1_000_000_000L)
                .mapToDouble(Math::sqrt)
                .map(Math::log)
                .average();*/

        OptionalDouble sum = LongStream.rangeClosed(1, 1_000_000_000L)
                .parallel()
                .mapToDouble(Math::sqrt)
                .map(Math::log)
                .average();

        long endTime = System.nanoTime();
        long timeDifference = endTime - startTime;

        System.out.println(timeDifference); // 10633922996 nanoseconds without parallelism
                                            // 1985697821 nanoseconds with parallelism - 5 times faster

        System.out.println(sum.getAsDouble());

    }
}
