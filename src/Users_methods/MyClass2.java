package Users_methods;

public class MyClass2 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10.5, 20.7));
        System.out.println(sum(10L, 20L));
    }

    public static int sum(int x, int y ) {
        return x + y;
    }

    public static double sum(double x, double y ) {
        return x + y;
    }


}
