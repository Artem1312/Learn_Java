package Arrays;

public class searchInArr {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 1, 3};
        System.out.println(search(arr, 6));
    }

    public static int search(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        return index;
    }
}
