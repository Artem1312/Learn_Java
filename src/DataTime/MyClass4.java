package DataTime;

import java.util.Calendar;
import java.util.Locale;

public class MyClass4 {
    public static void main(String[] args) {
        Locale ru_RU = new Locale("ru", "RU");
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(1520702397754L);
        System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.SHORT, ru_RU));
        System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.SHORT_STANDALONE, ru_RU));
        System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.LONG, ru_RU));
        System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.LONG_STANDALONE, ru_RU));
    }
}
