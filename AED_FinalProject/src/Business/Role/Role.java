/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.UserAccount.UserAccount;
import UI.AdvertisementWorkArea.AdvertisementJFrame;
import UI.MerchantWorkArea.MerchantJFrame;
import UI.CustomerWorkArea.CustomerJFrame;
import UI.DeliveryAgentWorkArea.DeliveryJFrame;
import UI.InspectorWorkArea.InspectorJFrame;
import UI.SystemWorkArea.SystemJFrame;
import javax.swing.JFrame;

/**
 *
 * @author tianzhichen
 */
public abstract class Role {

    // Organization Admin and Agent roles
//    public enum Type {
//        Inspector("Inspector"),
//        DeliveryAgent("Delivery Agent");
//
//        private String value;
//
//        private Type(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        @Override
//        public String toString() {
//            return value;
//        }
//    }
//
//    
//    public abstract JPanel createWorkArea();
    public JFrame getWorkArea(String role, Business business, UserAccount user) {
        if (role.equals("System_Manager")) {
            return new SystemJFrame(business, user);
        }
        
        if (role.equals("Customer")) {
            return new CustomerJFrame(business, user);
        }
        
        if(role.equals("Ad_Admin")){
            
            return new AdvertisementJFrame(business, user);
        }
        
        if(role.equals("Delivery_Admin")){
            
            return new DeliveryJFrame(business, user);
        }
        
        if(role.equals("Validation_Admin")){
            
            return new InspectorJFrame(business, user);
        }

        if (role.equals("Merchant")) {

            return new MerchantJFrame(business, user);
        }
//        if(role.equals("Live_Admin")){
//            
//            return new AuthorityJFrame(business, user);
//        }
//        if(role.equals("Delivery_Company")){
//            
//            return new AuthorityJFrame(business, user);
//        }
        return null;
    }

}
