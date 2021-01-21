package be.intecbrussel.exercise06_joining_threads;

public class PrintAppLambda {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->print('*', 100));
        Thread thread2 = new Thread(()->print('/', 100));
        thread1.start();
        thread1.setName("T1");
        thread2.start();
        thread2.setName("T2");

        try {
            thread1.join(3000);

            if(thread1.isAlive()){
                thread1.interrupt();
            }

            Thread.sleep(10);
            thread2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }

    private static void print(char c, int count) {
        for (int j = 0; j < count; j++) {
            System.out.print(c);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted");
                return;
            }
        }
    }
}
