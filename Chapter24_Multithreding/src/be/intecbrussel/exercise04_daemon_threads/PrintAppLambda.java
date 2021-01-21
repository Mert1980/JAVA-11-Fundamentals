package be.intecbrussel.exercise04_daemon_threads;

import be.intecbrussel.exercise01_creating_thread.ThreadColors;

public class PrintAppLambda {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->print(ThreadColors.ANSI_BLUE + "1", 100));
        Thread thread2 = new Thread(()->print(ThreadColors.ANSI_GREEN + "2", 1000));
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
    }

    private static void print(String text, int count) {
        for (int j = 0; j < count; j++) {
            System.out.print(text);
            Thread.yield();
        }
    }
}
