public class Product {
    private String name;
    private int availableQuantity;
    private double price;

    @Override
    public String toString() {
        return String.format("Name: %s, Price: %f, Available Quantity: %d", name, price,availableQuantity);
    }

    public Product(String name, int availableQuantity, double price) {
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.price = price;
    }
    public int getAvailableQuantity() {
        return availableQuantity;
    }
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    public double getPrice() {
        return price;
    }
}
