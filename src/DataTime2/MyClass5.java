package DataTime2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MyClass5 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE dd MMMM uuuu HH:mm", new Locale("ru", "RU"));
        System.out.println("Today:");
        System.out.println(dt.format(dtf));
        dtf = dtf.withLocale(new Locale("en", "US"));
        System.out.println(dt.format(dtf));
    }
}
