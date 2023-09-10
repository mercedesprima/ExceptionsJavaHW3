import java.util.List;
import java.util.Scanner;

public class OnlineShopUI {

    public OnlineShopUI() {
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press '1' to see the entire products list");
        System.out.println("Press '2' to add products to the cart");
        System.out.println("Press '3' to exit");
        while (true) {
            System.out.println("Please, enter your command: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1" -> getAllInventory();
                case "2" -> addToCart();
                case "3" -> {
                    return;
                }
            }
        }
    }

    private void getAllInventory() {
        List<Product> inventory = ShopManager.getInventory();
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println("ID: " + (i + 1) + ",  " + inventory.get(i));
        }
    }
    public void addToCart() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter product ID: ");
            int productId = scanner.nextInt();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            double totalPrice = 0;
            try {
                totalPrice = ShopManager.purchaseProduct(productId, quantity);
                System.out.println("Total price: $" + totalPrice);
            } catch (ProductDatabaseException e) {
                System.out.println(e.getMessage());
            } catch (ShopManagerException e) {
                    System.out.println(e.getMessage());
            }
        }
    }