public abstract class Product {
    private int price;
    private String type;

    public Product(int price, String type) {
        this.price = price;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }

}
