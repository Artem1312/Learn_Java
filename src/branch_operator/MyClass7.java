package branch_operator;

import java.util.Scanner;

public class MyClass7 {
    public static void main(String[] args) {
        int x = 0, result = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 0 для получения результата\n");
        for (;;) {
            System.out.println("Введите число: ");
            x = in.nextInt();
            if (x == 0) break;
            result += x;
        }
        System.out.println("Сумма числе равнв: " + result);
    }
}
