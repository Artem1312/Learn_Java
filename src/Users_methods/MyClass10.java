package Users_methods;

public class MyClass10 {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5,6));
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr));
    }

    public static int sum(int... a) {
        int result = 0;
        System.out.println("Values : " + a.length);
        for (int b: a) {
            result += b;
        }
        return result;
    }
}
