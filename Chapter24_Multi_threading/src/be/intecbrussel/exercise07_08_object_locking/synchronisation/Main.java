package be.intecbrussel.exercise07_08_object_locking.synchronisation;

import java.util.HashSet;
import java.util.Set;

public class Main {
    /*
    Objects have intrinsic locks to monitor synchronization.
    Each thread uses its own copy of local variable
    and each copy has its own object that has its own lock, thread1 gets its copy and it
    continues executing and then thread 2 gets its copy and executes it.
     */
    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class Countdown {
    private Object object = new Object(); // consistent outcome
    private int i;

    public void doCountdown() {
        String color = ThreadColor.ANSI_BLUE; // consistent outcome without switch case
        // results in interference of threads with switch case

        Set<String> localReferenceVariable = new HashSet<String>(); // results in interference of threads
        Countdown instanceReferenceVariable = new Countdown(); // results in interference of threads
        // Object object = new Object(); // // results in interference of threads

        /*switch(Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }*/

        synchronized(object) {
            for(i=10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
            }
        }
    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}
