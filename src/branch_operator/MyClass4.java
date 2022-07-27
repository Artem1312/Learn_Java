package branch_operator;

import java.util.Scanner;

public class MyClass4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int os = 0;
        System.out.println(
                "Какой ОС вы пользуетесь ? \n\n"
                + "1 - Windows XP\n"
                + "2 - Windows 11\n"
                + "3 - Linux Mint\n"
                + "4 - Other\n\n"
                + "Введите число, соответствующее ответу:"
        );
        os = in.nextInt();
        switch (os) {
            case 1:
                System.out.println("You choise - Windows XP");
                break;
            case 2:
                System.out.println("You choise - Windows 11");
                break;
            case 3:
                System.out.println("You choise - Linux Mint");
                break;
            case 4:
                System.out.println("You choise - Other");
                break;
            default:
                System.out.println("Мы не смогли определить систему");

        }
    }
}
