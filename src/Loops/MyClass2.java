package Loops;

public class MyClass2 {
    public static void main(String[] args) {
        int x = 0, y = 0;
        x = 5;
        y = x++;
        System.out.println("Постфиксная форма записи (y = x++;):");
        System.out.println("Y = " + y);
        System.out.println("X = " + x);
        x=5;
        y=++x;

        System.out.println("Префиксная форма (y = ++x");
        System.out.println("y = " + y);
        System.out.println("x = " + x);
    }
}
