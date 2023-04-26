/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ProductSchedule;

import Business.Advertisement.Advertisement;
import Business.Customer.Order;
import Business.Merchant.Merchant;
import Business.ProductCatalog.Product;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author tianzhichen
 */
public class Schedule {

    public enum Status {
        START,
        PENDING,
    }

    //private Product product;
    //ArrayList<Item> itemList;
    //how to add popularity need to be finished,no method now 
    Merchant merchant;
    String name;
    Date date;
    Status status;
    //private int stock;
    //int saleNum;
    private Map<String, ProductOffer> productMap;
    Advertisement advertisement;


    public Schedule(String name, Date date) {
      
        this.name = name;
        this.date = date;
        this.status = Status.PENDING;
        this.productMap = new HashMap<String, ProductOffer>();
    }

    public void addProductOffer(Product product, int stock) {
        ProductOffer productOffer = new ProductOffer(product, stock);
        if (!productMap.containsKey(product.getProductName())) {
            this.getProductMap().put(product.getProductName(), productOffer);
        }
    }

    public void updateStock(Product product, int stock) {
        if (stock > 0) {
            if (!this.productMap.containsKey(product.getProductName())) {
                addProductOffer(product, stock);
                JOptionPane.showMessageDialog(null, "New product added!");
            } else {
                if (stock != this.getProductMap().get(product.getProductName()).getStock()) {
                    this.getProductMap().replace(product.getProductName(), new ProductOffer(product, stock));
                    JOptionPane.showMessageDialog(null, "product stock updated!");
                } else {
                    JOptionPane.showMessageDialog(null, "stock number unchanged!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid stock");
        }

    }

    public void updateSaleNum(Product product, int saleNum) {
        /*
        Make order of certain sale number.
         */
        if (!this.productMap.containsKey(product.getProductName())) {
            JOptionPane.showMessageDialog(null, "product not exists!");
        }
        int currStock = this.getProductMap().get(product.getProductName()).getStock();
        if (currStock >= saleNum) {
            int originalSaleNum = this.getProductMap().get(product.getProductName()).getSaleNum();
            ProductOffer offer = this.getProductMap().get(product.getProductName());
            offer.setSaleNum(originalSaleNum + saleNum);
            this.getProductMap().put(product.getProductName(), offer);
        } else {
            JOptionPane.showMessageDialog(null, "Stock not enough!");
        }

    }

    public void deleteProductOffer(Product product) {
        if (!this.productMap.containsKey(product.getProductName())) {
            JOptionPane.showMessageDialog(null, "product not exists!");
        }
        this.getProductMap().remove(product.getProductName());
    }

    public Double calculateTotalRevenue() {
        double revenue = 0d;
        for (Map.Entry<String, ProductOffer> entry : this.getProductMap().entrySet()) {
            int saleNum = entry.getValue().getSaleNum();
            double price = entry.getValue().getProduct().getProductPrice();
            revenue += saleNum * price;
        }
        return revenue;
    }
    
    public Map<String, ProductOffer> getProductMap() {
        return this.productMap;
    }

    public ProductOffer getProductOffer(String name) {
        return getProductMap().get(name);
    }
    
    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }

    /**
     * @param productMap the productMap to set
     */
    public void setProductMap(Map<String, ProductOffer> productMap) {
        this.productMap = productMap;
    }
    
    


}
