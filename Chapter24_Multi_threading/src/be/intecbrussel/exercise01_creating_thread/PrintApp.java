package be.intecbrussel.exercise01_creating_thread;

public class PrintApp {
    public static void main(String[] args) {
        PrintThread thread1 = new PrintThread(ThreadColors.ANSI_BLUE + "1", 100);
        PrintThread thread2 = new PrintThread(ThreadColors.ANSI_GREEN + "2", 100);
        thread1.start();
        thread2.start();
    }
}
