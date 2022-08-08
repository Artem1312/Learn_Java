package DataTime;

public class MyClass8 {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        long t2 = System.nanoTime();
        System.out.println("0%");
        for (int i = 5; i < 101; i+=5) {
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i + "%");
        }
        System.out.println(System.currentTimeMillis() - t1);
        System.out.println(System.nanoTime() -t2);
    }
}
