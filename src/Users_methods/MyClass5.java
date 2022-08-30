package Users_methods;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyClass5 {
    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();
        System.out.printf("%tc\n", d);
        func1(d);
        System.out.printf("%tc\n", d);
        func2(d);
        System.out.printf("%tc\n", d);
    }

    public static void func1(GregorianCalendar d) {
        d = new GregorianCalendar(2022, Calendar.DECEMBER, 13);
    }

    public static void func2(GregorianCalendar d) {
        d.set(2024, Calendar.AUGUST, 25);
    }

}
