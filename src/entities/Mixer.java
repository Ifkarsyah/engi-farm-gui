public class Mixer extends Facility {
    // Constructor
    // Set position p to (_x,_y), isOccupied to true, category to "mixer",
    public Mixer(int _x, int _y) {
        super(_x, _y);
    }

    // Mix method
    // Param : Reference to player and side product which is going to be produced

    public void mix(List<Product> inv, SideProduct sp, boolean[] success) {
        List<Product> prod = new List();
        prod.copy(sp.getProductList());
        for (int i = 0; i < prod.getSize(); i++) {
            Product bahan = prod.get(i);
            if (inv.find(bahan) == -1){
                success[0] = false;
                break;
            }
        }
        if (success[0]) {
            success[0] = true;
            for (int i = 0; i < prod.getSize(); i++){
                Product bahan = prod.get(i);
                inv.remove(bahan);
            }
            inv.add(sp);
        }
    }

    public char render() {
        return 'M';
    }
}