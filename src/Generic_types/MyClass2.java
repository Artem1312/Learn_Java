package Generic_types;

public class MyClass2 {
    public static void main(String[] args) {
        Class_A<A> c = new Class_A<A>(new A());
        c.test();
    }
}

interface ITest1 {
    void test1();
}
interface ITest2 {
    void test2();
}

class A implements ITest1, ITest2 {
    @Override
    public void test1() {
        System.out.println("test1()");
    }
    @Override
    public void test2() {
        System.out.println("test2()");
    }
}

class Class_A<T extends ITest1 & ITest2> {
    public T obj;
    public Class_A(T obj) {
        this.obj = obj;
    }
    public void test() {
        this.obj.test1();
        this.obj.test2();
    }
}