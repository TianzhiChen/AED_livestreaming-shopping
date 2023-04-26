/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Delivery;

import Business.Customer.Order;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author shansun
 */
public class DeliveryAgent {

    String id;
    String name;
    Double price;
    private ArrayList<Order> agentOrderList;

    public DeliveryAgent() {
        this.id = UUID.randomUUID().toString();
        this.agentOrderList = new ArrayList<Order>();
    }

    public DeliveryAgent(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public DeliveryAgent(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addDeliveryOrder(Order o) {
        this.agentOrderList.add(o);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Order> getAgentOrderList() {
        return agentOrderList;
    }

    public void setAgentOrderList(ArrayList<Order> agentOrderList) {
        this.agentOrderList = agentOrderList;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    

    @Override
    public String toString() {
        return this.name;
    }
}
