package Users_methods;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyClass6 {
    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();
        System.out.printf("%tc\n", d);
        func((GregorianCalendar)d.clone());
        System.out.printf("%tc\n", d);
    }

    public static void func(GregorianCalendar d) {
        d.set(2022, Calendar.APRIL, 23);
    }
}
