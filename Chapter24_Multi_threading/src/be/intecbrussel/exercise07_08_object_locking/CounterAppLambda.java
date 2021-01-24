package be.intecbrussel.exercise07_08_object_locking;

public class CounterAppLambda {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(()-> increment(counter, 10000));
        Thread thread2 = new Thread(()-> increment(counter, 10000));
        Thread thread3 = new Thread(()-> decrement(counter, 5000));
        Thread thread4 = new Thread(()-> decrement(counter, 5000));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount()); // 12231 before synchronized
        // 20000 after synchronized
        // 10000 after calling decrement method
    }

    private static void decrement(Counter counter, int number) {
        for (int i = 0; i < number; i++) {
            counter.decrement();
        }
    }


    private static void increment(Counter counter, int number) {
        for (int i = 0; i < number; i++) {
            counter.increment();
        }
    }
}
