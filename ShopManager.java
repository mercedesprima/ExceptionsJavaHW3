import java.util.List;

public class ShopManager {
    static ProductDatabase database = new ProductDatabase();
    public ShopManager(ProductDatabase database) {
        this.database = database;
    }
    public static double purchaseProduct(int productId, int quantity) throws ProductDatabaseException, ShopManagerException {
        Product product = database.getProduct(productId);
        if (product.getAvailableQuantity() < quantity){
            throw new ShopManagerException("Insufficient quantity");
        }
        double totalPrice = product.getPrice() * quantity;
        database.updateInventory(product, quantity);
        return totalPrice;
    }

    public static List<Product> getInventory() {
        return database.getInventory();
    }
}