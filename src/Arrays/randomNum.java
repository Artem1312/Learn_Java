package Arrays;

import java.util.Arrays;
import java.util.Random;

public class randomNum {
    public static void main(String[] args) {
        int[] arr = new int[5];
        fillRandom(arr, 101);
        System.out.println(Arrays.toString(arr));
        fillRandom(arr, 101);
        System.out.println(Arrays.toString(arr));
    }

    public static void fillRandom(int[] arr, int n) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(n);
        }
    }
}
