package Numbers;

import java.math.BigDecimal;

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


    }
}
