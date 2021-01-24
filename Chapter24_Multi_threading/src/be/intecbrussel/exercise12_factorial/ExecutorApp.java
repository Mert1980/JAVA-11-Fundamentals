package be.intecbrussel.exercise12_factorial;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorApp {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator(20);
        ExecutorService es = Executors.newSingleThreadExecutor();

        Future<Long> future = es.submit(calculator);

        while(!future.isDone()){
            System.out.println("Waiting");
        }

        System.out.println(calculator.call().longValue());
        es.shutdown();
    }
}
