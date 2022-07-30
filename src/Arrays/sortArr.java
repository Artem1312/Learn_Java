package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class sortArr {
    public static void main(String[] args) {
        int [] arr = {10, 5, 6, 1, 3};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int [] arr1 = {10, 5, 6, 1, 3};
        Arrays.sort(arr1, 0, 3);
        System.out.println(Arrays.toString(arr1));

        Integer [] arr2 = {10, 5, 6, 1, 3};
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));



    }
}
