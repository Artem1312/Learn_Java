package OOP;

public class MyClass10 {
    public static void main(String[] args) {
        // Class11 c1 = new Class11(10);
        Class11 c2 = Class11.getInstance(10);
        Class11 c3 = Class11.getInstance(45);
        System.out.println(c2.getX());
        System.out.println(c3.getX());
    }
}

class Class11 {
    private int x;

    private Class11 (int x) {
        this.x = x;
    }

    public static Class11 getInstance(int x) {
        return new Class11(x);
    }

    public int getX() {return this.x;}
}
