
public class Main {
    public static void main(String[] args) {
        ProductDatabase database = new ProductDatabase();
        ShopManager manager = new ShopManager(database);
        OnlineShopUI onlineShopUI = new OnlineShopUI();
        onlineShopUI.start();
    }
}
