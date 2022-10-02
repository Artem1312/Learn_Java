package Interfase;

import java.util.Date;

public class MyClass8 {
    public static void main(String[] args) {
        A_9 obj1 = new A_9(10);
        A_9 obj2 = obj1.clone();
        System.out.println(obj1.getD());
        System.out.println(obj2.getD());
        obj2.newDate(1245L);
        System.out.println(obj1.getD());
        System.out.println(obj2.getD());

    }
}

class A_9 implements Cloneable {
    private int x;
    private Date d1;

    public A_9(int x) {
        this.x = x;
        this.d1 = new Date();
    }
    public int getX() {
        return this.x;
    }
    public Date getD() {
        return (Date) this.d1.clone();
    }
    public void newDate (long time) {
        this.d1.setTime(time);
    }
    @Override
    public A_9 clone() {
        A_9 obj = null;
        try {
            obj = (A_9) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.exit(1);
        }
        obj.d1 = (Date) this.d1.clone();
        return obj;
    }
}
