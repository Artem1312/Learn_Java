package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass3 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher("10\n20\n30");
        while (m.find()) {
            System.out.println(m.group());
        }

        Pattern p2 = Pattern.compile("^[0-9]+$");
        Matcher m2 = p2.matcher("10\n20\n30");
        while (m2.find()) {
            System.out.println(m2.group());
        }

        Pattern p3 = Pattern.compile("^[0-9]+$", Pattern.MULTILINE);
        Matcher m3 = p3.matcher("10\n20\n30");
        while (m3.find()) {
            System.out.println(m3.group());
        }

        Pattern p4 = Pattern.compile("\\A[0-9]+\\z");
        Matcher m4 = p4.matcher("10\n20\n30");
        while (m4.find()) {
            System.out.println(m4.group());
        }

        Pattern p5 = Pattern.compile("[0-9]+");
        Matcher m5 = p5.matcher("Строка230");
        while (m5.find()) {
            System.out.println(m5.group());
        }

        Pattern p6 = Pattern.compile("^[0-9]+");
        Matcher m6 = p6.matcher("123Строка230");
        while (m6.find()) {
            System.out.println(m6.group());
        }

        Pattern p7 = Pattern.compile("[0-9]+$");
        Matcher m7 = p7.matcher("123Строка230");
        while (m7.find()) {
            System.out.println(m7.group());
        }

        // Pattern p8 = Pattern.compile("<b>.*</b>");
        // Pattern p8 = Pattern.compile("<b>.*?</b>");
        Pattern p8 = Pattern.compile("<b>(.*?)</b>", Pattern.DOTALL);
        Matcher m8 = p8.matcher("<b>Text1</b>Text2<b>Text3</b>");
        while (m8.find()) {
            System.out.println(m8.group(0));
            System.out.println(m8.group(1));
        }

        Pattern p9 = Pattern.compile("([a-z]+((st)|(xt)))", Pattern.DOTALL);
        Matcher m9 = p9.matcher("test text");
        while (m9.find()) {
            for (int i = 0; i < m9.groupCount(); i++) {
                System.out.println(m9.group(i + 1) + " ");
            }
            System.out.println();
        }

        Pattern p10 = Pattern.compile("([a-z]+(?:(?:st)|(?:xt)))", Pattern.DOTALL);
        Matcher m10 = p10.matcher("test text");
        while (m10.find()) {
            for (int i = 0; i < m10.groupCount(); i++) {
                System.out.println(m10.group(i + 1) + " ");
            }
            System.out.println();
        }

        Pattern p11 = Pattern.compile("(?<name>[a-z0-9_.-]+)@(?<host>(?:[a-z0-9-]+\\.)+[a-z]{2,6})");
        Matcher m11 = p11.matcher("user@mail.ru");
        while (m11.find()) {
            System.out.println(m11.group("name"));
            System.out.println(m11.group("host"));
        }


    }
}
