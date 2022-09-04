package OOP;

public class Point {
    public static void main(String[] args) {
        Point p;
        p = new Point();
        Point p2 = new Point();
        var p3 = new Point();
        p3 = null;
        Point p4 = null;
    }
    public int x;
    public int y;

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

}

