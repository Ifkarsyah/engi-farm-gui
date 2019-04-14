package entities.cells.facilities;

public class Mixer extends Facility {
    // Constructor
    // Set position p to (_x,_y), isOccupied to true, category to "mixer",
    public Mixer(int _x, int _y) {
        super(_x, _y);
    }

    // Mix method
    // Param : Reference to player and side product which is going to be produced

    /*
     * public void mix(List<Product> &inv, SideProduct &sp, bool *success) {
     * List<Product> prod = sp.getProductList(); success = true;
     * 
     * for (int i = 0; i < prod.getSize(); i++) { Product bahan = prod.get(i); if
     * (inv.find(bahan) == -1) { success = false; break; } }
     * 
     * if (*success) { success = true; for (int i = 0; i < prod.getSize(); i++) {
     * Product bahan = prod.get(i); inv.remove(bahan); } inv.add(sp); } }
     */

    public char render() {
        return 'M';
    }
}