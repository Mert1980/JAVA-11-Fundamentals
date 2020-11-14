package be.intecbrussel.exercise05_timezones;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeZone {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Europe/Brussels");
        System.out.println(zoneId.getId());

        ZoneId systemZoneId = ZoneId.systemDefault();
        System.out.println(systemZoneId);

        ZoneOffset timeZone = ZoneOffset.ofHours(2);
        System.out.println(timeZone);

        ZoneId londonZone = ZoneId.of("Europe/London");
        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZoneId adelaideZone = ZoneId.of("Australia/Adelaide");
        ZoneId unknownZone = ZoneId.of("UTC-4");

        ZonedDateTime nowHere = ZonedDateTime.now();
        ZonedDateTime nowLondon = ZonedDateTime.now(londonZone);
        ZonedDateTime nowSydney = ZonedDateTime.now(sydneyZone);
        ZonedDateTime nowNewYork = ZonedDateTime.now(newYorkZone);
        ZonedDateTime nowAdelaide = ZonedDateTime.now(adelaideZone);
        ZonedDateTime nowUnknown = ZonedDateTime.now(unknownZone);

        System.out.println(nowHere);
        System.out.println(nowLondon);
        System.out.println(nowSydney);
        System.out.println(nowNewYork);
        System.out.println(nowAdelaide);
        System.out.println(nowUnknown);
    }
}
