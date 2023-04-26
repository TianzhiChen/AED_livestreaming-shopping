/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Customer.Customer;
import Business.UserAccount.UserAccount;

/**
 *
 * @author tianzhichen
 */
public abstract class WorkRequest {
    String message;
    UserAccount sender;
    UserAccount receiver;
    // Order id or Order object
    Customer customer;
    String status;
    static int workrequestID;
    
    WorkRequest() {
        // auto generate ID
        workrequestID++;
        
        // initialize required objects
    }
    
    public abstract void determineWorkRequestStatus();
    
    // any abstract methods that a work request needs to accomplish
}
