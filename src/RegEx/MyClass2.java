package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass2 {
    public static void main(String[] args) {
        String d = "29,08.2018";
        Pattern p = Pattern.compile("^[0-3][0-9].[01][0-9].[12][09][0-9][0-9]$");
        Matcher m = p.matcher(d);
        if (m.matches())
            System.out.println("дата введена правильно");
        else
            System.out.println("Дата введена неправильно");

        p = Pattern.compile("^[0-3][0-9]\\.[01][0-9]\\.[12][09][0-9][0-9]$");
        m = p.matcher(d);
        if (m.matches())
            System.out.println("дата введена правильно");
        else
            System.out.println("Дата введена неправильно");

        p = Pattern.compile("^[0-3][0-9][.][01][0-9][.]][12][09][0-9][0-9]$");
        m = p.matcher(d);

        if (m.matches())
            System.out.println("дата введена правильно");
        else
            System.out.println("Дата введена неправильно");

    }
}
