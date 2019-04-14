public class Burger extends SideProduct {

    public Burger() {
        super(200000, "Burger");
        this.addProduct(new DagingUnta());
        this.addProduct(new DagingKelinci());
        this.addProduct(new TelurAyam());
        this.addProduct(new SusuSapi());
        this.addProduct(new Keju());
    }

}