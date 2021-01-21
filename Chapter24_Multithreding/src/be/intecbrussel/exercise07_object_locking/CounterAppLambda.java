package be.intecbrussel.exercise07_object_locking;

public class CounterAppLambda {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(()-> increment(counter, 10000));
        Thread thread2 = new Thread(()-> increment(counter, 10000));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount()); // 12231 before synchronized
                                                // 20000 after synchronized

    }


    private static void increment(Counter counter, int number) {
        for (int i = 0; i < number; i++) {
            counter.increment();
        }
    }
}
