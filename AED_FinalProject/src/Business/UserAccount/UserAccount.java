/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;


import Business.Business;
import Business.Customer.Customer;
import Business.Role.Role;




/**
 *
 * @author tianshiyun
 */
public class UserAccount extends Role {
    private static int count = 0;
    private String accountId;
    private String username;
    private String password;
    private String role;
    private Business business;
    Customer cus;

    public UserAccount(){
        super();
        this.accountId = role +count++;
    }
    
    public UserAccount(Business business, String username,String password, String role){
        this.username = username;
        this.password = password;
        this.role = role;
        this.accountId = role +count++;
        this.business = business;
    }
   
    public Customer creatCustomer(){
        Customer customer = new Customer();
        customer.setName(this.username);
        return customer;
    }

    public Customer findCustomer(){
        
    
        for(Customer c: this.business.getCustomerDirectory().getCustomerDirectory()){
            if(this.getUsername().equals(c.getName()) && 
               this.getPassword().equals(c.getPassword()) && 
               this.getRole().equals("Customer")){
                cus = c;
            }
        }return cus;
    } 
    
    /**
     * @return the accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * @param accountId the accountId to set
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
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

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    
    public void changePassword(String password){
        this.setPassword(password);
        
    }
    
    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }
}
