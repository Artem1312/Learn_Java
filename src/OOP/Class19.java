package OOP;

public class Class19 {
    public static void main(String[] args) {
        A19 obj = new A19();
        obj.func(10);
    }
}


class A19 {
    private int z = 30;

    public void func(final int x) {
        int y = 20;

        class B19 {
            private int k = 40;
            public void func() {
                System.out.println("B.func()");
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
                System.out.println(A19.this.z);
                System.out.println(k);
                System.out.println(this.k);
            }
        }
        System.out.println("A.func()");
        B19 obj = new B19();
        obj.func();
    }
}