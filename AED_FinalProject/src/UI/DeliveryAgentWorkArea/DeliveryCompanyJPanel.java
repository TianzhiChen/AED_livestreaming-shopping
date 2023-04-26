/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.DeliveryAgentWorkArea;

import Business.Business;
import Business.Delivery.DeliveryAgent;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tianzhichen
 */
public class DeliveryCompanyJPanel extends javax.swing.JPanel {

    Business business;
    UserAccount userAccount;
    DefaultTableModel tableModel;

    /**
     * Creates new form DeliveryCompanyJPanel
     */
    public DeliveryCompanyJPanel() {
        initComponents();
    }

    public DeliveryCompanyJPanel(Business business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;
        this.tableModel = (DefaultTableModel) agentTable.getModel();
        populate();
    }

    public void populate() {
        tableModel.setRowCount(0);
        for (DeliveryAgent a : this.business.getDeliveryAgentDirectory().getAgents()) {
            Object[] row = new Object[2];
            row[0] = a.getName();
            row[1] = a.getPrice();
            tableModel.addRow(row);
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
        agentTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fieldAgentName = new javax.swing.JTextField();
        createAgentBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PriceField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Agent Name", "price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        agentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(agentTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 545, 213));

        jLabel1.setText("Agent Company Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        fieldAgentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAgentNameActionPerformed(evt);
            }
        });
        add(fieldAgentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 170, 30));

        createAgentBtn.setText("REGISTER");
        createAgentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAgentBtnActionPerformed(evt);
            }
        });
        add(createAgentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, 30));

        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 90, 30));

        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 90, 30));

        jLabel2.setText("Per Delivery Price");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        PriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceFieldActionPerformed(evt);
            }
        });
        add(PriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 170, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void fieldAgentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAgentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldAgentNameActionPerformed

    private void createAgentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAgentBtnActionPerformed
        // TODO add your handling code here:

        DeliveryAgent a =this.business.getDeliveryAgentDirectory().createAgent(fieldAgentName.getText());
        a.setPrice(Double.valueOf(PriceField.getText()));
        populate();
    }//GEN-LAST:event_createAgentBtnActionPerformed

    private void agentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agentTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) agentTable.getModel();
        // set data to text field when row is selected
        String name = agentTable.getValueAt(agentTable.getSelectedRow(), 0).toString();
        // set the textfield
        fieldAgentName.setText(name);
    }//GEN-LAST:event_agentTableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = agentTable.getSelectedRow();
        if (selectedRow >= 0) {
            String agentName = (String)agentTable.getValueAt(selectedRow, 0);
            DeliveryAgent da =this.business.getDeliveryAgentDirectory().findbyname(agentName);
            da.setName(fieldAgentName.getText());
            da.setPrice(Double.valueOf(PriceField.getText()));
            JOptionPane.showMessageDialog(null, "Updated successfully！");
        } else {

        }
        populate();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = agentTable.getSelectedRow();
        if (selectedRow >= 0) {
            String agentName = (String)agentTable.getValueAt(selectedRow, 0);
            this.business.getDeliveryAgentDirectory().removeAgent(agentName);
            JOptionPane.showMessageDialog(null, "Deleted successfully！");
            populate();
        } else {

        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void PriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PriceField;
    private javax.swing.JTable agentTable;
    private javax.swing.JButton createAgentBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField fieldAgentName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}