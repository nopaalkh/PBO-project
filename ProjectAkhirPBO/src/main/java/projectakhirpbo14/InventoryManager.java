/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectakhirpbo14;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Product> products = new ArrayList<>();
    private List<Supplier> suppliers = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    // Add, remove, and display methods
    public void addProduct(Product product) { products.add(product); }
    public void addSupplier(Supplier supplier) { suppliers.add(supplier); }
    public void addTransaction(Transaction transaction) { transactions.add(transaction); }

    public void displayAllProducts() {
        for (Product product : products) {
            product.displayProductInfo();
        }
    }

    public void displayAllSuppliers() {
        for (Supplier supplier : suppliers) {
            supplier.displaySupplierInfo();
        }
    }

    public void displayAllTransactions() {
        for (Transaction transaction : transactions) {
            transaction.displayTransactionInfo();
        }
    }

    // Getter Methods
    public List<Product> getProducts() {
        return products;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
    
    public void removeProduct(String productId) {
    Product productToRemove = null;
    for (Product product : products) {
        if (product.getProductId().equals(productId)) {
            productToRemove = product;
            break;
        }
    }
    if (productToRemove != null) {
        products.remove(productToRemove);
        System.out.println("Product with ID " + productId + " has been removed.");
    } else {
        System.out.println("Product with ID " + productId + " not found.");
    }
}

    void deleteProduct(String id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
