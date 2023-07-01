import java.util.*;


class InventoryManager {
    private Map<String, Product> products;

    // Constructor
    public InventoryManager() {
        products = new HashMap<>();
    }

    // Method to add product
    public void addProduct(String id, String name, int stock) {
        Product product = new Product(id, name, stock);
        products.put(id, product);
    }
    
    // Method to update product stock
    public void updateProductStock(String id, int quantity) {
        Product product = products.get(id);
        if (product != null) {
            product.updateStock(quantity);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to remove product
    public void removeProduct(String id) {
        products.remove(id);
    }
    
    // Method to check stock
    public void checkStock(String id) {
        Product product = products.get(id);
        if (product != null) {
            System.out.println("Stock: " + product.getStock());
        } else {
            System.out.println("Product not found.");
        }
    }
}