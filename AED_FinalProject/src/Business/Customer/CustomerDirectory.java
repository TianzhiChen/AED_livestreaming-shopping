/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author tianzhichen
 */
public class CustomerDirectory {

    private ArrayList<Customer> customerDirectory;

    public CustomerDirectory() {
        this.customerDirectory = new ArrayList<>();
    }

    public void createCustomer(UserAccount user) {
        Customer c = new Customer();
        c.setName(user.getUsername());
        c.setPassword(user.getPassword());
    }

    public Customer findCustomerByID(String id) {
        for (Customer c : this.customerDirectory) {
            if (c.getPersonId().equals(id)) {
                return c;
            }
        }

        return null;
    }

    /**
     * @return the customerDirectory
     */
    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    /**
     * @param customerDirectory the customerDirectory to set
     */
    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
}
