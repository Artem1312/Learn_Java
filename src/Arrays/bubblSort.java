package Arrays;

import java.util.Arrays;

public class bubblSort {
    public static void main(String[] args) {
        int [] arr = {10, 5, 6, 1, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int tmp = 0, k = arr.length -2;
        boolean is_swap = false;
        for (int i = 0; i <= k; i++) {
            is_swap = false;
            for (int j = k; j >= i ; j--) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                    is_swap = true;
                }
            }
            if (is_swap == false) break;
        }

    }
}
