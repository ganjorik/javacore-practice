package dates;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate specificDate = LocalDate.of(2020, Month.APRIL, 30);
        System.out.println(specificDate);

        LocalDate epochDate = LocalDate.ofEpochDay(365);
        System.out.println(epochDate);

        LocalDate day2502026 = LocalDate.ofYearDay(2026, 250);
        System.out.println(day2502026);



    }
}
