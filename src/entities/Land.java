package entities;

import entities.Cell;

public class Land extends Cell {
    protected boolean isGrassGrown;

    // User defined ctor
    // set IsGrassGrown to _isgrassgrown param, set position to (_x,_y), set
    // isOccupied to false
    public Land(int _x, int _y, boolean _isgrassgrown) {
        super(_x, _y);
        isGrassGrown = _isgrassgrown;
    }

    // SETTER
    public void setIsGrassGrown(boolean _in) {
        isGrassGrown = _in;
    }

    // GETTER
    // return IsGrassGrown status (t/f)
    public boolean getIsGrassGrown() {
        return isGrassGrown;
    }
}