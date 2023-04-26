/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.Profile;
import java.util.ArrayList;

/**
 *
 * @author tianzhichen
 */
public class Customer extends Profile {
    private String name;
    private String password;
    private String email;
    private Long phoneNumber;
    private ArrayList<Order> orderList;
   

    public Customer() {
        super();
        this.orderList = new ArrayList<>();
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    

    public Order findOrderByID(String id) {
        for (Order o : this.orderList) {
            if (o.getId().equals(id)) {
                return o;
            }
        }
        return null;

    }

    /**
     * @return the orderList
     */
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    /**
     * @param orderList the orderList to set
     */
    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
