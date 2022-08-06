package DataTime;

import java.util.Date;
import java.util.Locale;

public class MyClass {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d.toString());
        System.out.println(d.getTime());

        Date d2 = new Date(1923342312234L);
        System.out.println(d2.toString());
        System.out.println(d2.getTime());

        Date d3 = new Date((1520639811554L));
        if (d3.equals(new Date((1520639811554L))))
            System.out.println("Равны");
        else System.out.println("нет");
        if (d3.equals(new Date((1520639811553L))))
            System.out.println("Равны");
        else System.out.println("нет");


        Date d4 = new Date((1520639811554L));
        System.out.println(d4.before(new Date((1520639811554L))));
        System.out.println(d4.before(new Date((1520639811553L))));
        System.out.println(d4.before(new Date((1520639811555L))));

        Date d5 = new Date((1520639811554L));
        System.out.println(d5.compareTo(new Date((1520639811554L))));
        System.out.println(d5.compareTo(new Date((1520639811553L))));
        System.out.println(d5.compareTo(new Date((1520639811555L))));

        Date d6 = new Date((1520639811554L));
        System.out.println(d6.after(new Date((1520639811554L))));
        System.out.println(d6.after(new Date((1520639811553L))));
        System.out.println(d6.after(new Date((1520639811555L))));

        Date d7 = new Date();
        System.out.printf("%1$td.%1$tm.%1$tY", d7);
        System.out.printf("%tH:%<tM:%<tS", d7);
        System.out.printf("'%1$-6tH'", d7);
        System.out.printf("'%1$6tH'", d7);
        System.out.println();
        System.out.printf(new Locale("ru", "RU"),
                "%s %2$td.%2$tm.%2$tY %2$tH:%2$tM:%2$tS", "Сегодня:", d7);




    }
}
