package DataTime2;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class MyClass8 {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.uuuu HH:mm");
        String[] zones = {"Europe/Moscow", "Europe/Paris", "Europe/London", "Europe/Brussels", "Asia/Yakutsk", "Europe/Helsinki"};
        ZonedDateTime zdt = ZonedDateTime.now();
        for (int i = 0; i < zones.length; i++) {
            zdt = zdt.withZoneSameInstant(ZoneId.of(zones[i]));
            System.out.println(zones[i] + ": " + zdt.format(dtf));
        }
    }
}
