/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ProductCatalog;

import Business.Merchant.Merchant;
import Business.ProductSchedule.ProductOffer;
import Business.ProductSchedule.Schedule;
import Business.ProductSchedule.ScheduleDirectory;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author tianzhichen
 */
public class ProductCatalog {

    private Merchant merchant;
    private ArrayList<Product> productList;

    public ProductCatalog() {
        this.productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Product findProductByName(String name) {
        for (Product p : this.productList) {
            if (p.getProductName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public Product findProductByid(String id) {
        for (Product p : this.productList) {
            if (p.getProductId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Product createProduct(String productName, String category, double price, String description, String productImage) {
        Product p = new Product();
        p.setProductName(productName);
        p.setCategory(category);
        p.setProductPrice(price);
        p.setDescription(description);
        p.setProductImage(productImage);
        for (Product product : this.productList) {
            if (product.getProductName().equals(productName)) {
                JOptionPane.showMessageDialog(null, "Product existed");
                return null;
            }
        }
        this.productList.add(p);
        return p;
    }

    public boolean productExists(String name) {
        for (Product p : this.productList) {
            if (p.getProductName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // delete a product from the catalog
    public void removeProduct(String name) {
        // find the product obj in the arraylist with this name
        for (Product p : this.productList) {
            if (p.getProductName().equals(name)) {
                this.productList.remove(p);
                break;
            }
        }
    }

}
