package Interfase;

public class MyCass {
    public static void main(String[] args) {
        IRead r1 = new test_A();
        test_B r2 = new test_B();
        IWrite w = new test_C();
        test_D obj1 = new test_D(r1, w);
        obj1.change();
        obj1.print();
        test_D obj2 = new test_D(r2, w);
        obj2.change();
        obj2.print();
    }
}
