package be.intecbrussel.exercise02_threads_with_lambda;

public class PrinterAppRunnable {
    public static void main(String[] args) {
        Runnable printer1 = new CharacterPrinter('*', 100);
        Runnable printer2 = new CharacterPrinter('&', 100);

        Thread thread1 = new Thread(printer1);
        Thread thread2 = new Thread(printer2);

        thread1.start();
        thread2.start();
    }
}
