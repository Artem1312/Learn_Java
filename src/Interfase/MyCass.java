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

        test_E rw = new test_E();
        test_D obj3 = new test_D(rw, rw);
        obj3.change();
        obj3.print();

        test_G rw1 = new test_G();
        test_D obj4 = new test_D(rw1, rw1);
        obj4.change();
        obj4.print();

        test_H obj5 = new test_H();
        obj5.print();
        System.out.println(test_H.MY_CONST1);
        System.out.println(IConst.MY_CONST1);

        test_K k = new test_K();
        IStatic.print();

        IStaticPrivate.test();
        // IStaticPrivate.print();  //error
    }
}
