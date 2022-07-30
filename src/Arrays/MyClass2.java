package Arrays;

import java.util.Arrays;

public class MyClass2 {
    public static void main(String[] args) {
        int [][] arr = new int[2][4];
        System.out.println(Arrays.deepToString(arr));

        int[][] arr2 = {
                {1,2,3,4},
                {5,6,7,8}
        };
        System.out.println(Arrays.deepToString(arr2));

        System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][3]);

        arr[1][3] = 10;
        System.out.println(Arrays.deepToString(arr));
        numArr();
        toothArr();
        toothArr2();
        toothArr3();
    }

    public static void numArr() {
        System.out.println("Numered arrays");

        int [][] arr = new int[2][4];
        int n = 1;

        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = n;
                n++;
            }
        }

        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3s", arr[i][j]);
            }
            System.out.println();
        }
        for (int[] i: arr) {
            for (int j: i) {
                System.out.printf("%3s", j);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void toothArr() {
        int[][] arr = {
                {1},
                {2,3},
                {4,5,6},
                {7,8,9,10},
                {11,12,13,14,15}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3s", arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void toothArr2() {
        int[][] arr = new int[4][];
        arr[0] = new int[] {1};
        arr[1] = new int[] {2,3};
        arr[2] = new int[] {4,5,6};
        arr[3] = new int[] {7,8,9,10};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3s", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void toothArr3() {
        int[][] arr = new int[4][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[4];

        int n = 1;

        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = n;
                n++;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

}
