package Bytes_operations;

public class MyClass3 {
    public static void main(String[] args) {
        int x = 0b1011001;
        int n  = 0;
        while (x != 0) {
            if ((x & 1) != 0){
                System.out.println(n + " installed");
            }
            else {
                System.out.println(n + " dropped");
            }
            x = x >>> 1;
            n++;
        }
    }
}
