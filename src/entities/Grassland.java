package entities;

public class Grassland extends Land {
    // Constructor
    // Point p to (_x,_y), category to Grassland, IsOccupied to 0
    public Grassland(int _x, int _y, boolean _isgrassgrown) {
        super(_x, _y, _isgrassgrown);
    }

    // OUTPUT : '-'
    // override Render::Land::render() ==> real class
    public char render() {
        return isGrassGrown ? '#' : '-';
    }
}