package be.intecbrussel.exercise02_instant;

import java.time.Instant;

public class InstantApp {
    public static void main(String[] args) {
        System.out.println(Instant.EPOCH); // 1970-01-01T00:00:00Z
        System.out.println(Instant.MIN); // -1000000000-01-01T00:00:00Z
        System.out.println(Instant.MAX); // +1000000000-12-31T23:59:59.999999999Z

        Instant now = Instant.now();
        System.out.println(now); // 2020-11-14T06:34:31.599117Z

        // Gets the number of seconds from the Java epoch of 1970-01-01T00:00:00Z.
        System.out.println(now.getEpochSecond()); // 1605335364

        // Gets the number of nanoseconds, later along the time-line, from the start of the second.
        // The nanosecond-of-second value measures the total number of nanoseconds from the second returned by getEpochSecond().
        System.out.println(now.getNano()); // 552681000

        Instant earlier = now.minusSeconds(20);
        System.out.println(earlier); // 2020-11-14T06:34:11.599117Z

        Instant later = now.plusSeconds(20);
        System.out.println(later); // 2020-11-14T06:34:51.599117Z

        System.out.println(now.isAfter(earlier)); // true
        System.out.println(now.isBefore(later)); // true

        Instant current = Instant.now();
        current = current.plusSeconds(7);
        current = current.plusMillis(5);
        current = current.plusNanos(3);
        System.out.println(current);
    }
}
