package OOP;

public class MyClass1 {
    public static void main(String[] args) {
        Point p = new Point();
        Point p2 = new Point();
        p.x = 10;
        p.y = 20;
        p2.x = 30;
        p2.y = 40;

        System.out.println(p.x + " " +p.y);
        System.out.println(p2.x + " " +p2.y);
    }
}
