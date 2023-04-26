/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ProductSchedule;

import Business.Customer.Customer;
import Business.Customer.Order;
import Business.Merchant.Merchant;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author tianzhichen
 */
public class ProductOfferAssignment {
    private static int count = 0;
    private ProductOffer productOffer;
    Order order;
    private int quantity;
    private String id;
    
    public ProductOfferAssignment(Order order, ProductOffer productOffer) {
        this.productOffer= productOffer;
        this.order = order;
        
        id = "Customer"+count;
        System.out.println(id);
    }

    public void assignItemToCustomer(Order order) {
        this.order = order;
    }

    public ProductOffer getProductOffer() {
        return productOffer;
    }

    public void setProductOffer(ProductOffer productOffer) {
        this.productOffer = productOffer;
    }


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
