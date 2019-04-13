public class Barn extends Land {
    // Constructor
    // Point p to (_x,_y), IsOccupied to 0
    public Barn(int _x, int _y, bool _isgrassgrown){
        super(_x, _y, _isgrassgrown);
    }

    // OUTPUT : 'x'
    // override Render::Land::render() ==> real class
    public char render(){
        return isGrassGrown ? '@' : 'x';
    }
}