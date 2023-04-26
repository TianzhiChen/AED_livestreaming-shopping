/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Business;
import Business.Customer.Customer;
import Business.UserAccount.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccounts;
    private Business business;

    public UserAccountDirectory(Business business) {
        this.userAccounts = new ArrayList<UserAccount>();
        this.business = business;
    }

    public UserAccount createUserAccount(String username, String password, String role) {
        UserAccount user = new UserAccount(this.business, username, password, role);
        userAccounts.add(user);
        return user;

    }

    public UserAccount findById(String id) {
        for (UserAccount u : this.userAccounts) {
            if (u.getAccountId().equals(id)) {
                return u;
            }
        }
        return null;
    }

    public UserAccount findByName(String name) {
        for (UserAccount u : this.userAccounts) {
            if (u.getUsername().equals(name)) {
                return u;
            }
        }
        return null;
    }
    
    public void removeUserAccount(String name) {
        for (UserAccount ua: this.userAccounts) {
            if (ua.getUsername().equals(name)) {
                this.userAccounts.remove(ua);
                break;
            }
        }
    }

    public UserAccount getUserAccount(String username, String password, String role) {
        for (UserAccount u : this.userAccounts) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return u;
            }
        }
        return null;
    }

    public Boolean accountExists(String name, String role) {

        for (UserAccount u : this.userAccounts) {

            if (u.getUsername().equals(name) && u.getRole().equals(role)) {
                return true;
            }
        }
        return false;
    }//注册时同一身份姓名不重复，学生和老师姓名重复没关系，登陆需要选身份

    public Boolean accountLogExists(String userName, String password, String role) {
        for (UserAccount u : this.userAccounts) {
            if (u.getUsername().equals(userName) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return true;

            }
        }
        return false;

    }//登录时查找用户是否存在

    public Customer findCustomer(UserAccount user) {
        Customer c = new Customer();
        for (Customer customer : Business.getBusinessInstance().getCustomerDirectory().getCustomerDirectory()) {
            if (customer.getName().equals(user.getUsername()) && customer.getPassword().equals(user.getPassword())) {
                customer = c;
            }
        }
        return c;

    }

    /**
     * @return the
     */
    public ArrayList<UserAccount> getUserAccounts() {
        return userAccounts;
    }

    /**
     * @param useraccountlist the useraccountlist to set
     */
    public void setUseraccountlist(ArrayList<UserAccount> userAccountDirectory) {
        this.userAccounts = userAccountDirectory;
    }

}
