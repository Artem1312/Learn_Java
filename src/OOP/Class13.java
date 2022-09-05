package OOP;

public class Class13 {
    public static void main(String[] args) {
        C1 obj = new C1(10, 20, 30);
        System.out.println("A1.x = " + obj.x + "; B1.y = " + obj.x + "; C1.z = " + obj.z);
    }
}


class A1 {
    public int x;
    public A1 (int x) {
        this.x = x;
        System.out.println("A1.A1()");
    }
}

class B1 extends A1 {
    public int y;
    public B1 (int x, int y) {
        super(x);
        this.y = y;
        System.out.println("B1.B1()");
    }
}

class C1 extends B1 {
    public int z;
    public C1(int x, int y, int z) {
        super(x, y);
        this.x = x;
        System.out.println("C1.C1()");
    }
}