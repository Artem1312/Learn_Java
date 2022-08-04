package DataTime;

import java.util.Date;

public class MyClass {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d.toString());
        System.out.println(d.getTime());
    }
}
