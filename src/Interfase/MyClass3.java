package Interfase;

import Variables.MyClass;
import branch_operator.MyCLass8;

import java.util.Random;
import java.util.function.*;

public class MyClass3 {
    public static void main(String[] args) {
        MyClass3.test(n-> n*n, 10);
        MyClass3.test2((a,b) -> a+b, 10, 20);

        MyClass3.test3( n -> n != 0, 10);
        MyClass3.test3( n -> n != 0, 0);

        MyClass3.test4( (a,b) -> a == b, 10, 20);
        MyClass3.test4( (a,b) -> a == b, 10, 10);

        MyClass3.test5((obj) -> System.out.println(obj), 10);
        MyClass3.test5((obj) -> System.out.println(obj), 50);

        MyClass3.test6((a,b) -> System.out.println(a+b), 10, 15);
        MyClass3.test6((a,b) -> System.out.println(a+b), 10, 122);

        MyClass3.test7(() -> {
            Random r = new Random();
            return r.nextInt(101);
        });
    }
    public static void test(Function<Integer, Integer>f, int x) {
        System.out.println(f.apply(x));
    }
    public static void test2(BiFunction<Integer, Integer, Integer> f, int x, int y) {
        System.out.println(f.apply(x, y));
    }
    public static void test3(Predicate<Integer> f, int x) {
        System.out.println(f.test(x));
    }
    public static void test4(BiPredicate<Integer, Integer> f, int x, int y) {
        System.out.println(f.test(x, y));
    }
    public static void test5(Consumer<Object>f, Object obj) {
        f.accept(obj);
    }
    public static void test6(BiConsumer<Integer, Integer>f, int x, int y) {
        f.accept(x, y);
    }
    public static void test7(Supplier<Integer> f) {
        System.out.println(f.get());
    }
}
