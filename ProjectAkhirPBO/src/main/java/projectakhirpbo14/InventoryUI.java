/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectakhirpbo14;

/**
 *
 * @author hp
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class InventoryUI extends JFrame {

    private InventoryManager inventoryManager;
    private JTextField txtProductId, txtProductName, txtQuantity, txtPrice;
    private JTextField txtSupplierId, txtSupplierName, txtSupplierContact;
    private JTextField txtTransactionId, txtTransactionProductId, txtTransactionQuantity, txtTransactionType, txtTransactionDate;
    private JTextField txtDeleteProductId;

    public InventoryUI() {
        inventoryManager = new InventoryManager();
        initComponents();
    }

    private void initComponents() {
        setTitle("Gudang Sekawan");
        setSize(600, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Header
        JLabel headerLabel = new JLabel("PT. Gudang Sekawan", JLabel.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 20));
        headerLabel.setForeground(Color.BLACK);
        mainPanel.add(headerLabel);

        // Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();
        
        // Panel for Product Form
        JPanel panelProduct = createProductPanel();
        tabbedPane.addTab("Produk", panelProduct);

        // Panel for Supplier Form
        JPanel panelSupplier = createSupplierPanel();
        tabbedPane.addTab("Supplier", panelSupplier);

        // Panel for Transaction Form
        JPanel panelTransaction = createTransactionPanel();
        tabbedPane.addTab("Transaksi", panelTransaction);

        // Panel for Delete Product Form
        JPanel panelDeleteProduct = createDeleteProductPanel();
        tabbedPane.addTab("Hapus Produk", panelDeleteProduct);

        mainPanel.add(tabbedPane);

        // Add main panel to frame
        add(mainPanel);

        // Display the window
        setVisible(true);
    }

    // Create Product Panel
    private JPanel createProductPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createTitledBorder("Tambah Produk"));

        txtProductId = new JTextField(15);
        txtProductName = new JTextField(15);
        txtQuantity = new JTextField(5);
        txtPrice = new JTextField(5);
        JButton btnAddProduct = new JButton("Tambah Produk");
        JButton btnViewProducts = new JButton("Lihat Semua Produk");

        panel.add(new JLabel("ID Produk:"));
        panel.add(txtProductId);
        panel.add(new JLabel("Nama Produk:"));
        panel.add(txtProductName);
        panel.add(new JLabel("Jumlah:"));
        panel.add(txtQuantity);
        panel.add(new JLabel("Harga:"));
        panel.add(txtPrice);
        panel.add(btnAddProduct);
        panel.add(btnViewProducts);

        btnAddProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });

        btnViewProducts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewProducts();
            }
        });
        return panel;
    }

    // Create Supplier Panel
    private JPanel createSupplierPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createTitledBorder("Masukkan Supplier"));

        txtSupplierId = new JTextField(15);
        txtSupplierName = new JTextField(15);
        txtSupplierContact = new JTextField(15);
        JButton btnAddSupplier = new JButton("Masukkan Supplier");
        JButton btnViewSuppliers = new JButton("Lihat Semua Suppliers");

        panel.add(new JLabel("ID Supplier:"));
        panel.add(txtSupplierId);
        panel.add(new JLabel(" Nama Supplier:"));
        panel.add(txtSupplierName);
        panel.add(new JLabel("Info Contact:"));
        panel.add(txtSupplierContact);
        panel.add(btnAddSupplier);
        panel.add(btnViewSuppliers);

        btnAddSupplier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addSupplier();
            }
        });

        btnViewSuppliers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewSuppliers();
            }
        });
        return panel;
    }

    // Create Transaction Panel
    private JPanel createTransactionPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));
        panel.setBorder(BorderFactory.createTitledBorder("Tambah Transaksi"));

        txtTransactionId = new JTextField(15);
        txtTransactionProductId = new JTextField(15);
        txtTransactionQuantity = new JTextField(5);
        txtTransactionType = new JTextField(5);
        txtTransactionDate = new JTextField(10);
        JButton btnAddTransaction = new JButton("Tambah Transaksi");
        JButton btnViewTransactions = new JButton("Lihat Semua Transaksi");

        panel.add(new JLabel("ID Transaksi:"));
        panel.add(txtTransactionId);
        panel.add(new JLabel("ID PRoduk:"));
        panel.add(txtTransactionProductId);
        panel.add(new JLabel("Jumlah:"));
        panel.add(txtTransactionQuantity);
        panel.add(new JLabel("Jenis (Masuk/Keluar):"));
        panel.add(txtTransactionType);
        panel.add(new JLabel("Tanggal (YYYY-MM-DD):"));
        panel.add(txtTransactionDate);
        panel.add(btnAddTransaction);
        panel.add(btnViewTransactions);

        btnAddTransaction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTransaction();
            }
        });

        btnViewTransactions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewTransactions();
            }
        });
        return panel;
    }

    // Create Delete Product Panel
    private JPanel createDeleteProductPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 10, 10));
        panel.setBorder(BorderFactory.createTitledBorder("Hapus Produk"));

        txtDeleteProductId = new JTextField(15);
        JButton btnDeleteProduct = new JButton("Hapus Produk");

        panel.add(new JLabel("Masukkan ID Produk untuk di Hapus:"));
        panel.add(txtDeleteProductId);
        panel.add(btnDeleteProduct);

        btnDeleteProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteProduct();
            }
        });

        return panel;
    }

    // Add Product Logic
    private void addProduct() {
        String productId = txtProductId.getText();
        String productName = txtProductName.getText();
        int quantity = Integer.parseInt(txtQuantity.getText());
        double price = Double.parseDouble(txtPrice.getText());

        Product product = new Product(productId, productName, quantity, price);
        inventoryManager.addProduct(product);
        JOptionPane.showMessageDialog(this, "Produk Sukses di Tambahkan!");
    }

    // Add Supplier Logic
    private void addSupplier() {
        String supplierId = txtSupplierId.getText();
        String name = txtSupplierName.getText();
        String contactInfo = txtSupplierContact.getText();

        Supplier supplier = new Supplier(supplierId, name, contactInfo);
        inventoryManager.addSupplier(supplier);
        JOptionPane.showMessageDialog(this, "Supplier Sukses di Tambahkan!");
    }

    // Add Transaction Logic
    private void addTransaction() {
        String transactionId = txtTransactionId.getText();
        String productId = txtTransactionProductId.getText();
        int quantity = Integer.parseInt(txtTransactionQuantity.getText());
        String type = txtTransactionType.getText();
        LocalDate date = LocalDate.parse(txtTransactionDate.getText());

        Transaction transaction = new Transaction(transactionId, productId, date, quantity, type);
        inventoryManager.addTransaction(transaction);
        JOptionPane.showMessageDialog(this, "Transaksi Sukses di Tambahkan!");
    }

    // Delete Product Logic
    private void deleteProduct() {
        String productId = txtDeleteProductId.getText();
        if (productId != null && !productId.trim().isEmpty()) {
            inventoryManager.removeProduct(productId);
            JOptionPane.showMessageDialog(this, "Produk dengan ID " + productId + " Sukses di Hapus!");
        } else {
            JOptionPane.showMessageDialog(this, "Tolong masukkan ID Produk yang sesuai!.");
        }
    }

    // View Products
    private void viewProducts() {
        StringBuilder productList = new StringBuilder("List Produk:\n");
        for (Product product : inventoryManager.getProducts()) {
            productList.append(product.getProductId()).append(" - ")
                    .append(product.getProductName()).append(" - ")
                    .append(product.getQuantity()).append(" - ")
                    .append(product.getPrice()).append("\n");
        }
        JOptionPane.showMessageDialog(this, productList.toString());
    }

    // View Suppliers
    private void viewSuppliers() {
        StringBuilder supplierList = new StringBuilder("List Supplier:\n");
        for (Supplier supplier : inventoryManager.getSuppliers()) {
            supplierList.append(supplier.getSupplierId()).append(" - ")
                    .append(supplier.getName()).append(" - ")
                    .append(supplier.getContactInfo()).append("\n");
        }
        JOptionPane.showMessageDialog(this, supplierList.toString());
    }

    // View Transactions
    private void viewTransactions() {
        StringBuilder transactionList = new StringBuilder("List Transaksi:\n");
        for (Transaction transaction : inventoryManager.getTransactions()) {
            transactionList.append(transaction.getTransactionId()).append(" - ")
                    .append(transaction.getProductId()).append(" - ")
                    .append(transaction.getQuantity()).append(" - ")
                    .append(transaction.getType()).append(" - ")
                    .append(transaction.getDate()).append("\n");
        }
        JOptionPane.showMessageDialog(this, transactionList.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InventoryUI();
            }
        });
    }
}

