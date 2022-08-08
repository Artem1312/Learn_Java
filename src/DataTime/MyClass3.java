package DataTime;

import java.util.Calendar;
import java.util.Locale;

public class MyClass3 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("ru", "RU"));
        Calendar c = Calendar.getInstance();
        System.out.printf(
                "Сегодня : \n"
                +"%1$td %1$tB %1$tY %1$tH:%1$tM:%1$tS \n"
                +"%1$td.%1$tm.%1$tY\n", c
        );
    }
}
