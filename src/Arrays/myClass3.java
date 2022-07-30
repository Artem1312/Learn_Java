package Arrays;

import java.util.Arrays;
import java.util.Random;

public class myClass3 {
    public static void main(String[] args) {
        int[] arr = {10,5, 6, 1, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 8));
        System.out.println(-(-5) -1);

        byte[] arr1 = new byte[10];
        Random r = new Random();
        r.nextBytes(arr1);
        for (byte x: arr1) {
            System.out.print(x + " ");
        }
    }
}
