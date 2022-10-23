package Generic_types;

import java.util.Objects;
import java.util.function.Function;

public class MyClass1 {
    public static void main(String[] args) {
        Function<Integer, Integer> f = (Integer n) -> n*2;
        int x = f.apply(20);
        System.out.println(x);

        Box box1 = new Box("String");
        Box box2 = new Box(10);

        String s = (String) box1.getObj();
        int x1 = (int) box2.getObj();

        System.out.println(s);
        System.out.println(x1);

        box1.setObj(10);
        String s2 = "";
        int x2 = 0;

        if (box1.getObj() instanceof String) {
            s2 = (String) box1.getObj();
            System.out.println(s2);
        }

        else if (box1.getObj().getClass() == Integer.class) {
            x2 = (int) box1.getObj();
            System.out.println(x2);
        }


        /////////////////////////////

        Box2<String> box_2 = new Box2<String>("String");
        box_2.setObj("String 2");
        String s_2 = box_2.getObj();
        System.out.println(s_2);
    }
}

class Box {
    private Object obj;

    public Box(Object obj) {
        this.setObj(obj);
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

class Box2 <T> {
    private T obj;
    public Box2(T obj) {
        this.setObj(obj);
    }
    public T getObj() {
        return obj;
    }
    public void setObj(T obj) {
        this.obj = obj;
    }
}