package RegEx;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass4 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher("10 20 30");
        System.out.println(m.replaceFirst("+"));

        Pattern p2 = Pattern.compile("[a-z]+");
        Matcher m2 = p2.matcher("aa bb cc");
        System.out.println(m2.replaceFirst(mr -> {return mr.group().toUpperCase(Locale.ROOT);}));

        System.out.println("10 20 30".replaceFirst("[0-9]+", "+"));


    }
}
