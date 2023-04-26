/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CustomerWorkArea;

import Business.Business;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Customer.Order;
import Business.Merchant.Merchant;
import Business.ProductCatalog.Product;
import Business.ProductSchedule.ProductOffer;
import Business.ProductSchedule.ProductOfferAssignment;
import Business.ProductSchedule.Schedule;
import Business.UserAccount.UserAccount;
import java.awt.Image;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author tianshiyun
 */
public class ShoppingJPanel extends javax.swing.JPanel {
    Business business;
    UserAccount userAccount;
    CustomerDirectory customerDirectory;
    DefaultTableModel watchTableModel;
    DefaultTableModel viewTableModel;
    DefaultTableModel cartTableModel;
    Order order;
    Merchant merchant;
    /**
     * Creates new form ShoppingJPanel
     */
    public ShoppingJPanel() {
        initComponents();
    }
    
    public ShoppingJPanel(Business business,UserAccount userAccount) {
        initComponents();
        this.watchTableModel = (DefaultTableModel) watchTable.getModel();
        this.viewTableModel = (DefaultTableModel) viewTable.getModel();
        this.cartTableModel = (DefaultTableModel) cartTable.getModel();
        this.business = business;
        this.userAccount = userAccount;   
        this.order =new Order();
        order.setCustomer(userAccount.findCustomer());
        
        display();
    }
    
    
    public void display(){
        watchTableModel.setRowCount(0);
        
        for(Merchant m: this.business.getMerchantDirectory().getMerchantList()){  
            for(Schedule s:m.getScheduleDirectory().getScheduleList()){
               if(s.getStatus().equals(Schedule.Status.START)){
                    Object[] row = new Object[4];
                    row[0] = m.getMerchantName();
                    row[1] =s.getName();
    //                row[1] = s.getStatus();     
                    row[2] = s.getStatus();     
                    row[3] = s.getAdvertisement().getPopularity();
                            //s.getAdvertisement().getPopularity();
                    System.out.println(m.getName());
                    watchTableModel.addRow(row);
               }
            }
        }                              
    }
            
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        watchTable = new javax.swing.JTable();
        watchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        seeDetailButton = new javax.swing.JButton();
        picture = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        itemName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        itemDescription = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        addCartButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();

