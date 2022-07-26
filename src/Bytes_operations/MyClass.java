package Bytes_operations;

public class MyClass {
    public static void main(String[] args) {
        int x = 100;
        System.out.println("x = ~x инверсия");
        System.out.printf("%32s\n", Integer.toBinaryString(x));
        x = ~x;
        System.out.printf("%32s\n", Integer.toBinaryString(x));
        System.out.println(" ");

        int x1 = 100, y = 75;
        int z = x1 & y;
        System.out.println("z = x1 & y  двоичное И");
        System.out.printf("%32s\n", Integer.toBinaryString(x1));
        System.out.printf("%32s\n", Integer.toBinaryString(y));
        System.out.printf("%32s\n", Integer.toBinaryString(z));
        System.out.println(" ");

        int x2 = 100, y2 = 75;
        int z2 = x2 | y2;
        System.out.println("z2 = x2 | y2  двоичное ИЛИ");
        System.out.printf("%32s\n", Integer.toBinaryString(x2));
        System.out.printf("%32s\n", Integer.toBinaryString(y2));
        System.out.printf("%32s\n", Integer.toBinaryString(z2));
        System.out.println(" ");

        int x3 = 100, y3 = 75;
        int z3 = x2 ^ y3;
        System.out.println("z3 = x2 ^ y3 двичное исключающее ИЛИ");
        System.out.printf("%32s\n", Integer.toBinaryString(x3));
        System.out.printf("%32s\n", Integer.toBinaryString(y3));
        System.out.printf("%32s\n", Integer.toBinaryString(z3));
        System.out.println(" ");

        int x4 = 100;
        System.out.printf("%32s\n", Integer.toBinaryString(x4));
        x4 = x4 << 1;
        System.out.printf("%32s\n", Integer.toBinaryString(x4));
        x4 = x4 << 1;
        System.out.printf("%32s\n", Integer.toBinaryString(x4));
        x4 = x4 << 2;
        System.out.printf("%32s\n", Integer.toBinaryString(x4));

        int x5 = 100;
        System.out.printf("%32s\n", Integer.toBinaryString(x5));
        x5 = x5 >> 1;
        System.out.printf("%32s\n", Integer.toBinaryString(x5));
        x5 = x5 >> 1;
        System.out.printf("%32s\n", Integer.toBinaryString(x5));
        x5 = x5 >> 2;
        System.out.printf("%32s\n", Integer.toBinaryString(x5));

        int x6 = -127;
        System.out.printf("%32s\n", Integer.toBinaryString(x6));
        x6 = x6 >> 1;
        System.out.printf("%32s\n", Integer.toBinaryString(x6));
        x6 = x6 >> 1;
        System.out.printf("%32s\n", Integer.toBinaryString(x6));
        x6 = x6 >> 2;
        System.out.printf("%32s\n", Integer.toBinaryString(x6));
        int x7 = -127;
        System.out.printf("%32s\n", Integer.toBinaryString(x7));
        x7 = x7 >>> 1;
        System.out.printf("%32s\n", Integer.toBinaryString(x7));
        x7 = x7 >>> 8;
        System.out.printf("%32s\n", Integer.toBinaryString(x7));

        byte x8 = 100, y8 = 75, z8;
        z8 = (byte)(x8 & y8);
        System.out.printf("%32s\n", Integer.toBinaryString(z8));

        x6 = x6 >> 2;
        System.out.printf("%32s\n", Integer.toBinaryString(x6));







    }
}
