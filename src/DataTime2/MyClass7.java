package DataTime2;

import java.time.*;

public class MyClass7 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        ZonedDateTime zdt = dt.atZone(ZoneId.systemDefault());
        System.out.println(zdt);

        ZoneOffset z1 = ZoneOffset.ofHours(3);
        ZoneOffset z2 = ZoneOffset.of("+3");
        System.out.println(z1.toString());
        System.out.println(z2.toString());

        LocalDateTime dt1 = LocalDateTime.now();
        OffsetDateTime odt = dt1.atOffset(ZoneOffset.ofHours(3));
        System.out.println(odt);
    }
}
