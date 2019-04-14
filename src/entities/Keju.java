public class Keju extends SideProduct {

    public Keju() {
        super(100000, "Keju");
        this.addProduct(new SusuSapi());
        this.addProduct(new SusuUnta());
    }
}