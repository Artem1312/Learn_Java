package Users_methods;

import java.util.Date;

public class MyClass11 {
    public static void main(String[] args) {
        func(1, 2.5, "String");
        func(1, 2.5, 300L, "String", new Date());
    }

    public static void func(Object... a) {
        for (Object b: a) {
            System.out.println(b);
        }
    }
}
