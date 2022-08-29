package DataTime2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class MyClass6 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2022, 8,29);
        LocalDate d2 = LocalDate.of(1990, 12,13);
        Period p = Period.between(d2, d1);
        System.out.println(p);
        System.out.println(p.getYears());
        System.out.println(p.getMonths());
        System.out.println(p.getDays());
        System.out.println(p.toTotalMonths());
        System.out.println(' ');

        Period p2 = Period.parse("P50D");
        System.out.println(d1.plus(p2));
        System.out.println(d1.minus(p2));
        System.out.println(' ');

        System.out.println(d2.until(d1, ChronoUnit.DAYS));
        System.out.println(ChronoUnit.DAYS.between(d1, d2));

    }
}
