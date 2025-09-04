package aufgaben;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeZeitspanne {

    public static void main(String[] args) {
        // --- A1: Trip Duration ---
        ZonedDateTime startA1 = ZonedDateTime.of(2025, 1, 1, 12, 0, 0, 0, ZoneOffset.ofHours(1));
        ZonedDateTime endA1 = ZonedDateTime.of(2025, 1, 1, 16, 0, 0, 0, ZoneOffset.ofHours(2));
        long durationA1 = ChronoUnit.HOURS.between(startA1, endA1);
        System.out.println("A1 Result: " + durationA1 + " hours");

        // --- A2: Arrival Time ---
        ZonedDateTime startA2 = ZonedDateTime.of(2025, 1, 1, 8, 0, 0, 0, ZoneOffset.ofHours(2));
        ZonedDateTime arrivalA2 = startA2.plusHours(3).withZoneSameInstant(ZoneOffset.ofHours(1));
        System.out.println("A2 Result: " + arrivalA2.toLocalTime());

        // --- A3: Duration with DST ---
        ZoneId berlinZone = ZoneId.of("Europe/Berlin");
        ZonedDateTime startA3 = ZonedDateTime.of(LocalDateTime.of(2018, 3, 25, 1, 0), berlinZone);
        ZonedDateTime endA3 = ZonedDateTime.of(LocalDateTime.of(2018, 3, 25, 4, 0), berlinZone);
        long durationA3 = Duration.between(startA3, endA3).toHours();
        System.out.println("A3 Result: " + durationA3 + " hours");
    }
}