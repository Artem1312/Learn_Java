package OOP;

public class MyClass8 {
    public static void main(String[] args) {
        System.out.println(Class9.PI);
        System.out.println(Class9.x);
        Class9.x += 10;
        System.out.println(Class9.x);
        System.out.println(Class9.sum(1, 2));
    }
}

class Class9 {
    public static int x;
    public static final double PI = 3.14;
    public static int sum(int i, int j) {
        return i + j;
    }
    static {
        x  = 10;
    }
}