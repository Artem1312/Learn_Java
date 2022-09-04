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
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x , int y) {
        setX(x);
        setY(y);
    }

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

