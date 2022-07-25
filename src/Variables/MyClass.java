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

        int df = 3, dc = 23, sx = df + dc;
        System.out.println(sx);

        boolean ab, bb;
        ab = true;
        bb = false;
        System.out.println(ab);
        System.out.println(bb);

        char ch1, ch2;
        ch1 = 119;
        ch2 = 'w';
        char ch3 = '\u005B';
        char ch4 = '\u005D';
        System.out.println(ch3 + " " + ch1 + " " + ch2 + ch4);

        int xx, yy, zz, cc;
        xx = 119;
        yy = 0167;
        zz = 0x77;
        cc = 0b01110111;
        System.out.println(xx + ' ' + yy + ' '+ zz + ' ' + cc);

        final int MY_CONST = 10;
        int yyy;
        yyy = MY_CONST + 20;

    }
}
