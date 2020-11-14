package be.intecbrussel.exercise03_weekdays_months;

import java.time.DayOfWeek;
import java.time.Month;

public class MonthDayApp {
    public static void main(String[] args) {
        for(Month m: Month.values()){
            System.out.printf("%s : [%d, %d] %n", m, m.minLength(), m.maxLength());
        }

        for(DayOfWeek day:DayOfWeek.values()){
            System.out.printf("%s %n", day);
        }

    }
}
