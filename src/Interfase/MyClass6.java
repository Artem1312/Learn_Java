package Interfase;

import java.util.function.Supplier;

public class MyClass6 {
    public static void main(String[] args) {
        Supplier<A_7> f = A_7::new;
        A_7 obj = f.get();
        System.out.println(obj.getX());
        f = () -> new A_7();
        obj = f.get();
        System.out.println(obj.getX());
    }
}

class A_7 {
    private int x;
    public A_7() {
        this.x = 10;
    }
    public int getX() {
        return this.x;
    }
}
