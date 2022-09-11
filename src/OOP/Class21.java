package OOP;

public class Class21 {
    public static void main(String[] args) {
        A21 objA21 = new A21();
        B21 objB21 = new B21();
        C21 objC21 = new C21();

        objA21.func();
        objB21.func();
        objC21.func();
        objC21.func2();

        A21 objA21_1 = new A21();
        A21 objA21_2 = new B21();
        A21 objA21_3 = new C21();

        objA21_1.func();
        objA21_2.func();
        objA21_3.func();
    }
}

class A21 {
    public void func() {
        System.out.println("A.func()");
    }
}

class B21 extends A21 {
    @Override
    public void func() {
        System.out.println("B.func()");
    }
}

class C21 extends B21 {
    @Override
    public void func() {
        System.out.println("C.func()");
    }
    public void func2() {
        System.out.println("C.func2()");
    }
}
