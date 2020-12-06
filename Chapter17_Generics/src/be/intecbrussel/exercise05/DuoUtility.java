package be.intecbrussel.exercise05;

import be.intecbrussel.exercise04.Duo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public interface DuoUtility {
    public static void printDuo(Duo<?> d){
        System.out.println(d.getFirst() + " " + d.getSecond());
    }

    public static void printUpper(Duo<String> d){
        System.out.println(d.getFirst().toUpperCase() + "," + d.getSecond().toUpperCase());
    }

    public static void printSum(Duo<? extends Number> d){
        Number n1 = d.getFirst();
        Number n2 = d.getSecond();
        System.out.println(n1 + "+" + n2 + "="
        + (n1.doubleValue() + n2.doubleValue()));
    }

    public static void printMultiply(Duo<? super Number> d){
        Number n1 = (Number) d.getFirst();
        Number n2 = (Number) d.getSecond();
        System.out.println(n1 + "*" + n2 + "="
                + (n1.doubleValue() * n2.doubleValue()));

    }
}
