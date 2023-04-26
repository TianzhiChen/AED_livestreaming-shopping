/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.MerchantWorkArea;

import Business.Business;
import Business.Merchant.Merchant;
import Business.ProductCatalog.Product;
import Business.ProductCatalog.ProductCatalog;
import Business.UserAccount.UserAccount;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tianzhichen
 */
public class ProductManagementJPanel extends javax.swing.JPanel {

    Business business;
    UserAccount userAccount;
    String imagePath;
    DefaultTableModel productTableModel;
    Product selectedProduct;

    /**
     * Creates new form productManagementJPanel
     */
    public ProductManagementJPanel() {
        initComponents();
    }

    public ProductManagementJPanel(Business business, UserAccount userAccount) {
        initComponents();

        this.business = business;
        this.userAccount = userAccount;
        this.productTableModel = (DefaultTableModel) productTable.getModel();
//        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        viewProductBtn = new javax.swing.JButton();
        fieldDescrip = new javax.swing.JTextField();
        categoryBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        btnBrowseImage = new javax.swing.JButton();
        productImage = new javax.swing.JLabel();
        fieldProductName = new javax.swing.JTextField();
        fieldPrice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sendReviewBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1200, 1300));
        setMinimumSize(new java.awt.Dimension(1200, 1300));
        setPreferredSize(new java.awt.Dimension(1200, 1300));
        setSize(new java.awt.Dimension(1200, 1300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 730, 100, 30));

        deleteBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 140, 30));

        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 140, 30));

        viewProductBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        viewProductBtn.setText("VIEW DETAILS");
        viewProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductBtnActionPerformed(evt);
            }
        });
        add(viewProductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 140, 30));
        add(fieldDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 210, 90));

        categoryBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Clothing", "Shoes", "Mobile", "Electronics", "Pet Supplies ", "Sports", "Beauty", "Health", "Toys", "Kitchen" }));
        add(categoryBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 210, 30));

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel3.setText("Product Management");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 490, 40));

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Category", "Price", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 420, 340));

        btnBrowseImage.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBrowseImage.setText("BROWSE");
        btnBrowseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseImageActionPerformed(evt);
            }
        });
        add(btnBrowseImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 130, 30));
        add(productImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 340, 200));
        add(fieldProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 210, 30));
        add(fieldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, 30));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel13.setText("Product Picture");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel12.setText("Description");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel8.setText("Price");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel7.setText("Category");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel6.setText("Product Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        sendReviewBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        sendReviewBtn.setText("SEND FOR REVIEW");
        sendReviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendReviewBtnActionPerformed(evt);
            }
        });
        add(sendReviewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 170, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/online-shopping.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 490, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kier-in-sight-Tuo1C7bvkv8-unsplash.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2170, -1060, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        // get the data
        String productName = fieldProductName.getText();
        String category = String.valueOf(categoryBox.getSelectedItem());
        double price = Double.valueOf(fieldPrice.getText());
        String description = fieldDescrip.getText();
        String image = this.imagePath;
        // store the data
        if (productName.isEmpty() || category.isEmpty() || fieldPrice.getText().isEmpty() || description.isEmpty() || image.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all fields.");
        } else {
            if (this.business.getMerchantDirectory().findMerchantByName(this.userAccount.getUsername()) != null) {
                Merchant m = this.business.getMerchantDirectory().findMerchantByName(this.userAccount.getUsername());

                if (m.getProductCatalog().productExists(productName)) {

                    JOptionPane.showMessageDialog(null, "Sorry credentials are taken.");
                } else {
                    Product createdProduct = m.getProductCatalog().createProduct(productName, category, price, description, image);
                    if (createdProduct != null) {

                        JOptionPane.showMessageDialog(null, "Product created");
                        populate();
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to create product");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBrowseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseImageActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        // Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            this.imagePath = selectedImagePath;

            JOptionPane.showMessageDialog(null, selectedImagePath);
            // display image on jlable
            ImageIcon ii = new ImageIcon(selectedImagePath);
            // resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(productImage.getWidth(), productImage.getHeight(), Image.SCALE_SMOOTH);
            productImage.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_btnBrowseImageActionPerformed

    private void viewProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductBtnActionPerformed
        // TODO add your handling code here:
        // Get the row in the table that was clicked
        int selectedRow = productTable.getSelectedRow();

        if (selectedRow >= 0) {

            // we can directly fetch the plan detail from the Zeroth position
            this.selectedProduct = (Product) productTable.getValueAt(selectedRow, 0);

            // fill all the text feilds
            fieldProductName.setText(String.valueOf(this.selectedProduct.getProductName()));
            categoryBox.setToolTipText(String.valueOf(this.selectedProduct.getCategory()));
            fieldPrice.setText(String.valueOf(this.selectedProduct.getProductPrice()));
            fieldDescrip.setText(String.valueOf(this.selectedProduct.getDescription()));
            productImage.setText(String.valueOf(this.imagePath));

        } else {
            // no selection by user
            JOptionPane.showMessageDialog(null, "please select a row!");
        }
    }//GEN-LAST:event_viewProductBtnActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        // TODO Update Image
        if (!fieldProductName.getText().isEmpty()) {
            Merchant m = this.business.getMerchantDirectory().findMerchantByName(this.userAccount.getUsername());
            // call the findPlanId method
            Product p = m.getProductCatalog().findProductByName(fieldProductName.getText());
            p.setCategory(String.valueOf(categoryBox.getToolTipText()));
            p.setProductPrice(Double.valueOf(fieldPrice.getText()));
            p.setDescription(String.valueOf(fieldDescrip.getText()));
            p.setProductImage(String.valueOf(this.imagePath));

            JOptionPane.showMessageDialog(null, "Updated!");
        } else {
            JOptionPane.showMessageDialog(null, "You have not made any selection");
        }

        populate();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        // get the selected row
        int selectedRow = productTable.getSelectedRow();

        if (selectedRow >= 0) {
            // we will delete the object
            Merchant m = this.business.getMerchantDirectory().findMerchantByName(this.userAccount.getUsername());
            Product p = (Product) productTable.getValueAt(selectedRow, 0);
            m.getProductCatalog().removeProduct(p.getProductName());;
            JOptionPane.showMessageDialog(null, "Deleted successfully!");
            populate();
        } else {

        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void sendReviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendReviewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = productTable.getSelectedRow();
        if (selectedRow >= 0) {
            Merchant m = this.business.getMerchantDirectory().findMerchantByName(this.userAccount.getUsername());
            Product p = (Product) productTable.getValueAt(selectedRow, 0);
            p.setStatus(Product.Status.UNDERREVIEW);
            JOptionPane.showMessageDialog(null, "Product under review");
            populate();
        } else {
            JOptionPane.showMessageDialog(null, "You have not made any selection");
        }
    }//GEN-LAST:event_sendReviewBtnActionPerformed

    public void populate() {
        Merchant m = this.business.getMerchantDirectory().findMerchantByName(this.userAccount.getUsername());
        ProductCatalog pc = m.getProductCatalog();

        productTableModel.setRowCount(0);

        for (Product p : m.getProductCatalog().getProductList()) {

            Object[] row = new Object[4];

            row[0] = p;
            row[1] = p.getCategory();
            row[2] = p.getProductPrice();
            row[3] = p.getStatus();

            productTableModel.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowseImage;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox categoryBox;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField fieldDescrip;
    private javax.swing.JTextField fieldPrice;
    private javax.swing.JTextField fieldProductName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel productImage;
    private javax.swing.JTable productTable;
    private javax.swing.JButton sendReviewBtn;
    private javax.swing.JButton viewProductBtn;
    // End of variables declaration//GEN-END:variables
}
