import java.util.*;

class Product {
    private String id;
    private String name;
    private int stock;

    // Constructor for Product
    public Product(String id, String name, int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    // Method to get product ID
    public String getId() {
        return id;
    }
    

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void updateStock(int quantity) {
        stock += quantity;
    }
}