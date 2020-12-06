package be.intecbrussel.exercise05;

import be.intecbrussel.exercise04.Duo;

import java.lang.reflect.Array;

public class DuoUtilityApp {
    public static void main(String[] args) {
        Duo<Integer> id = new Duo<Integer>(4, 7);
        Duo<Long> ld = new Duo<Long>(44563L, 75675L);
        Duo<Float> fd = new Duo<Float>(4.5F, 7.6F);
        Duo<Number> nd = new Duo<Number>(4, 7.67D);
        DuoUtility.printSum(id);
        DuoUtility.printSum(ld);
        DuoUtility.printSum(fd);
        DuoUtility.printSum(nd);

        //DuoUtility.printSum(id); --> error
        DuoUtility.printMultiply(nd);

        Duo<String> sd = new Duo<>("Hello", "World");
        sd.swap();
        DuoUtility.printUpper(sd); // WORLD, HELLO

        Duo<Integer> ad = new Duo<>(3, 5);
        DuoUtility.printDuo(ad);
    }
}
