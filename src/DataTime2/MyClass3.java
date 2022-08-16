package DataTime2;

import java.time.LocalTime;

public class MyClass3 {
    public static void main(String[] args) {
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        LocalTime t = LocalTime.now();
        System.out.println(t.toString());




    }
}
