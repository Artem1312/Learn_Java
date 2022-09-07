package OOP;

public class MyClass15 {
    public static void main(String[] args) {
        B4 obj = new B4();
        obj.func();
        obj.print();
    }
}

abstract class A4 {
    public abstract void func();
    public void print() {
        System.out.println("A4.print()");
    }
}

class B4 extends A4 {
    @Override
    public void func() {
        System.out.println("B4.func()");
    }
}