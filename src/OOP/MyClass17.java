package OOP;

public class MyClass17 {
    public static void main(String[] args) {
        A17 obj = new A17();
        A17.B17 obj2 = obj.new B17();
        obj2.func();
    }
}


class A17 {
    private int x = 10;

    public class B17 {
        public void func() {
            System.out.println("A17.B17func()");
            System.out.println("A17.this.x");
        }
    }
}