package OOP;

public class Class18 {
    public static void main(String[] args) {
        A18.B18 obj = new A18.B18();
        obj.func();
        A18 obj2 = new A18();
        obj2.func();
    }
}


class A18 {
    private static int x = 10;
    private B18 obj = new B18();
    public void func() {
        System.out.println("A18.func()");
        obj.func();
    }

    public static class B18 {
        public void func() {
            System.out.println("A.B.func()");
            System.out.println(x);
        }
    }
}