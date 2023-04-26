/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeliveryAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tianzhichen
 */
public class DeliveryOrganization extends Organization {

    DeliveryOrganization() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
       ArrayList<Role> roles = new ArrayList<>();
       
       roles.add(new DeliveryAdminRole());
       return roles;
    }
    
}
