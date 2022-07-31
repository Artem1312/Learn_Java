package Strings_chars;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class MyClass {
    public static void main(String[] args) {
        String s = "абвгдеёзжийклмнопрстуфхцчшщъыьюя"
                + "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩъЫЬЭЮЯ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvwxyz"
                + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        byte[] cp1251 = new byte[1];
        byte[] cp866 = new byte[1];
        byte[] koi8_r = new byte[1];

        try {
            cp1251 = s.getBytes("cp1251");
            cp866 = s.getBytes("cp866");
            koi8_r = s.getBytes("koi8_r");
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.out.printf("%6s %7s %7s %7s\n", "Символ", "cp1251", "cp866", "koi8_r");
        for (int i = 0; i < cp1251.length; i++) {
            System.out.printf("%6s %7d %7d %7d\n", s.charAt(i), cp1251[i], cp866[i], koi8_r[i]);
        }
    }
}
