package be.intecbrussel.exercise08_wait_notify_all;

import java.util.Random;

public class CalculateApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Thread thread1 = new Thread(()->calculate(calc, 100));
        Thread thread2 = new Thread(()->calculate(calc, 100));
        Thread thread3 = new Thread(()->calculate(calc, 100));
        thread1.start();
        thread1.setName("T1");
        thread2.start();
        thread2.setName("T2");
        thread3.start();
        thread3.setName("T3");
    }

    private static void calculate(Calculator calc, int number) {
        Random rand = new Random();
        for (long i = 0; i < number ; i++) {
            int value = rand.nextInt(10);
            calc.setValue(value);

            int result = calc.getResult();
            System.out.println(value + " : " + result);

            if(result != (value * value)){
                System.out.println("Error");
            }
        }
    }
}
