package Variables;

import java.nio.file.LinkOption;
import java.util.zip.DeflaterOutputStream;

public class MyClass {
    public static void main(String[] args) {
        System.out.println(Character.isJavaIdentifierStart('1'));
        System.out.println(Character.isJavaIdentifierPart('$'));

        boolean isInt;
        isInt = true;

        char ch;
        ch = 'c';

        byte x;
        x = 10;
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        short y;
        y = 20;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        int z;
        z = 30;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

        long a;
        a = 2147483648L;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        float b;
        b = 127.5F;
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        double cv;
        cv = 127.5;
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }
}
