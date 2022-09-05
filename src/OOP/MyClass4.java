package OOP;

public class MyClass4 {
    public static void main(String[] args) {
        Class5 c = new Class5();
        System.out.println(c.getX());
        c = new Class5(33);
        System.out.println(c.getX());

    }
}

class Class5 {
    private int x;

    public Class5() {
        this(25);
    }

    public Class5(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
