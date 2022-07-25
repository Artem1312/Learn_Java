package Variables;

public class MyClass5 {
    public static void main(String[] args) {
        byte y1 =1, y2 =2;
        y1 = (byte) (y1 + y2);
        System.out.println(y1);

        short z1 = 1, z2 = 2;
        z1 = (short) (z1 + z2);
        System.out.println(z1);

        byte y3 = 127, y4 = 0;
        y3 = (byte) (y3 + y4);
        System.out.println(y3);

        byte y5 = 127, y6 = 10;
        y5 = (byte) (y5 + y6);
        System.out.println(y5);

        int a = 10, b = 3;
        System.out.println(a / b);
        System.out.println((double) a / b);

        var acc = true;
        System.out.println(acc);
        var ch = 'w';
        System.out.println(ch);
        var xxx = 10;
        System.out.println(xxx);
        var yyy = 10.5;
        System.out.println(yyy);
        var sss = "String";
        System.out.println(sss);

        for (var i = 0; i < 10; i++){
            System.out.println(i);
        }


    }
}
