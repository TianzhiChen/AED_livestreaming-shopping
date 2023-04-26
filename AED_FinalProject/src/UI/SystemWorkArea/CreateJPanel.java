/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemWorkArea;

import Business.Business;
import Business.Merchant.Merchant;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tianshiyun
 */
public class CreateJPanel extends javax.swing.JPanel {
    Business business;
    UserAccount userAccount;
    DefaultTableModel userTableModel;
    
    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel() {
        initComponents();
    }
    
    public CreateJPanel(Business business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;
//        this.userTableModel = (DefaultTableModel) userTable.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setLocation(new java.awt.Point(1200, 1000));
        setMaximumSize(new java.awt.Dimension(1200, 1000));
        setMinimumSize(new java.awt.Dimension(1200, 1000));
        setSize(new java.awt.Dimension(1200, 1000));

        jLabel1.setFont(new java.awt.Font("InaiMathi", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Enter Password");

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("InaiMathi", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("User Name");

        userName.setBackground(new java.awt.Color(204, 204, 204));
        userName.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBox1.setBackground(new java.awt.Color(204, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System_Manager", "Customer", "Ad_Admin", "Delivery_Admin", "Validation_Admin", "Merchant", "Live_Admin", "Delivery_Company" }));

        jLabel3.setFont(new java.awt.Font("InaiMathi", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Select Role");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("SIGN UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(646, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(736, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

//    public void display(){
//        userTableModel.setRowCount(0);
//        
//        String name = userName.getText();
//        String pass = password.getText();
//        String role = (String)jComboBox1.getSelectedItem();
//        
//                Object[] row = new Object[3];
//                row[0] = name;
//                row[1] = pass;
//                row[2] = role;
//                userTableModel.addRow(row);
//                                         
//    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UserAccountDirectory ua = this.business.getUserAccountDirectory();

        String name = userName.getText();
        String pass = password.getText();
        String role = (String) jComboBox1.getSelectedItem();
        if (name.isEmpty() ||  pass.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Please fill all fields.");
        } else {
            if (ua.accountExists(userName.getText(), role)) {
                JOptionPane.showMessageDialog(null, "Sorry credentials are taken.");
            } else {
                UserAccount user = this.business.getUserAccountDirectory().createUserAccount(name, pass, role);

                JOptionPane.showMessageDialog(null, "User: "+name+"\n"+"ID: "+ user.getAccountId()+"\n"+ "Role: "+role);

            }
        }
//        display();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField password;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
