package branch_operator;

import java.awt.*;

public class MyClass5 {
    public static void main(String[] args) {
        Color color = Color.BLUE;
        switch (color) {
            case RED:
                System.out.println("RED");
                break;
            case BLUE:
                System.out.println("BLUE");
                break;
            case GREEN:
                System.out.println("GREEN");
        }
    }
}

enum Color {RED, BLUE, GREEN}
