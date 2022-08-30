package Users_methods;

public class MyClass {
    public static void main(String[] args) {
        int n;
        n = sum(3, 5);
        print("Message");
        print("n = " + n);
        printOK();
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void printOK() {
        System.out.println("OK");
    }
}
