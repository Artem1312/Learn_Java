package Variables;

public class MyClass3 {
    static int x;

    public static void main(String[] args) {
        x = 10;
        System.out.println(x);
        func();
        System.out.println(x);
    }

    public static void func() {
        int x = 30;
        System.out.println(x);
        System.out.println(MyClass3.x);
        MyClass3.x = 88;
    }
}
