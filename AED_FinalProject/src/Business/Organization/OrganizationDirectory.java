/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author tianzhichen
 */
public class OrganizationDirectory {
    ArrayList<Organization> organizationlist;
    
    public void createOrganization(Type type) {
        Organization organization = null;
        if(type.getValue().equals(type.DeliveryOrg.getValue())) {
            organization = new DeliveryOrganization();
            this.organizationlist.add(organization);
        }
    }
}
