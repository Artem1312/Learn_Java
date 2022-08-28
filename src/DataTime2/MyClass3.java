package DataTime2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class MyClass3 {
    public static void main(String[] args) {
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        LocalTime t = LocalTime.now();
        System.out.println(t.toString());

        LocalTime t1 = LocalTime.of(22, 12, 36);
        LocalDate d1 =LocalDate.of(2022, 8, 28);
        System.out.println(t1.atDate(d1));

        LocalTime t2 = LocalTime.of(22, 15, 36);
        LocalTime t3 = LocalTime.of(22, 12, 36);
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));

        System.out.println(t1.compareTo(t2));
        System.out.println(t1.compareTo(t3));
        t2 = LocalTime.of(22, 10, 36);
        System.out.println(t1.compareTo(t2));

        System.out.println(t1.isBefore(t2));
        System.out.println(t1.isBefore(t3));

        System.out.println(t1.format(DateTimeFormatter.ofPattern("HH:mm")));
        System.out.println(t2.toString());

        System.out.println(LocalDateTime.MAX);
        System.out.println(LocalDateTime.MIN);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        LocalDateTime dt1 = LocalDateTime.ofEpochSecond(
                System.currentTimeMillis()/1000, 0, ZoneOffset.of("+3")
        );
        System.out.println(dt1);

        LocalDateTime dt2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Moscow"));
        System.out.println(dt2);

        System.out.println(dt2.getYear());
        System.out.println(dt2.getMonthValue());
        System.out.println(dt2.getMinute());
        System.out.println(dt2.getDayOfWeek());
        System.out.println(dt2.getDayOfMonth());
        System.out.println(dt2.getDayOfYear());

        LocalDate dt3 = dt2.toLocalDate();
        System.out.println(dt3.isLeapYear());
        System.out.println(dt3.lengthOfYear());
        System.out.println(dt3.lengthOfMonth());
        System.out.println(dt3.isLeapYear());

        System.out.println(dt2.plusDays(2));
        System.out.println(dt2.plusYears(2));
        System.out.println(dt2.plusMonths(3));
        System.out.println(dt2.plusWeeks(3));
    }
}
