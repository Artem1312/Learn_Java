package OOP;

public class MyClass16 {
    public static void main(String[] args) {
        A5 obj = new A5(10);
        obj.func();
    }
}

class A5 {
    private  B5 b;
    private  int  x;

    public A5(int x) {
        this.b = this.new B5();
        this.x = x;
    }

    public void func() {
        System.out.println("A5.func()");
        b.func();
    }

    private class B5 {
        public void func() {
            System.out.println("A5.B5.func()");
            System.out.println(A5.this.x);
            System.out.println(x);
        }
    }
}