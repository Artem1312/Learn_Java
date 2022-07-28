package Numbers;

import java.util.Random;

public class PasswordGeneration {
    public static void main(String[] args) {
        System.out.println(passwGen(6));
        System.out.println(passwGen(6));
        System.out.println(passwGen(6));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(8));
        System.out.println(passwGen(10));
        System.out.println(passwGen(10));
        System.out.println(passwGen(10));
        System.out.println(passwGen(10));
        System.out.println(passwGen(10));
        System.out.println(passwGen(10));
        System.out.println(passwGen(10));
        System.out.println(passwGen(10));
        System.out.println(passwGen(10));
        System.out.println(passwGen(10));
        System.out.println(passwGen(10));
        System.out.println(passwGen(10));
        System.out.println(passwGen(10));
        System.out.println(passwGen(10));
        System.out.println(passwGen(10));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));
        System.out.println(passwGen(15));

    }

    public static String passwGen(int count_char) {
        if (count_char < 1) return "";
        StringBuilder s = new StringBuilder();
        Random r = new Random();
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','p','q','r','s','t','u','v','w','x','y','z',
                'A','B','C','D','E','F','G','H','I','J','K','L','M','N','P','Q','R','S','T','U','V','W','X','Y','Z',
                '1','2','3','4','5','6','7','8','9','0'};
        for (int i = 0; i < count_char; i++) {
            s.append(arr[r.nextInt(arr.length)]);
        }
        return s.toString();
    }
}
