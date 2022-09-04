package OOP;

public class MyClass {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.topLeft.x = 0;
        rect.topLeft.y = 0;
        rect.bottomRight.x = 100;
        rect.bottomRight.y = 100;
        System.out.println(rect.topLeft.x + " " +
                rect.topLeft.y + " " +
                rect.bottomRight.x + " " +
                rect.bottomRight.y);
    }
}
