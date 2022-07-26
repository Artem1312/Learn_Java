package Bytes_operations;

public class MyClass4 {
    public static void main(String[] args) {
        System.out.println( 10 == 10);
        System.out.println( 10 == 5);
        System.out.println( 10 != 5);
        System.out.println( 10 < 5);
        System.out.println( 10 > 5);
        System.out.println( 10 <= 5);
        System.out.println( 10 >= 5);
        System.out.println( 10 == 5);
        System.out.println( !(10 == 5));

        System.out.println((10 == 10) && (5 != 3));
        System.out.println((10 == 10) && (5 == 3));

        System.out.println((10 == 10) || (5 != 3));
        System.out.println((10 == 10) || (5 == 3));

        int x = 0;
        System.out.println((10 == 10) || ((10/x) > 0));


    }
}
