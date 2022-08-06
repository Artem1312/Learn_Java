package DataTime;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MyClass1 {
    public static void main(String[] args) {
        Locale locale_ru_RU = new Locale("ru", "RU");
        System.out.printf(locale_ru_RU,
                "Сегодня:\n"
        + "%1$td %1$tB %1$tY %1$tH:%1$tM:%1$tS\n"
        + "%1$td.%1$tm.%1$tY", new Date());

        System.out.println();

        Calendar c = Calendar.getInstance();
        System.out.println(c.toString());

        c.setTimeInMillis(1520702397754L);
        System.out.printf("%tc", c);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            System.out.println("Суббота");
        }
    }
}
