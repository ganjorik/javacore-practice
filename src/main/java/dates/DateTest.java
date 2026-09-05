package dates;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.of(1984, 4, 20, 15, 25, 7);
        LocalDateTime date2 = LocalDateTime.of(2015, 01, 2, 0, 20, 10);

        System.out.println(date1.format(DateTimeFormatter.ofPattern("dd-MM-uuuu")));
        System.out.println(date2.format(DateTimeFormatter.ofPattern("dd-MM-uuuu")));

        System.out.println(date2.minusYears(date1.getYear()).getYear());

        System.out.println(Duration.between(date1, date2).toSeconds());

    }
}
