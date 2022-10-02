package Interfase;

public class MyClass7 {
    public static void main(String[] args) {
        A_8 obj1 = new A_8 (10);
        A_8 obj2 = new A_8 (10);
        A_8 obj3 = new A_8 (3);
        A_8 obj4 = new A_8 (15);
        System.out.println(obj1.compareTo(obj2));
        System.out.println(obj1.compareTo(obj3));
        System.out.println(obj1.compareTo(obj4));
        System.out.println(obj1.compareTo(obj1));

    }
}

class A_8 implements Comparable<A_8> {
    private int x;
    public A_8(int x) {
        this.x = x;
    }
    @Override
    public int compareTo(A_8 other) {
        if (this.x > other.x) return 1;
        if (this.x < other.x) return -1;
        return 0;
    }
}