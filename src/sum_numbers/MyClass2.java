package sum_numbers;

import java.util.Scanner;

public class MyClass2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        x = in.nextInt();
        System.out.println("You are input = " + x);

        long y;
        y = in.nextLong();
        System.out.println("You are input:" + y);

        short z;
        z = in.nextShort();
        System.out.println(z);

        float a;
        a = in.nextFloat();
        System.out.println(a);

        double b;
        b = in.nextDouble();
        System.out.println(b);

        String c;
        c = in.nextLine();
        System.out.println(c);
    }
}