        setBackground(new java.awt.Color(174, 151, 106));
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        watchTable.setBackground(new java.awt.Color(252, 251, 250));
        watchTable.setFont(new java.awt.Font("Hei", 0, 13)); // NOI18N
        watchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Merchant", "Live", "Status", "Popularity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        watchTable.setMinimumSize(new java.awt.Dimension(2147483647, 80));
        watchTable.setPreferredSize(new java.awt.Dimension(2147483647, 80));
        jScrollPane1.setViewportView(watchTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 24, 301, 177));

        watchButton.setBackground(new java.awt.Color(51, 51, 51));
        watchButton.setForeground(new java.awt.Color(255, 255, 255));
        watchButton.setText("Watch");
        watchButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 153), null, null));
        watchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                watchButtonActionPerformed(evt);
            }
        });
        add(watchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 57, 23));

        viewTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Price"
            }
        ));
        jScrollPane2.setViewportView(viewTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 24, 264, 177));

        seeDetailButton.setBackground(new java.awt.Color(51, 51, 51));
        seeDetailButton.setForeground(new java.awt.Color(255, 255, 255));
        seeDetailButton.setText("See details");
        seeDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeDetailButtonActionPerformed(evt);
            }
        });
        add(seeDetailButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 150, 30));
        add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 295, 230, 170));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Image");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 295, 45, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Item Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 497, -1, -1));
        add(itemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 487, 180, 32));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Description");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 587, 77, -1));

        itemDescription.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(itemDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 541, 184, 104));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity", "ID"
            }
        ));
        jScrollPane3.setViewportView(cartTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 295, 420, 192));

        addCartButton.setBackground(new java.awt.Color(51, 51, 51));
        addCartButton.setForeground(new java.awt.Color(255, 255, 255));
        addCartButton.setText("Add to Cart");
        addCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartButtonActionPerformed(evt);
            }
        });
        add(addCartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 140, 30));

        checkoutButton.setBackground(new java.awt.Color(51, 51, 51));
        checkoutButton.setForeground(new java.awt.Color(255, 255, 255));
        checkoutButton.setText("Checkout");
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });
        add(checkoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 660, 280, -1));

        deleteButton.setBackground(new java.awt.Color(51, 51, 51));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, 280, -1));

        jLabel5.setText("Quantity");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, -1, -1));
        add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 131, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed

        this.order.setStatus(Order.Status.PLACED);
        for(Customer c: this.business.getCustomerDirectory().getCustomerDirectory()){
            if(c.getName().equals(this.userAccount.getUsername())){
                c.getOrderList().add(order);
               this.order.setCustomer(c);
               this.order.setMerchant(this.merchant);
                Boolean b = c.getOrderList().isEmpty();
            System.out.println(b +"1");
            }
        }
        
        JOptionPane.showMessageDialog(null, "Total Price : " +this.order.getPrice());
        
        // TODO add your handling code here:
    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void watchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_watchButtonActionPerformed
        viewTableModel.setRowCount(0);
        int selectedRow = watchTable.getSelectedRow();
        if (selectedRow >= 0){
           String m = (String)watchTable.getValueAt(selectedRow, 0);
           String live = (String)watchTable.getValueAt(selectedRow, 1);
           Schedule s = this.business.getMerchantDirectory().findMerchantByName(m).getScheduleDirectory().findScheduleByName(live);
           
           Map<String, ProductOffer> productMap = s.getProductMap();
           for(Map.Entry<String, ProductOffer> entry: productMap.entrySet()){
               Object[] row = new Object[2];
                row[0] = entry.getKey();
                row[1] = entry.getValue().getProduct().getProductPrice();
                viewTableModel.addRow(row);
           }
          this.merchant = this.business.getMerchantDirectory().findMerchantByName(m);
       
        }else {

            JOptionPane.showMessageDialog(null, "Please select a row!");

        }
            // TODO add your handling code here:
    }//GEN-LAST:event_watchButtonActionPerformed

    private void seeDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeDetailButtonActionPerformed
       int selectedRow = viewTable.getSelectedRow();
       int selectedRow2 = watchTable.getSelectedRow();
       if (selectedRow >= 0){
           String m = (String)watchTable.getValueAt(selectedRow2, 0);
           String live = (String)watchTable.getValueAt(selectedRow2, 1);
           Schedule s = this.business.getMerchantDirectory().findMerchantByName(m).getScheduleDirectory().findScheduleByName(live);
           String productOffer = (String)viewTable.getValueAt(selectedRow, 0);
           ProductOffer product = s.getProductOffer(productOffer);
           
           String path = product.getProduct().getProductImage();

            ImageIcon imageI = new ImageIcon(path);
            
            Image image = imageI.getImage().getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_SMOOTH);
            picture.setIcon(new ImageIcon(image));  
            itemName.setText(product.getProduct().getProductName());
            
            itemDescription.setText(product.getProduct().getDescription());
       }else {

            JOptionPane.showMessageDialog(null, "Please select a row !");

        }
             // TODO add your handling code here:
    }//GEN-LAST:event_seeDetailButtonActionPerformed

    private void addCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartButtonActionPerformed
        int selectedRow = viewTable.getSelectedRow();
        int selectedRow2 = watchTable.getSelectedRow();
        Pattern p = Pattern.compile("^[1-9]+[0-9]*$");
        Matcher m = p.matcher(quantity.getText());
        boolean b = m.matches();
        if (selectedRow >= 0 && b ){
           String mer = (String)watchTable.getValueAt(selectedRow2, 0);
           String live = (String)watchTable.getValueAt(selectedRow2, 1);
           Schedule s = this.business.getMerchantDirectory().findMerchantByName(mer).getScheduleDirectory().findScheduleByName(live);
           String productOfferN = (String)viewTable.getValueAt(selectedRow, 0);
           ProductOffer productOffer = s.getProductOffer(productOfferN);
           Product product = productOffer.getProduct();
                if(productOffer.getStock()>= Integer.valueOf(quantity.getText())){
                    cartTableModel.setRowCount(0);
                Object[] row = new Object[4];
                row[0] = product.getProductName();
                row[1] = product.getProductPrice();
                row[2] = quantity.getText();
                
                
                Integer quant = Integer.valueOf(quantity.getText());
                
                
                //update how many did the customer bought
                ProductOfferAssignment pro = new ProductOfferAssignment(order,productOffer);
                
                row[3] = pro.getId();
                pro.setQuantity(quant);
                
                //update how many have been sold
                this.order.getProductOfferAssignmentList().add(pro);
                int saleNum = productOffer.getSaleNum()+ quant;
                productOffer.setSaleNum(saleNum);
                
                //update stock
                int preStock = productOffer.getStock();
                int afterStock = preStock - saleNum;
                productOffer.setStock(afterStock);
                Double price = order.getPrice() +  quant*productOffer.getProduct().getProductPrice();
                order.setPrice(price);
                cartTableModel.addRow(row);
                }else {

            JOptionPane.showMessageDialog(null, "Not Enough Stock!");

        }
                
                
                
                
         
        }else {

            JOptionPane.showMessageDialog(null, "Please select a row to register or the quantity is not a postive number!");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_addCartButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRow = cartTable.getSelectedRow();
        
        if (selectedRow >= 0){
            String productOfferA = (String)cartTable.getValueAt(selectedRow, 3);
            
            for(ProductOfferAssignment p: order.getProductOfferAssignmentList()){
                if(p.getId().equals(productOfferA)){
                    //add the stock back
                    int preStock = p.getProductOffer().getStock();
                    int afterStock = preStock + p.getQuantity();
                    p.getProductOffer().setStock(afterStock);
                    
                    //update the saleNum
                    int preSaleNum = p.getProductOffer().getSaleNum();
                    int postSaleNum = preSaleNum - p.getQuantity();
                    p.getProductOffer().setSaleNum(postSaleNum);
                    
                    //remove from the table
                    cartTableModel.removeRow(selectedRow);
                    
                    //remove from the order
                    order.getProductOfferAssignmentList().remove(p);
                    
                    Product pro = p.getProductOffer().getProduct();
                    double totalPay = order.getPrice() - (pro.getProductPrice()) *(p.getQuantity());
                    order.setPrice(totalPay);
                    return;
                }
            }
           
           
        }else {

            JOptionPane.showMessageDialog(null, "Please select a row!");

        }
// TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartButton;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField itemDescription;
    private javax.swing.JTextField itemName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel picture;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton seeDetailButton;
    private javax.swing.JTable viewTable;
    private javax.swing.JButton watchButton;
    private javax.swing.JTable watchTable;
    // End of variables declaration//GEN-END:variables
}
