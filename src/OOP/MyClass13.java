package OOP;

public class MyClass13 {
    public static void main(String[] args) {
        B2 obj = new B2();
        obj.func();
    }
}

class A2 {
    public void func() {
        System.out.println("A2.func()");
    }
}

class B2 extends A2 {
    @Override
    public void func() {
        System.out.println("B2.func()");
        super.func();
    }
}