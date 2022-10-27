package Generic_types;

public class MyClass5 {
    public static void main(String[] args) {
        Box_5<Integer> obj1 = new Box_5<Integer>(10);
        Box_5<Double> obj2 = new Box_5<Double>(5.6);

        MyClass5.print1(obj1);
        MyClass5.print2(obj1);
        MyClass5.print2(obj2);
        MyClass5.print3(obj1);
        MyClass5.print3(obj2);
        MyClass5.print4(obj1);
        MyClass5.print4(obj2);
        MyClass5.print5(obj1);
        Box_5<Number> obj3 = new Box_5<Number>(5.6);
        MyClass5.print5(obj3);
    }
    public static void print1(Box_5<Integer> obj) {
        System.out.println(obj.getObj().intValue());
    }
    public static void print2(Box_5<?> obj) {
        System.out.println(obj.getObj().toString());
    }
    public static void print3(Box_5<? extends Number> obj) {
        System.out.println(obj.getObj().doubleValue());
    }
    public static <T extends Number> void print4(Box_5<T> obj) {
        System.out.println(obj.getObj().doubleValue());
        //System.out.println(obj.setObj(obj.getObj()));
    }
    public static void print5(Box_5<? super Integer> obj) {
        System.out.println(obj.getObj().toString());
    }


}

class Box_5 <T> {
    private T obj;
    public Box_5(T obj) {
        this.setObj(obj);
    }
    public T getObj() {
        return obj;
    }
    private void setObj(T obj) {
        this.obj = obj;
    }
}