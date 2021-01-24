package be.intecbrussel.exercise11_concurrent_collections_atomic_objects;

public class CounterApp {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(()->increment(counter, 100));
        Thread thread2 = new Thread(()->increment(counter, 100));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getCount());
    }

    private static void increment(Counter counter, int number) {
        for (int i = 0; i < number; i++) {
            counter.increment();
        }
    }
}
