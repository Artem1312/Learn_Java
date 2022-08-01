package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher("12");
        if (m.matches()) {
            System.out.println("Строка соответствует шаблону");
        } else {
            System.out.println("Не соответствует");
        }

        if (Pattern.matches("^[0-9]+$", "12")) {
            System.out.println("Строка соответствует шаблону");
        } else {
            System.out.println("Не соответствует");
        }

        if ("12".matches("^[0-9]+$")) {
            System.out.println("Строка соответствует шаблону");
        } else {
            System.out.println("Не соответствует");
        }
    }
}
