public class Land extends Cell {
    protected bool isGrassGrown;
    
    // User defined ctor
    // set IsGrassGrown to _isgrassgrown param, set position to (_x,_y), set
    // isOccupied to false
    public Land(int _x, int _y, bool _isgrassgrown){s
        super(_x,_y);
        isGrassGrown = _isgrassgrown;
    }

    // SETTER
    public void setIsGrassGrown(bool _in) { isGrassGrown = _in; }

    // GETTER
    // return IsGrassGrown status (t/f)
    public bool getIsGrassGrown() { return isGrassGrown; }
}