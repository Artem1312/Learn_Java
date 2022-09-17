package OOP;

public class MyClass18 {
    public static void main(String[] args) {
        A_18 obj = new A_18();
        A_18.func(obj);
        MyClass18.func(obj);
        System.out.println(obj.s);
    }

    public static void func(A_18 obj) {
        //System.out.println(obj.x);
        System.out.println(obj.getX());
        System.out.println(obj.s);
        obj.s = "new string";
    }
}

class A_18 {
    private int x = 10;
    public String s = "String";

    public static void func (A_18 obj) {
        System.out.println(obj.x);
        System.out.println(obj.s);
        obj.x = 50;
    }
    public int getX() {
        return this.x;
    }
}