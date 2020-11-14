package be.intecbrussel.exercise06_timeDuration;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationApp {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant later = now.plusSeconds(500)
                .plusMillis(2125698)
                .plusNanos(456398);

        Duration duration = Duration.between(now, later);
        System.out.println(duration.getSeconds()); // 2625

        long milliseconds = ChronoUnit.MILLIS.between(now, later);
        System.out.println(milliseconds); // 2625699

        LocalDate nowDate = LocalDate.now();
        LocalDate thenDate = LocalDate.of(1980 , 6, 14);

        Period period = Period.between(nowDate, thenDate);
        System.out.println("Period: " + period); // P-40Y-5M
        System.out.println("Years: " + period.getYears()); // -40
        System.out.println("Months: " + period.getMonths()); // -5
        System.out.println("Days: " + period.getDays()); // 0

        long months = ChronoUnit.MONTHS.between(nowDate, thenDate);
        long weeks = ChronoUnit.WEEKS.between(nowDate, thenDate);
        long days = ChronoUnit.DAYS.between(nowDate, thenDate);
        System.out.println(days); // -14763
        System.out.println(weeks); // -2109
        System.out.println(months); // -485
    }
}
