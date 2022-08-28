package DataTime2;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class MyClass4 {
    public static void main(String[] args) {
        Instant ins = Instant.now();
        System.out.println(ins);

        LocalDateTime dt = LocalDateTime.ofInstant(
                Instant.now(), ZoneId.of("Europe/Kiev")
        );
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(dt.format(dtf));
        dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(dt.format(dtf));
        dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dt.format(dtf));
        dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(dt.format(dtf));
        dtf = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(dt.format(dtf));
        dtf = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(dt.format(dtf));
        dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(dt.format(dtf));
        dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(dt.format(dtf));

        dtf = DateTimeFormatter.ofPattern("dd MMMM uuuu");
        System.out.println(dt.format(dtf));
        dtf = DateTimeFormatter.ofPattern("dd MMMM uuuu", new Locale("en", "US"));
        System.out.println(dt.format(dtf));
        ZonedDateTime zt = dt.atZone(ZoneId.systemDefault());

        System.out.println(ZoneId.getAvailableZoneIds());






    }
}
