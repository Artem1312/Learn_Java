package DataTime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MyClass5 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("ru", "RU"));
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(new Date(1520702397754L));
        System.out.printf("%tc\n", c);
        c.setTimeInMillis(1520705497754L);
        System.out.printf("%tc\n", c);
        c.clear();
        System.out.printf("%tc\n", c);
        c.set(2022, Calendar.AUGUST, 8);
        System.out.printf("%tc\n", c);
        c.set(2022, Calendar.AUGUST, 8, 20,20);
        System.out.printf("%tc\n", c);
        c.set(2022, Calendar.AUGUST, 8, 21, 20, 52);

        System.out.printf("%tc\n", c);
        c.set(Calendar.YEAR, 2023);
        System.out.printf("%tc\n", c);
    }
}
