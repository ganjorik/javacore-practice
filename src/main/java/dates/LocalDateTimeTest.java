package dates;

import java.time.*;

public class LocalDateTimeTest {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        System.out.println("Получакм текущее время: " + today);

        today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("DateTime: " + today);

        LocalDateTime randDate = LocalDateTime.of(2024, Month.AUGUST, 10,
                11,12,25);
        System.out.println("LocalDateTime с указанной датой: " + randDate);

        LocalDateTime dateFromBase =
                LocalDateTime.ofEpochSecond(2000, 0, ZoneOffset.UTC);
        System.out.println("Через 2000 секунд после 01.01.1970: " + dateFromBase);

        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");
        System.out.println(zone1);
        LocalTime time1 = LocalTime.now(zone1);
        System.out.println("India time zone: " + time1);
        LocalTime time2 = LocalTime.now(zone2);
        System.out.println("Japan time zone: " + time2);

    }
}
