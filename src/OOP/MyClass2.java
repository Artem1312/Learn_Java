package OOP;

public class MyClass2 {
    public static void main(String[] args) {
        Class1 c = new Class1();
        System.out.println(c.s);
    }
}

class Class1 {
    public String s = "Явная иннициализация";

    public Class1() {
        System.out.println(s);
        s = "Constructor";
    }
    // initions block
    {
        System.out.println(s);
        s = "Block";
    }
}
