import java.util.ArrayList;
import java.util.List;
public class ProductDatabase {
    public List<Product> inventory;

    public List<Product> getInventory() {
        return  inventory;
    }

    public ProductDatabase() {
        this.inventory = new ArrayList<>();
        this.inventory.add(new Product("Product 1", 10, 5.99));
        this.inventory.add(new Product("Product 2", 4, 6.83));
        this.inventory.add(new Product("Product 3", 15, 7.32));
        this.inventory.add(new Product("Product 4", 12, 8.79));
        this.inventory.add(new Product("Product 5", 2, 9.45));
        this.inventory.add(new Product("Product 6", 40, 2.99));
        this.inventory.add(new Product("Product 7", 60, 10.629));
        this.inventory.add(new Product("Product 8", 75, 1.99));

    }

    public Product getProduct(int productId) throws ProductDatabaseException{
        if ((productId > 0) && (productId <= inventory.size())) {
            return inventory.get(productId - 1);
        }
        throw new ProductDatabaseException("Product not found");
    }
public void updateInventory(Product product, int quantity){
        product.setAvailableQuantity(product.getAvailableQuantity() - quantity);
}
}