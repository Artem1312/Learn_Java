package branch_operator;

public class MyClass6 {
    public static void main(String[] args) {
        int i;
        for (i=1; i<=20; i++){
            System.out.println(i + " ");
        }
        System.out.println(i);
        System.out.println();

        for (int j = 1, l = 20+30; j <=l; j++){
            System.out.print(j + " ");
        }

        int f = 1;
        for(;;){
            if (f <= 10){
                System.out.println(f);
                f++;
            }
            else {
                break;
            }
        }

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int v: arr){
            System.out.println(v);
        }

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        for(var v: arr1){
            System.out.println(v);
        }

        System.out.println("While");

        int h = 1;
        while (h <= 100){
            System.out.println(h);
            h++;
        }

        System.out.println("Do ... While");
        int g = 1;
        do {
            System.out.println(g);
            g++;
        } while (g <=100);

        System.out.println("Continue");
        for (int r=1; r<=40; r++) {
            if(r > 4 && r < 11) continue;
            System.out.println(r);
        }

        System.out.println("break");
        int e = 1;
        while (true){
            if(e > 10) break;
            System.out.println(e);
            e++;
        }


    }
}
