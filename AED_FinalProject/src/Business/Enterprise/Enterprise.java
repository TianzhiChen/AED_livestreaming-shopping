/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author tianzhichen
 */
public abstract class Enterprise {

    // track all the employees for the enterprise : enterprise directory
    
    OrganizationDirectory organizationDirectory;
    UserAccountDirectory enterpriseUserAccounts;
            
    public enum EnterpriseType {

        Advertisment("Advertisment Enterprise"),
        Shipping("Shipping Enterprise");

        private String value;

        private EnterpriseType(String value) {
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
    
    public abstract ArrayList<Role> getSupportedEnterpriseRoles();

}
