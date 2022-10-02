package Interfase;

import java.util.function.Function;

public class MyClass4 {
    public static void main(String[] args) {
        A_4 obj = new A_4();
        obj.print();
    }
}

class A_4 {
    public static int sx = 40;
    public static final int MY_CONST = 50;
    private int cy = 125;

    public void print() {
        int x = 10;
        final int y = 20;
        int cy_tmp = this.cy;
        int sx_tmp = A_4.sx;

        Function<Integer, Integer> f = n -> {
            System.out.println(cy_tmp);
            System.out.println(this.cy);
            System.out.println(sx_tmp);
            System.out.println(A_4.sx);
            A_4.sx += 10;
            this.cy += 5;
            A_4.test();
            this.echo();
            return n + x + y + A_4.sx + MY_CONST + this.cy;
        };
        int z = 2;
        this.cy = 10;
        A_4.sx = 50;
        System.out.println(f.apply(10));
    }
    public void echo() {
        System.out.println("echo()");
    }
    public static void test() {
        System.out.println("test()");
    }
}