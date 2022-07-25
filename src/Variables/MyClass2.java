package Variables;

public class MyClass2 {
    static int x;
    static final int MY_CONST = 50;

    public static void main(String[] args) {
        System.out.println(x);
        x = 10;
        System.out.println(x);
        MyClass2.x = 88;
        System.out.println(x);
        System.out.println(MyClass2.x);
        System.out.println(MY_CONST);
        System.out.println(MyClass2.MY_CONST);
    }
}
