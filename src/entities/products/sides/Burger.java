
public class Burger extends SideProduct {

    public Burger() {
        super(200000, "Burger");
        this.AddProduct(new DagingUnta());
        this.AddProduct(new DagingKelinci());
        this.AddProduct(new TelurAyam());
        this.AddProduct(new SusuSapi());
        this.AddProduct(new Keju());
    }

}