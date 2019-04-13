public class Well extends Facility {
    private int water;

    // User-defined constructor
    // Position set to (_x,_y), category changed to "well", water_taken is set
    // to 0, isOccupied to True
    public Well(int _x, int _y){
        super(_x,_y);
        water = 0;
    }

    public Well(int _x, int _y, int _water){
        super(_x,_y);
        water = _water;
    }

    // SETTER and GETTER
    // GET water
    public int getWater() { return water; }

    // SET water
    public void setWater(int _w) { water = _w; }

    // render
    public char render() { return 'W'; }
}