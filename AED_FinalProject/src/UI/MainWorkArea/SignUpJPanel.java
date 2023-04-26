/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.MainWorkArea;

import Business.Business;
import Business.Customer.Customer;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author tianshiyun
 */
public class SignUpJPanel extends javax.swing.JPanel {

    Business business;
    UserAccount userAccount;

    /**
     * Creates new form SignUpJPanel
     */
    public SignUpJPanel() {
        initComponents();
    }

    public SignUpJPanel(Business business, UserAccount userAccount) {
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

        jLabel1 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        signupBtn = new javax.swing.JButton();
        roleBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        fieldAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(231, 225, 211));
        setMaximumSize(new java.awt.Dimension(1500, 1100));
        setMinimumSize(new java.awt.Dimension(1500, 1100));
        setSize(new java.awt.Dimension(1500, 1100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Enter Password");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 110, 33));

        password.setBackground(new java.awt.Color(255, 204, 204));
        password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 202, 33));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("User Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 110, 33));

        userName.setBackground(new java.awt.Color(255, 204, 204));
        userName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 202, 33));

        signupBtn.setBackground(new java.awt.Color(226, 129, 177));
        signupBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setText("SIGN UP");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 318, 35));

        roleBox.setBackground(new java.awt.Color(255, 204, 204));
        roleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Merchant" }));
        add(roleBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 202, 30));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Select Role");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 98, 33));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Email");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 60, -1));

        fieldEmail.setBackground(new java.awt.Color(255, 204, 204));
        add(fieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 200, 30));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Phone");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        fieldPhone.setBackground(new java.awt.Color(255, 204, 204));
        add(fieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 200, 30));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Address");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 388, 70, 20));

        searchBtn.setBackground(new java.awt.Color(246, 183, 183));
        searchBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(102, 102, 102));
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 90, 30));

        fieldAddress.setBackground(new java.awt.Color(255, 204, 204));
        add(fieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 200, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pawel-czerwinski-hR545CzxZxk-unsplash.jpg"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1120, -360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        UserAccountDirectory ua = this.business.getUserAccountDirectory();

        String name = userName.getText();
        String pass = password.getText();
        String role = (String) roleBox.getSelectedItem();
        Pattern p = Pattern.compile("\\d{10}");
        Pattern emailP = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher m1 = p.matcher(fieldPhone.getText());
        Matcher m2 = emailP.matcher(fieldEmail.getText());
        boolean b = m1.matches();
        boolean b2 = m2.matches();
        if (name.isEmpty() || pass.isEmpty() || !b || !b2 || fieldPhone.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Please fill all fields  and do it in right format.");
        } else {
            if (ua.accountExists(userName.getText(), role)) {
                JOptionPane.showMessageDialog(null, "Sorry credentials are taken.");
            } else {
                UserAccount user = this.business.getUserAccountDirectory().createUserAccount(name, pass, role);
                if (role.equals("Customer")){
                    Customer c = user.creatCustomer();
                    c.setEmail(fieldEmail.getText());
                    c.setPhoneNumber(Long.valueOf(fieldPhone.getText()));
                    this.business.getCustomerDirectory().getCustomerDirectory().add(c);
                } else if (role.equals("Merchant")) {
                    this.business.getMerchantDirectory().createMerchant(name);
                }
                JOptionPane.showMessageDialog(null, "User: " + name + "\n" + "ID: " + user.getAccountId() + "\n" + "Role: " + role);

            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_signupBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        int MAP_HEIGHT = 1280;
        int MAP_WIDTH = 720;
        int ZOOM = 14;
        ImageIcon icon = new ImageIcon("icon/home_24px.png");

        JLabel marker = new JLabel(icon);
        String address = fieldAddress.getText().replace(" ", "+");
        final JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        frame.setSize(MAP_HEIGHT, MAP_WIDTH);
        frame.setVisible(true);
        final JFXPanel panel = new JFXPanel();
        frame.add(panel);
        String geoUrl = String.format("https://maps.googleapis.com/maps/api/geocode/json?address=%s"
                + "&key=AIzaSyCqMf1MQNQdcjP9OoAWb-wcgMDMVlhCDq4", address);
        System.out.println(geoUrl);
        double lat_ = 0.0;
        double lng_ = 0.0;
        try {
            RequestConfig config = RequestConfig.custom().setConnectTimeout(10000).build();
            HttpClient client = HttpClients.custom().setDefaultRequestConfig(config).build();
            HttpGet request = new HttpGet(geoUrl);
            HttpResponse response = client.execute(request);
            BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String line = reader.readLine();
            StringBuilder sb = new StringBuilder();
            while (line != null) {
                sb.append(line);
                line = reader.readLine();
            }
            reader.close();
            JSONObject json = new JSONObject(sb.toString());
            System.out.println(sb.toString());
            JSONArray results = json.getJSONArray("results");

            JSONObject location = results.getJSONObject(0).getJSONObject("geometry").getJSONObject("location");
            lat_ = location.getDouble("lat");
            lng_ = location.getDouble("lng");
            System.out.println(lat_ + " " + lng_);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        final double lat_center = lat_;
        final double lng_center = lng_;

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                WebEngine engine;
                WebView web = new WebView();
                engine = web.getEngine();
                panel.setScene(new Scene(web));
                String url = String.format("https://maps.googleapis.com/maps/api/staticmap?center=%s&size=1280x720&zoom=%d"
                        + "&key=AIzaSyCqMf1MQNQdcjP9OoAWb-wcgMDMVlhCDq4", address, ZOOM);
                engine.load(url);

            }
        });

        // Add a MouseListener to the map JFrame
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Retrieve the latitude and longitude of the selected location
                double perPixelY = 360 / Math.pow(2, ZOOM + 8);
                double perPixelX = 360 / Math.pow(2, ZOOM + 8) * Math.cos(lat_center * Math.PI / 180);
                double lat = lat_center - perPixelY * (e.getY() - MAP_HEIGHT / 2);
                double lng = lng_center + perPixelX * (e.getX() - MAP_WIDTH / 2);

                String reverseGeoUrl = String.format("https://maps.googleapis.com/maps/api/geocode/json?latlng=%f,%f"
                        + "&language=en"
                        + "&key=AIzaSyCqMf1MQNQdcjP9OoAWb-wcgMDMVlhCDq4", lat, lng);
                System.out.println(reverseGeoUrl);
                String addressString = "";
                try {
                    RequestConfig config = RequestConfig.custom().setConnectTimeout(10000).build();
                    HttpClient client = HttpClients.custom().setDefaultRequestConfig(config).build();
                    HttpGet request = new HttpGet(reverseGeoUrl);
                    HttpResponse response = client.execute(request);
                    BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                    String line = reader.readLine();
                    StringBuilder sb = new StringBuilder();
                    while (line != null) {
                        sb.append(line);
                        line = reader.readLine();
                    }
                    reader.close();
                    JSONObject json = new JSONObject(sb.toString());
                    System.out.println(sb.toString());
                    JSONArray results = json.getJSONArray("results");
                    addressString = results.getJSONObject(0).getString("formatted_address");
                    JOptionPane.showMessageDialog(null, "You clicked on: " + addressString);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                fieldAddress.setText(addressString);
            }
        });


    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldAddress;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField password;
    private javax.swing.JComboBox<String> roleBox;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton signupBtn;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
