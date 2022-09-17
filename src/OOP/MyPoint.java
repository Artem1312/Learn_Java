package OOP;

import java.util.Objects;

public class MyPoint {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(20, 51);
        System.out.println(p);
        System.out.println(p.toString());
        String s = "" + p;
        System.out.println(s);
        System.out.println(" ");
        MyPoint p1 = new MyPoint(20, 51);
        MyPoint p2 = new MyPoint(20, 51);
        MyPoint p3 = new MyPoint(1, 51);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        p1 = p3;
        System.out.println(p1.equals(p3));
        System.out.println(" ");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p1.getClass().getCanonicalName());
        System.out.println(p1.getClass().getName());
        System.out.println(p1.getClass().getSuperclass().getName());
    }



    private int x;
    private int y;
    public MyPoint() {
        this(0, 0);
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "[" + this.x + ", " + this.y + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return  false;
        if (this == obj) return  true;
        if (this.getClass() != obj.getClass()) return false;
        MyPoint p = (MyPoint) obj;
        return this.x == p.x && this.y == p.y;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }
}
