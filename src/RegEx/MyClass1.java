package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass1 {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("^[a-z]+$",
                Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("ABCDEF");
        System.out.println(m.matches());


        Pattern p2 = Pattern.compile("^[а-яё]+$",
                Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher m2 = p2.matcher("АБГДЕЁЖЗ");
        System.out.println(m2.matches());


        System.out.println("АБВГДЕЁЖ".matches("^[а-яё]+$"));
        System.out.println("АБВГДЕЁЖ".matches("^[а-яА-ЯёЁ]+$"));


        Pattern p3 = Pattern.compile("^.$", Pattern.DOTALL);
        Matcher m3 = p3.matcher("\n");
        System.out.println(m3.matches());
        System.out.println("\n".matches("^.$"));


        Pattern p4 = Pattern.compile("^\\w+$",
                Pattern.UNICODE_CHARACTER_CLASS);
        Matcher m4 = p4.matcher("абв");
        System.out.println(m4.matches());
        System.out.println("абв".matches("^\\w+$"));


        Pattern p5 = Pattern.compile("[a-z]+", Pattern.LITERAL);
        Matcher m5 = p5.matcher("h");
        System.out.println(m5.matches());
        m5 = p5.matcher("[a-z]+");
        System.out.println(m5.matches());


        System.out.println("ABCDEF".matches("^[a-z]+$"));
        System.out.println("ABCDEF".matches("(?i)^[a-z]+$"));
        System.out.println("АБВГДЕЖ".matches("^[а-яё]+$"));
        System.out.println("АБВГДЕЖ".matches("(?iu)^[а-яё]+$"));
        System.out.println("\n".matches("^.$"));
        System.out.println("\n".matches("(?s)^.$"));


        System.out.println("ABC DEF".matches("^[a-z]+ [a-z]+$"));
        System.out.println("ABC DEF".matches("(?i:^[a-z]+) [a-z]+$"));
        System.out.println("ABC DEF".matches("(?i:^[a-z]+) [a-zA-Z]+$"));
        System.out.println("ABC DEF".matches("(?i:^[a-z]+) (?i:[a-z]+$)"));


        Pattern p6 = Pattern.compile("просто строка");
        Matcher m6 = p6.matcher("строка");
        System.out.println(m6.matches());
        m6 = p6.matcher("просто строка");
        System.out.println(m6.matches());



    }
}
