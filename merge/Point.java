package merge;

public class Point {
    private int x;
    private int y;

    Point() {
        this.x = 0;
        this.y = 0;
    }
    Point(int a, int b) {
        this.x = a;
        this.y = b;

    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[ "+x+" , "+y+" ]";
    }
}
