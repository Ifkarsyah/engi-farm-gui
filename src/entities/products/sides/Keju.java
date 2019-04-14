public class Keju extends SideProduct {

    public Keju() {
        super(100000, "Keju");
        this.AddProduct(new SusuSapi());
        this.AddProduct(new SusuUnta());
    }
}