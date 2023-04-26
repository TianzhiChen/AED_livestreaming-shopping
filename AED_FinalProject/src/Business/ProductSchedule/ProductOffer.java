/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ProductSchedule;

import Business.Customer.Customer;
import Business.Customer.Order;
import Business.Merchant.Merchant;
import Business.ProductCatalog.Product;

/**
 *
 * @author tianzhichen
 */
public class ProductOffer {

    private Product product;
    private int stock;
    private int saleNum;
    Schedule schedule;
    //private Boolean occupied;
    //private int quantity;
    //private ItemAssignment itemAssignment; //links back to customer
    //private ProductOffer productOffer;

    public ProductOffer(Product product, int stock) {
        this.product = product;
        this.stock = stock;
        this.saleNum = 0;
        
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }



//     public Boolean getOccupied() {
//        return occupied;
//    }
//
//    public void setOccupied(Boolean occupied) {
//        this.occupied = occupied;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public ItemAssignment getItemAssignment() {
//        return itemAssignment;
//    }
//
//    public void setItemAssignment(ItemAssignment itemAssignment) {
//        this.itemAssignment = itemAssignment;
//    }
//
//    public ProductOffer getProductOffer() {
//        return productOffer;
//    }
//
//    public void setProductOffer(ProductOffer productOffer) {
//        this.productOffer = productOffer;
//    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
