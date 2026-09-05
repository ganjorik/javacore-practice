package dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Parsing {
    public static void main(String[] args) {
        /*LocalDate date = LocalDate.now();
        System.out.println("Стандартный формат даты для LocalDate: " + date);

        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MM::uuuu")));
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));*/
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Стандартный формат даты LocalDateTime: " + dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH:mm:ss")));
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        Instant timestamp = Instant.now();
        System.out.println("Стандартный формат: " + timestamp);
    }
}
