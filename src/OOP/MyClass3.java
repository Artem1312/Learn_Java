package OOP;

public class MyClass3 {
    public static void main(String[] args) {
        System.out.println(Class2.x);
        System.out.println(Class2.PI);
    }
}

class Class2 {
    public static int x;
    public static final double PI;
    static {
        x = 10;
        PI = 3.14;
    }
}