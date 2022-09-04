package OOP;

public class MyClass1 {
    public static void main(String[] args) {
        Point p = new Point();
        Point p2 = new Point();
        p.setX(10);
        p.setY(20);
        p2.setX(30);
        p2.setY(40);

        System.out.println(p.getX() + " " +p.getY());
        System.out.println(p2.getX() + " " +p2.getY());
    }
}
