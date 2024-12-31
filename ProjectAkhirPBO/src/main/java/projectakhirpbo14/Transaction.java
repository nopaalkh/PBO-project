/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectakhirpbo14;

/**
 *
 * @author hp
 */
import java.time.LocalDate;

public class Transaction {
    private String transactionId;
    private String productId;
    private LocalDate date;
    private int quantity;
    private String type; // "in" for stock in, "out" for stock out

    // Constructor
    public Transaction(String transactionId, String productId, LocalDate date, int quantity, String type) {
        this.transactionId = transactionId;
        this.productId = productId;
        this.date = date;
        this.quantity = quantity;
        this.type = type;
    }

    // Getters and Setters
    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    // Display transaction information
    public void displayTransactionInfo() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Product ID: " + productId);
        System.out.println("Date: " + date);
        System.out.println("Quantity: " + quantity);
        System.out.println("Type: " + type);
    }
}

