package Users_methods;

public class MyClass8 {
    public static void main(String[] args) {
        String result = "";
        result = join(new int[] {1,2,3,4,5}, "; ");
        System.out.println(result);
    }

    public static String join(int[] a, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(String.valueOf(a[i]));
            if (i != a.length -1) sb.append(s);
        }
        return sb.toString();
    }
}
