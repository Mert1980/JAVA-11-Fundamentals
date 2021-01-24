package be.intecbrussel.exercise10_timer_timertask;

import java.util.Timer;

public class TimeOutApp {
    public static void main(String[] args) {
        TimeOut task = new TimeOut();
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(task, 1000*1, 1000);

        System.out.println("Please patience!");

        try {
            Thread.sleep(1000*20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
