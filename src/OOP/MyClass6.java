package OOP;

public class MyClass6 {
    public static void main(String[] args) {
        System.out.println(Class7.PI);
        Class7 c = new Class7(10);
        System.out.println(c.MY_CONST);
        c = new Class7(20);
        System.out.println(c.MY_CONST);
    }
}

class Class7 {
    public final int MY_CONST;
    public static final double PI = 3.14;

    public Class7 (int x) {
        MY_CONST = x;
    }
}