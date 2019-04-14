public class Sate extends SideProduct {

    public Sate(int _price, String _type) {
        super(_price, _type);
        this.addProduct(new DagingAyam());
        this.addProduct(new DagingDomba());
        this.addProduct(new DagingBebek());
        this.addProduct(new DagingKelinci());
        this.addProduct(new DagingSapi());
        this.addProduct(new DagingUnta());
        this.addProduct(new TelurBebek());
    }
}