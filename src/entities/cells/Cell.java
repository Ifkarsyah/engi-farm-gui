package entities.cells;

import entities.Point;
import entities.Renderable;

public class Cell implements Renderable {
    // Default constructor
    // set isOccupied to false, p = (0,0), string to empty string
    Point p;

    public Cell() {
        p = new Point(0, 0);
    }

    // User defined constructor
    // Initialize cell position (_x,_y) and status isOccupied to false, string
    // category to s

    public Cell(int _x, int _y) {
        p = new Point(_x, _y);
    }

    // No ctor and operator= overriding -> bitwise copy behavior
    // No dtor as no free store object declared

    // Initialize cell position and status isOccupied
    public Cell(Point _p) {
        p = _p;
        // GA ADA OVERATOR=
    }

    // SETTER AND GETTER

    // GETTER
    // get Point;
    Point getPoint() {
        return p;
    }

    // SETTER
    // Set Point;
    void setPoint(Point p) {
        this.p = p;
    }

    public char render() {
        return 'X';
    }
    // Note:
    // Cell still ABS, because it does not override Render::render()
}