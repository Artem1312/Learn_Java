package Strings_chars;

import javax.sound.midi.Soundbank;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;

public class MyCl1 {
    public static void main(String[] args) {
        String s = "";
        String s1 = new String();
        System.out.println(s1.length());
        char[] arr1 = {'s', 't', 'r', 'i', 'n', 'g'};

        String s2 = new String(arr1);
        System.out.println(s2);

        byte[] arr2 = {115, 116, 114, 105, 110, 103};
        String s3 = new String(arr2);
        System.out.println(s3);

        String s4 = String.valueOf(10);
        System.out.println(s4);
        String s5 = String.valueOf(15.23);
        System.out.println(s5);

        char[] arr3 = {'s', 't', 'r', 'i', 'n', 'g'};
        String s6 = String.valueOf(arr3);
        System.out.println(s6);

        char ch;
        ch = s6.charAt(3);
        System.out.println(ch);

        String s7 = "0123456789";
        System.out.println(s7.substring(0));
        System.out.println(s7.substring(5));
        System.out.println(s7.substring(0, 10));
        System.out.println(s7.substring(5, 8));

        System.out.println(s7.concat("ABC"));

        StringBuilder sb = new StringBuilder();
        sb.append("String1");
        sb.append("String2");
        sb.append(10);
        sb.append(8.5);
        String s8 = sb.toString();
        System.out.println(s8);

        System.out.println(Locale.getDefault());
        System.out.println(Arrays.toString(Locale.getAvailableLocales()));

        System.out.println(s6.toLowerCase(Locale.ROOT));
        System.out.println(s6.toUpperCase(Locale.ROOT));

        String s10 = "string", s11 = "string";
        System.out.println(s10.equals(s11));
        System.out.println(s10.substring(0, 2).equals(s11.substring(0, 2)));
        System.out.println(s10.equals("STRING"));

        System.out.println(s10.equalsIgnoreCase(s11));
        System.out.println(s10.equalsIgnoreCase("STRING"));

        String s13 = "текст";
        byte [] arr = new byte[0];
        try {
            arr = s13.getBytes("cp1251");
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println(Arrays.toString(arr));

        byte[] arr4 = {-14, -27, -22, -15, -14};
        String s14 = "";
        try {
            s14 = new String(arr4, "cp1251");
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println(s14);

        byte[] arr5 = {-14, -27, -22, -15, -14};
        System.out.write(arr5, 0, arr5.length);

    }
}
