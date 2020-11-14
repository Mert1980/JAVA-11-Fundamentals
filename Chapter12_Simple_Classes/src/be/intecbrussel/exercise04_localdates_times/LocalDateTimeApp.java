package be.intecbrussel.exercise04_localdates_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeApp {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime nowTimeDate = LocalDateTime.now();

        System.out.println(nowDate);
        System.out.println(nowTime);
        System.out.println(nowTimeDate + "\n");

        LocalDate otherDate = LocalDate.of(2015, 6, 15);
        LocalTime otherTime = LocalTime.of(10, 35, 45);
        LocalDateTime otherDateTime = LocalDateTime.of(otherDate, otherTime);

        System.out.println(otherDate);
        System.out.println(otherTime);
        System.out.println(otherDateTime);
    }
}
