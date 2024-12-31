/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectakhirpbo14;

/**
 *
 * @author hp
 */
public class Supplier {
    private String supplierId;
    private String name;
    private String contactInfo;

    // Constructor
    public Supplier(String supplierId, String name, String contactInfo) {
        this.supplierId = supplierId;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters
    public String getSupplierId() { return supplierId; }
    public void setSupplierId(String supplierId) { this.supplierId = supplierId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }

    // Display supplier information
    public void displaySupplierInfo() {
        System.out.println("Supplier ID: " + supplierId);
        System.out.println("Name: " + name);
        System.out.println("Contact Info: " + contactInfo);
    }
}
