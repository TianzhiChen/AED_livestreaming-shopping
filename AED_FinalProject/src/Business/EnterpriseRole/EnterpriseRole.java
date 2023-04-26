/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EnterpriseRole;

import javax.swing.JFrame;

/**
 *
 * @author tianzhichen
 */
public abstract class EnterpriseRole {
    public enum Type {
        DeliveryAdmin("Delivery Admin"),
        AdvertismentAdmin("Advertisment Admin"),
        ValidationAdmin("Validation Admin");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JFrame createEnterpriseAdminWorkArea();
}
