package branch_operator;

public class MyClass3 {
    public static void main(String[] args) {
        int x, y;
        x = 0;
        y = 30 + 10 / (x==0 ? 1 : x);
        System.out.println(y);
        int x1, y1;
        x1 = 2;
        y1 = 30 + 10 / (x1==0 ? 1 : x1);
        System.out.println(y1);

        String s;
        int x2 = 10;
        s = (x2 % 2 == 0) ? func1() : func2();
        System.out.println(x2 + s);

    }

    public static String func1() {
        return " - четное число";
    }
    public static String func2() {
        return " - не четное число";
    }

}
