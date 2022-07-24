package divison_by_zero;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0, y = 0;
        System.out.print("x = ");
        x = in.nextInt();
        System.out.print("y = ");
        y = in.nextInt();
        if (y == 0) {
            System.out.println("Don't division by zero");
            System.exit(1);
        }
        System.out.println("Result = " + (x/y));
    }
}
