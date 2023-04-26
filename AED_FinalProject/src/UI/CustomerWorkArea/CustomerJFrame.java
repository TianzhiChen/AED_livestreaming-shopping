/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.CustomerWorkArea;

import Business.Business;
import Business.UserAccount.UserAccount;

import UI.MainWorkArea.MainJFrame;

/**
 *
 * @author tianshiyun
 */
public class CustomerJFrame extends javax.swing.JFrame {
    Business business;
    UserAccount userAccount;
    /**
     * Creates new form CustomerJFrame
     */
    public CustomerJFrame() {
        initComponents();
    }
    
    public CustomerJFrame(Business business, UserAccount userAccount ) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        LeftJPanel = new javax.swing.JPanel();
        shoppingButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 1200));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftJPanel.setBackground(new java.awt.Color(156, 147, 127));
        LeftJPanel.setMaximumSize(new java.awt.Dimension(300, 1300));
        LeftJPanel.setMinimumSize(new java.awt.Dimension(300, 1300));
        LeftJPanel.setPreferredSize(new java.awt.Dimension(300, 1300));
        LeftJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shoppingButton.setFont(new java.awt.Font("Impact", 1, 13)); // NOI18N
        shoppingButton.setText("Shopping");
        shoppingButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 51), null));
        shoppingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoppingButtonActionPerformed(evt);
            }
        });
        LeftJPanel.add(shoppingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 206, 120, 40));

        viewButton.setFont(new java.awt.Font("Impact", 1, 13)); // NOI18N
        viewButton.setText("View Order");
        viewButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 51), null));
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        LeftJPanel.add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 323, 120, 40));

        jButton2.setText("LOG OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        LeftJPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 79, 120, 37));

        editButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        editButton.setText("Edit Info");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        LeftJPanel.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 120, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/amy-shamblen-pJ_DCj9KswI-unsplash.jpg"))); // NOI18N
        LeftJPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, -35, 3590, 3610));

        jSplitPane2.setLeftComponent(LeftJPanel);

        jPanel2.setBackground(new java.awt.Color(237, 234, 225));
        jPanel2.setMaximumSize(new java.awt.Dimension(1200, 1300));
        jPanel2.setMinimumSize(new java.awt.Dimension(1200, 1300));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 1300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pawel-czerwinski-2PN18U8CKi0-unsplash.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4500, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jSplitPane2.setRightComponent(jPanel2);

        getContentPane().add(jSplitPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shoppingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoppingButtonActionPerformed
        jSplitPane2.setRightComponent(new ShoppingJPanel(this.business, this.userAccount) );
        // TODO add your handling code here:
    }//GEN-LAST:event_shoppingButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        jSplitPane2.setRightComponent(new ViewOrderJPanel(this.business, this.userAccount) );
        // TODO add your handling code here:
    }//GEN-LAST:event_viewButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new MainJFrame(this.business, this.userAccount).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        jSplitPane2.setRightComponent(new EditJPanel(this.business, this.userAccount) );
// TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftJPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JButton shoppingButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
