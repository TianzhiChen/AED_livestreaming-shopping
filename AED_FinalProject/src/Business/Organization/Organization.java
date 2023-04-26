/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkRequest.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author tianzhichen
 */
public abstract class Organization {

    static int organizationId;
    String name;
    String location;
    int zipcode;

    // attributes for the org
    // EmployeeDirectory
    // delivery agent directory
    // Useraccount directory
    // WorkQueue
    // Product list
    // Order list
    UserAccountDirectory userAccountDirectory;
    WorkQueue workqueue;

    // the organization types can be determined using Enum (ideal) or a Simple arraylist of string[] 
    public enum Type {
        Beauty("Beauty Organization"),
        DeliveryOrg("Delivery Organization"),
        DeliveryAgent("Delivery Agent");

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

    public Organization() {
        organizationId++;
    }

    public abstract ArrayList<Role> getSupportedRoles();
}
