package Bytes_operations;

public class MyClass2 {
    public static void main(String[] args) {
        final byte FLAG1 = 1, FLAG2 = 2, FLAG3 = 4, FLAG4 = 8, FLAG5 = 16, FLAG6 = 32, FLAG7 = 64;
        byte x = 0;
        x = (byte) (x | FLAG1 | FLAG7);
        System.out.println(Integer.toBinaryString(x));

        x = (byte) (x | FLAG4 | FLAG5);
        System.out.println(Integer.toBinaryString(x));

        x = (byte) (x ^ FLAG4 ^ FLAG5);
        System.out.println(Integer.toBinaryString(x));

        if ((x & FLAG1) != 0) {
            System.out.println("FLAG1  установлен");
        }


    }
}
