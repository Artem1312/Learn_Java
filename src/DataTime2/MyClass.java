package DataTime2;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class MyClass {
    public static void main(String[] args) {
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDate d2 = LocalDate.of(2022, 8, 15);
        System.out.println(d2);

        LocalDate d3 = LocalDate.of(2022, Month.DECEMBER, 15);
        System.out.println(d3);

        LocalDate d4 = LocalDate.ofEpochDay((new Date()).getTime() / (24*60*60*1000));
        System.out.println(d4);
        d4 = LocalDate.ofEpochDay(10);
        System.out.println(d4);

        LocalDate d5 = LocalDate.ofYearDay(2022, 50);
        System.out.println(d5);

        LocalDate d6 = LocalDate.of(2022, 8, 15);
        System.out.println(d6.getDayOfYear());
        System.out.println(d6.getDayOfWeek());
        System.out.println(d6.lengthOfMonth());
        System.out.println(d6.lengthOfYear());
        System.out.println(d6.isLeapYear());
        System.out.println(d6.toEpochDay());
        System.out.println(d6.plusDays(12));
        System.out.println(d6.plusMonths(12));
        System.out.println(d6.plusWeeks(12));
        System.out.println(d6.plusYears(12));
        System.out.println(d6.atStartOfDay());
        System.out.println(d6.atTime(20, 36));
        System.out.println(d6.format(DateTimeFormatter.ofPattern("dd.MM.uuuu")));
    }
}
