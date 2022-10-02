package Interfase;

public class MyClass5 {
    public static void main(String[] args) {
        MyButton1 button1 = new MyButton1();
        A_5 a_5 = new A_5();
        button1.reg(a_5::printOnClick);
        for (int i = 0; i < 5; i++) {
            button1.click();
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}

class A_5 {
    private  int x = 10;
    public void printOnClick() {
        System.out.println("Button on. x = " + this.x);
        this.x++;
    }
}

class MyButton1 {
    private IClick1 ic = null;
    public void reg(IClick1 ic) {
        this.ic = ic;
    }
    public void click() {
        if (this.ic != null)
            this.ic.onClick();
    }
}