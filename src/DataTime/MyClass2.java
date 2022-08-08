package DataTime;

import java.util.Calendar;
import java.util.Locale;

public class MyClass2 {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("ru", "RU"));
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(1520702397754L);
        System.out.printf("%tc\n", c);
        System.out.println(c.get(Calendar.ERA));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(Calendar.MARCH);
        System.out.println(c.get(Calendar.WEEK_OF_YEAR));
        System.out.println(c.get(Calendar.WEEK_OF_MONTH));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.AM_PM));
        System.out.println(c.get(Calendar.PM));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MILLISECOND));
        System.out.println(c.get(Calendar.ZONE_OFFSET));
        System.out.println(c.get(Calendar.DST_OFFSET));
    }
}
