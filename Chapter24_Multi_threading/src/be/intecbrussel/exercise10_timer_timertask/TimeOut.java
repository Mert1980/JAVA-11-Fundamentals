package be.intecbrussel.exercise10_timer_timertask;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.TimerTask;

public class TimeOut extends TimerTask {
    @Override
    public void run() {
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() +
                ":" + LocalTime.now().getSecond());
    }
}
