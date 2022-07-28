package Numbers;

import javax.swing.plaf.basic.BasicBorders;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;

public class MyCl1 {
    public static void main(String[] args) {
        char ch = 'w';
        System.out.println(ch + 10);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.BYTES);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.BYTES);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.BYTES);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.BYTES);

        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
        System.out.println(Character.BYTES);

        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.BYTES);

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.BYTES);

        BigDecimal x = new BigDecimal("0.3");
        BigDecimal y = new BigDecimal("0.1");
        x = x.subtract(y);
        x = x.subtract(y);
        x = x.subtract(y);
        System.out.println(x);

        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.abs(-1));
        System.out.println(Math.pow(10, 2));
        System.out.println(Math.pow(3.0, 4.0));
        System.out.println(Math.sqrt(100.0));

        System.out.println(Math.IEEEremainder(13.5, 2.0));
        System.out.println(13.5 - 2.0 * Math.round(13.5 / 2.0));
        System.out.println(13.5 % 2.0);

        System.out.println(Math.max(10, 3));
        System.out.println(Math.min(10, 3));

        System.out.println(Math.ceil(1.49));
        System.out.println(Math.ceil(1.5));
        System.out.println(Math.ceil(1.51));

        System.out.println(Math.floor(1.49));
        System.out.println(Math.floor(1.5));
        System.out.println(Math.floor(1.51));

        System.out.println(Math.round(1.49));
        System.out.println(Math.round(1.5));
        System.out.println(Math.round(1.51));

        System.out.println(Math.sin(Math.toRadians(90.0)));
        System.out.println(Math.cos(Math.toRadians(90.0)));
        System.out.println(Math.tan(Math.toRadians(90.0)));

        System.out.println(Math.asin(1));
        System.out.println(Math.acos(1));
        System.out.println(Math.atan(1));

        System.out.println(Math.toRadians(180.0));
        System.out.println(Math.toDegrees(Math.PI));

        byte b = 0;
        b = Byte.parseByte("10");
        System.out.println(b);

        System.out.println(Byte.parseByte("100", 10));
        System.out.println(Byte.parseByte("0100", 8));
        System.out.println(Byte.parseByte("77", 16));
        System.out.println(Byte.parseByte("01100", 2));

        byte b2 = 1;
        short sh = 20;
        int i1 = 100;
        float k = 10.3f;
        long l1 = 200L;
        double n = 1.8;

        System.out.println(Byte.toString(b2));
        System.out.println(Short.toString(sh));
        System.out.println(Integer.toString(i1));
        System.out.println(Float.toString(k));
        System.out.println(Long.toString(l1));
        System.out.println(Double.toString(n));

        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random() * 10);
        System.out.println(Math.random() * 100);
        System.out.println((int) (Math.random() * 10));
        System.out.println((int) (Math.random() * 10));
        System.out.println((int) (Math.random() * 10));

        Random r1 = new Random();
        Random r2 = new Random();
        System.out.println(r1.nextDouble());
        System.out.println(r2.nextDouble());
        Random r3 = new Random(1);
        Random r4 = new Random(1);
        System.out.println(r3.nextDouble());
        System.out.println(r4.nextDouble());

        Random r5 = new Random();
        r5.setSeed(1);
        System.out.println(r5.nextDouble());
        r5.setSeed(1);
        System.out.println(r5.nextDouble());
        r5.setSeed((new Date()).getTime());
        System.out.println(r5.nextDouble());

        Random r6 = new Random();
        System.out.println(r6.nextBoolean());
        System.out.println(r6.nextBoolean());
        System.out.println(r6.nextBoolean());

        Random r7 = new Random();
        System.out.println(r7.nextInt(5));
        System.out.println(r7.nextInt(5));
        System.out.println(r7.nextInt(5));
        System.out.println(r7.nextInt(5));
        System.out.println(r7.nextInt(5));

        byte[] arr = new byte[10];
        Random r8 = new Random();
        r8.nextBytes(arr);
        for (byte x4: arr) {
            System.out.print(x4 + " ");
        }

        System.out.println();

        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.NaN);
        System.out.println(Float.isFinite(10.0f / 0.0f));
        System.out.println(Float.isFinite(10.0f / 1.0f));
        System.out.println(Double.isFinite(10.0 / 0.0));
        System.out.println(Double.isFinite(-10.0 / 0.0));
        System.out.println(Float.isInfinite(10.0f / 0.0f));
        System.out.println(Float.isInfinite(10.0f / 1.0f));
        System.out.println(Double.isInfinite(10.0 / 0.0));
        System.out.println(Double.isInfinite(-10.0 / 0.0));



    }
}
