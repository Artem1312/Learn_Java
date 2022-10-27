package Generic_types;

public class MyClass3 {
    public static void main(String[] args) {
        MyClass3.<Integer>print(10);
        MyClass3.<String>print("String");
        MyClass3.print(10);
        MyClass3.print("String_1");
        A__1 obj = new A__1();
        MyClass3.<A__1>echo(obj);
        MyClass3.echo(obj);
    }
    public static <T> void print(T obj) {
        System.out.println(obj.toString());
    }
    public static <T extends ITest> void echo(T obj) {
        obj.print();
    }
}

interface ITest {
    void print();
}

class A__1 implements ITest {
    private int x = 20;
    @Override
    public void print() {
        System.out.println("x = " + this.x);
    }
}