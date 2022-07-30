package Arrays;

import java.util.Arrays;

public class shuffleClass {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shuffle(int[] arr) {
        int tmp = 0, j = 0;
        for (int i = 0; i < arr.length; i++) {
            j = (int) (Math.random() * arr.length);
            if (i == j) continue;
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
}
