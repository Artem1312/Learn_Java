package DataTime;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MyClass7 {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        SimpleDateFormat df = new SimpleDateFormat(
                "'сегодня:' EEEE dd MMMM yyyy HH:mm",
                new Locale("ru", "RU")
        );
        System.out.println(df.format(c.getTime()));
    }
}
