package branch_operator;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        System.out.println("Введите целое число");
        x = in.nextInt();
        if (x % 2 == 0)
            System.out.print(x + " - четное число");
        else
            System.out.print(x + " - нечетное число");
        System.out.println();
    }
}
