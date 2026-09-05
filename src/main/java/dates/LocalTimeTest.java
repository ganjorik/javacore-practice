package dates;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("Получаем текущее время: " + localTime);

        LocalTime specificTime = LocalTime.of(22,11,5,19);
        System.out.println("Какое-то время дня: " + specificTime);

        LocalTime sec2000 =  LocalTime.ofSecondOfDay(2000);
        System.out.println("Через 2000 секунд после 01.01.1970: " + sec2000);
    }
}
