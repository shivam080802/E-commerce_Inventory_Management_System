import java.util.*;

// Main class
public class Main {

    // Main method
    public static void main(String[] args) {
        // Create an InventoryManager object
        InventoryManager inventoryManager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        
        // Menu
        while (!exit) {
            System.out.println("==== Inventory Management System ====");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product Stock");
            System.out.println("3. Remove Product");
            System.out.println("4. Check Stock");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Get user input
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            // Process user input
            switch (choice) {

                // Add product
                case 1:
                    System.out.print("Enter product ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial stock quantity: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    inventoryManager.addProduct(id, name, stock);
                    System.out.println("Product added successfully.");
                    break;

                // Update product stock
                case 2:
                    System.out.print("Enter product ID: ");
                    String productId = scanner.nextLine();
                    System.out.print("Enter quantity to add/subtract: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    inventoryManager.updateProductStock(productId, quantity);
                    System.out.println("Stock updated successfully.");
                    break;

                // Remove product
                case 3:
                    System.out.print("Enter product ID: ");
                    String removeId = scanner.nextLine();
                    inventoryManager.removeProduct(removeId);
                    System.out.println("Product removed successfully.");
                    break;

                // Check stock
                case 4:
                    System.out.print("Enter product ID: ");
                    String checkId = scanner.nextLine();
                    inventoryManager.checkStock(checkId);
                    break;

                // Exit
                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        System.out.println("Exiting Inventory Management System.");
        scanner.close();
    }
}
