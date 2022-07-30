package Arrays;

import java.util.Arrays;

public class MyClass4 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6}, arr2;
        arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        arr2[0] = 33;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
