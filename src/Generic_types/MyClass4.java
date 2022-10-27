package Generic_types;

public class MyClass4 {
    public static void main(String[] args) {
        A__2 obj1 = new A__2();
        obj1.<Integer>print(10);
        obj1.print(10);

        B__2<Integer> obj2 = new B__2<Integer>(50);
        obj2.<String>print(10, "String");
        obj2.print(10, "string");
    }
}

class A__2 {
    public <T> void print(T obj) {
        System.out.println(obj.toString());
    }
}

class B__2 <T>{
    private T obj;
    public B__2(T obj) {
        this.obj = obj;
    }
    public <U> void print(T obj1, U obj2) {
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(this.obj.toString());
    }
}