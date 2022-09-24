package Interfase;

public interface IPrivate {
    default void test() {
        print();
    }
    private void print() {
        System.out.println("Hello");
    }
}
