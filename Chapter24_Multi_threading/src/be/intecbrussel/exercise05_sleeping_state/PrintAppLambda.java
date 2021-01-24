package be.intecbrussel.exercise05_sleeping_state;

public class PrintAppLambda {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->print('*', 100));
        Thread thread2 = new Thread(()->print('/', 1000));
        thread1.setName("T1");
        thread2.setName("T2");
        thread1.start();
        thread2.start();

        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(470); // main thread?? ask Manu
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.interrupt();

        try {
            Thread.sleep(130);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.interrupt();
    }

    private static void print(char c, int count) {
        for (int j = 0; j < count; j++) {
            System.out.print(c);
            // Thread.yield();  --> this does not required while sleep method is used
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " :Interrupted");
                //throw new RuntimeException("Terminated");

            }
        }
    }
}
