package Arrays;

import java.util.Arrays;

public class fillArr {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 50);
        System.out.println(Arrays.toString(arr));

        String [] arr1 = new  String[5];
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1, "");
        System.out.println(Arrays.toString(arr1));

        int [] arr2 = new int[10];
        Arrays.fill(arr2, 2,7,50);
        System.out.println(Arrays.toString(arr2));



    }
}
