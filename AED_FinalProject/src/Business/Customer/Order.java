/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;

import Business.Delivery.DeliveryAgent;
import Business.Merchant.Merchant;
import Business.ProductSchedule.ProductOffer;
import Business.ProductSchedule.ProductOfferAssignment;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author tianzhichen
 */
public class Order {

    public enum Status {
        PLACED,
        READY,
        DELIVERING,
        DELIVERED,
        RECEIVED,
    }
    private static int count = 0;
    private String id;
    private Double price;
    private Status status;
    ArrayList<ProductOfferAssignment> productOfferAssignmentList;
    Customer customer;
    DeliveryAgent agent;
    Merchant merchant;

    public Order() {
        this.productOfferAssignmentList = new ArrayList<>();
        this.customer = customer;
        id = "Order"+count;
        price = 0.0;
    }

    public Order(Customer customer, DeliveryAgent agent, Merchant merchant) {
        this.customer = customer;
        this.agent = agent;
        this.productOfferAssignmentList = new ArrayList<ProductOfferAssignment>();
        this.merchant = merchant;
        id = customer.getName()+count;  
        price = 0.0;
    }

    public Order(Customer customer, DeliveryAgent agent) {
        this.customer = customer;
        this.agent = agent;
        this.productOfferAssignmentList = new ArrayList<ProductOfferAssignment>();
        price = 0.0;
        id = customer.getName()+count;
    }

    public Double getTotalPrice() {
        for (ProductOfferAssignment pro : this.getProductOfferAssignmentList()) {
            price = +pro.getQuantity() * pro.getProductOffer().getProduct().getProductPrice();
        }
        return price;
    }

//    public ItemAssignment newItemAssignment(ProductOffer po) {
//
//        Item item = po.getAvailableItem(); // item linked to product offer
//        if (item == null) {
//            return null;
//        }
//        ItemAssignment ia = item.newItemAssignment(this);
//        itemAssignmentList.add(ia);  //add to students course 
//        return ia;
//    }
    public void assignCustomer(ProductOfferAssignment poa) {

        poa.assignItemToCustomer(this);
        productOfferAssignmentList.add(poa);
    }

    public ArrayList<ProductOfferAssignment> getProductOfferAssignmentList() {
        return productOfferAssignmentList;
    }

    public void setProductOfferAssignmentList(ArrayList<ProductOfferAssignment> productOfferAssignmentList) {
        this.productOfferAssignmentList = productOfferAssignmentList;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price=price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DeliveryAgent getAgent() {
        return agent;
    }

    public void setAgent(DeliveryAgent agent) {
        this.agent = agent;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    @Override
    public String toString() {
        return this.id;
    }

}
