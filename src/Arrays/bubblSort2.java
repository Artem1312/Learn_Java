package Arrays;

import java.util.Arrays;

public class bubblSort2 {
    public static void main(String[] args) {
        int [] arr = {10, 5, 6, 1, 3};
        sortReverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortReverse(int[] arr) {
        int tmp = 0;
        boolean is_swap = false;
        for (int i = arr.length -1; i >= 1; i--) {
            is_swap = false;
            for (int j = 0; j < i; j++) {
                if(arr[j] < arr[j+1]){
                    tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                    is_swap = true;
                }
            }
            if(is_swap == false) break;
        }
    }
}
