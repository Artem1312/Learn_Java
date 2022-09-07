package OOP;

public class MyClass14 {
    public static void main(String[] args) {
        B3 obj = new B3();
        obj.func();
    }
}


class A3 {
    public void func() {
        System.out.println("A2.func()");
    }
}

final class B3 extends A3 {
    @Override
    final public void func() {
        System.out.println("B2.func()");
        super.func();
    }
}
