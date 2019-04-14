package entities;

public class Point{
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    // SETTER GETTER METHODS

    // SETTER
    // Set x to arg
    public void setX(int x) { this.x = x; }

    // Set y to arg
    public void setY(int y) { this.y = y; }

    // Get value of x
    public int getX() { return x; }

    // Get value of y
    public int getY() { return y; }

    // Operator+ overloading
    public Point tambah(Point P) {
        Point temp = new Point(x,y);
        temp.x += P.x;
        temp.y += P.y;
        return temp;
    }

    // Operator- overloading
    public Point kurang(Point P) {
        Point temp = new Point(x,y);
        temp.x -= P.x;
        temp.y -= P.y;
        return temp;
    }
}