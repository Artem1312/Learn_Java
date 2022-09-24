package Interfase;

public interface IStatic {
    static void test() {
        print();
    }
    static void print() {
        System.out.println("Hello");
    }
}
