package Users_methods;

import java.util.Arrays;

public class MyClass7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        func(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void func(int[] arr) {
        arr[0] = 9;
    }
}
