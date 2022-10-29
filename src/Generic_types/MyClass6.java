package Generic_types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyClass6 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr, 1,2,3,4,5,6);
        arr.forEach(elem -> System.out.println(elem));
        System.out.println(arr.toString());
        Iterator<Integer> it = arr.iterator();

        it.next();
        it.remove();
        it.next();
        it.remove();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(arr.toString());

        Collections.addAll(arr, 1,2,3,4,5,6);
        for (Integer item: arr) {
            System.out.println(item);
        }

        Iterator<Integer> it1 = arr.iterator();
        Iterator<Integer> it2 = arr.iterator();
        it2.next();
        it2.remove();
        //it1.next();
    }
}
