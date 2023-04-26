/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Merchant;

import Business.ProductCatalog.ProductCatalog;
import Business.ProductSchedule.ScheduleDirectory;
import Business.UserAccount.Profile;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tianzhichen
 */
public class Merchant extends Profile {

    private String merchantName;
    private ProductCatalog productCatalog;
    ScheduleDirectory scheduleDirectory;

    public Merchant() {
        super();
        this.productCatalog = new ProductCatalog();
        this.scheduleDirectory= new ScheduleDirectory();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public ScheduleDirectory getScheduleDirectory() {
        return scheduleDirectory;
    }

    public void setScheduleDirectory(ScheduleDirectory scheduleDirectory) {
        this.scheduleDirectory = scheduleDirectory;
    }

 

    @Override
    public String toString() {
        return merchantName;
    }
}
