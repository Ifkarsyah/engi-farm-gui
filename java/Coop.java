public class Coop extends Land {
    // Constructor
    // Point p to (_x,_y), category to Coop, IsOccupied to 0
    public Coop(int _x, int _y, bool _isgrassgrown){
        super(_x, _y, _isgrassgrown);
    }

    // OUTPUT : o
    // override Render::Land::render() ==> real class
    public char render(){
        return isGrassGrown ? '*' : 'o';
    }
}