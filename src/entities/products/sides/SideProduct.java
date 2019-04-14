public class SideProduct extends Product {

    protected List<Product> product_list;

    public SideProduct(int _price, String _type) {
        super(_price, _type);
        product_list = new List<Product>();
    }

    public Product getProductListNumber(int idx) {
        return product_list.get(idx);
    }

    public int getNumberOfProducts() {
        return product_list.getSize();
    }

    public List<Product> getProductList() {
        return product_list;
    }

    public void AddProduct(Product p) {
        this.product_list.add(p);
    }
}
