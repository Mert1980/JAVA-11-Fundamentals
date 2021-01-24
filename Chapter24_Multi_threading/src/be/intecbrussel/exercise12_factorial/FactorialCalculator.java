package be.intecbrussel.exercise12_factorial;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable {
    private long number;

    public FactorialCalculator(long number) {
        if(number < 0) throw new IllegalArgumentException("Number is smaller than 0");
        this.number = number;
    }

    public Long call(){
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
