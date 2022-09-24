package Interfase;

import java.util.Locale;

public class test_A implements IRead{
    @Override
    public String read() {
        return "String 1";
    }
}


class test_B extends test_A implements IRead {
    private String s = "String 2";
    @Override
    public String read() {
        return this.s;
    }
    public void print() {
        System.out.println(this.s);
    }
}


 class test_C implements IWrite {

     @Override
     public void write(String s) {
         System.out.println(s);
     }
 }

 class test_D {
    private IRead ir;
    private IWrite iw;
    private String str = "";
    public  test_D (IRead r, IWrite w) {
        this.ir = r;
        this.iw = w;
        this.str = ir.read();
    }
    public void change() {
        this.str = this.str.toUpperCase();
    }
    public void print() {
        this.iw.write(this.str);
    }
 }

class test_E implements IRead, IWrite {

    @Override
    public String read() {
        return "String 3";
    }

    @Override
    public void write(String s) {
        System.out.println(s);
    }
}

class test_G implements IReadWrite {

    @Override
    public String read() {
        return "String 4";
    }

    @Override
    public void write(String s) {
        System.out.println(s);
    }
}

class test_H implements IConst {

    @Override
    public void print() {
        System.out.println(test_H.MY_CONST1);
        System.out.println(test_H.MY_CONST2);
        System.out.println(test_H.MY_CONST3);
    }
}