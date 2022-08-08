package DataTime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MyClass6 {
    public static void main(String[] args) {
        Locale ru_RU = new Locale("ru", "RU");
        Locale.setDefault(ru_RU);
        GregorianCalendar c = new GregorianCalendar();
        Date d = c.getTime();
        System.out.printf("%tc\n", d);
        long t = c.getTimeInMillis();
        System.out.println(t);
        c.setTimeInMillis(1520713497698L);
        System.out.printf("%1$td.%1$tm.%1$tY %1$tH:%1$tM:%1$tS\n", c);

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.LONG_STANDALONE, ru_RU));
    }
}
