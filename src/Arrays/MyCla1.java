package Arrays;

import java.util.Arrays;

public class MyCla1 {
    public static void main(String[] args) {
        int arr [];
        arr = new int[5];

        int [] arr1;
        arr1 = new int[3];

        int[] arr3 = new int[4];

        boolean[] arr4 = new boolean[2];

        String[] arr5 = new String[3];

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));

        int[] arr6 = new int[0];

        System.out.println(Arrays.toString(arr6));
        System.out.println(arr6.length);

        int[] arr7 = {10, 20, 30};
        System.out.println(Arrays.toString(arr7));
        System.out.println(arr7.length);

        int[] arr8 = {100, 200, 300};
        System.out.println(Arrays.toString(arr8));
        arr8 = new int[] {400, 500, 600};
        System.out.println(Arrays.toString(arr8));

        int[] arr9 = {10, 20, 30};
        int[] arr10 = {10, 20, 30, 40};
        System.out.println(Arrays.toString(arr9));
        arr9 = arr10;
        System.out.println(Arrays.toString(arr9));

        int [] arr11 = {10, 20, 30};
        int [] arr12 = {10, 20, 30, 40};
        arr11 = arr12;
        System.out.println(Arrays.toString(arr11));
        System.out.println(Arrays.toString(arr12));
        arr11[0] = 33;

        System.out.println(Arrays.toString(arr11));
        System.out.println(Arrays.toString(arr12));


        int[] arr13 = new  int[3];
        arr13[0] = 10;
        arr13[1] = 20;
        arr13[2] = 30;
        System.out.println(Arrays.toString(arr13));

        System.out.println(arr13[arr13.length -1]);

        int x = 0;
        x = arr13[1] + 12;
        arr13[2] = x - arr13[2];
        System.out.println(x);
        System.out.println(arr13[2]);


        int[] arr14 = new int[5];
        for (int i = 0, j = 1; i < arr14.length; i++, j++){
            arr14[i] = j;
        }

        for(int i = 0; i < arr14.length; i++){
            System.out.println(arr14[i] + " ");
        }
        System.out.println();
        System.out.println("__________________________________________");
        for(int i = arr14.length -1; i >= 0; i--){
            System.out.println(arr14[i] + " ");
        }

        int[] arr15 = new int[5];
        int i = 0, j = arr15.length;
        while (i < arr15.length) {
            arr15[i] = j;
            i++;
            j--;
        }
        i = 0;
        while (i < arr.length) {
            System.out.println(arr15[i] + " ");
            i++;
        }


    }
}
