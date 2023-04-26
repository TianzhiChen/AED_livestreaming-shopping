/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Advertisement.AdvertisementDirectory;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Customer.MasterOrderDirectory;
import Business.Delivery.DeliveryAgentDirectory;
import Business.Merchant.Merchant;
import Business.Merchant.MerchantDirectory;
import Business.ProductCatalog.Product;
import Business.ProductCatalog.ProductCatalog;
import Business.ProductSchedule.ProductOffer;
import Business.ProductSchedule.Schedule;
import Business.ProductSchedule.ScheduleDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tianzhichen
 */
public class Business {

    private CustomerDirectory customerDirectory;
    private MerchantDirectory merchantDirectory;
    private UserAccountDirectory userAccountDirectory;
    private DeliveryAgentDirectory deliveryAgentDirectory;
    private AdvertisementDirectory advertisementDirectory;
    ProductCatalog masterProductCatalog;
    private MasterOrderDirectory allOrders;

    public Business() {
        this.customerDirectory = new CustomerDirectory();
        this.merchantDirectory = new MerchantDirectory();
        this.userAccountDirectory = new UserAccountDirectory(this);
        this.masterProductCatalog = new ProductCatalog();
        this.deliveryAgentDirectory = new DeliveryAgentDirectory();
        this.advertisementDirectory = new AdvertisementDirectory();
        this.allOrders = new MasterOrderDirectory();

        UserAccount sysAdmin = this.userAccountDirectory.createUserAccount("admin", "admin", "System_Manager");
        UserAccount ad_admin = this.userAccountDirectory.createUserAccount("ad_admin", "ad_admin", "Ad_Admin");
        UserAccount delivery_admin = this.userAccountDirectory.createUserAccount("delivery_admin", "delivery_admin", "Delivery_Admin");
        UserAccount validation_admin = this.userAccountDirectory.createUserAccount("validation_admin", "validation_admin", "Validation_Admin");
        UserAccount live_admin = this.userAccountDirectory.createUserAccount("live_admin", "live_admin", "Live_Admin");
        UserAccount delivery_company = this.userAccountDirectory.createUserAccount("delivery_company", "delivery_company", "Delivery_Company");
        UserAccount merchant = this.userAccountDirectory.createUserAccount("merchant", "merchant", "Merchant");
        UserAccount customer =  this.userAccountDirectory.createUserAccount("customer","customer","Customer");
        
        Customer c = customer.creatCustomer();
        System.out.println(c.getName());
        customerDirectory.getCustomerDirectory().add(c);
        for(Customer co : customerDirectory.getCustomerDirectory()){
            System.out.println(co.getName()+"add");
        }
//        c.setPhoneNumber(Long.valueOf("1111111111"));
//        Product a = new Product();
//        a.setDescription("good");
//        a.setProductName("product1");
//        a.setProductPrice(22.3);
//         Product b = new Product();
//        b.setDescription("normal");
//        b.setProductName("product2");
//        b.setProductPrice(10.3);
//         Merchant mmm = new Merchant();
//         mmm.setMerchantName("merchant");
//         
//        this.merchantDirectory.getMerchantList().add(mmm);
//        Merchant m1 = this.merchantDirectory.createMerchant("111");
//        System.out.println(m1.getMerchantName());
//        System.out.println(m1.getName()+2);
//        mmm.getProductCatalog().getProductList().add(b);
//        mmm.getProductCatalog().getProductList().add(a);
//        Date date = new Date();
        
//        ScheduleDirectory sss = new ScheduleDirectory();
//        mmm.setScheduleDirectory(sss);
//        ArrayList<Schedule> scheduleL = new ArrayList<>();
//        sss.setScheduleList(scheduleL);
//        Schedule schedule = new Schedule("first", date);
//        scheduleL.add(schedule);
//        System.out.println(schedule.getName()+3);
//        
// 
//        Map<String, ProductOffer> productMap = new HashMap<>();
//        schedule.setProductMap(productMap);
//        ProductOffer a1= new ProductOffer(a,10);
//        ProductOffer a2= new ProductOffer(b,10);
//        productMap.put("product1",a1 );
//        productMap.put("product2",a2 );
        
     
    }

    public static Business getBusinessInstance() {
        return new Business();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    /**
     * @return the customerDirectory
     */
    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    /**
     * @param customerDirectory the customerDirectory to set
     */
    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public MerchantDirectory getMerchantDirectory() {
        return merchantDirectory;
    }

    public void setMerchantDirectory(MerchantDirectory merchantDirectory) {
        this.merchantDirectory = merchantDirectory;
    }

    public ProductCatalog getMasterProductCatalog() {
        return masterProductCatalog;
    }

    public void setMasterProductCatalog(ProductCatalog masterProductCatalog) {
        this.masterProductCatalog = masterProductCatalog;
    }

    public DeliveryAgentDirectory getDeliveryAgentDirectory() {
        return deliveryAgentDirectory;
    }

    public void setDeliveryAgentDirectory(DeliveryAgentDirectory deliverAgentDirectory) {
        this.deliveryAgentDirectory = deliverAgentDirectory;
    }

    public AdvertisementDirectory getAdvertisementDirectory() {
        return advertisementDirectory;
    }

    public void setAdvertisementDirectory(AdvertisementDirectory advertisementDirectory) {
        this.advertisementDirectory = advertisementDirectory;
    }

    public MasterOrderDirectory getAllOrders() {
        return allOrders;
    }

    public void setAllOrders(MasterOrderDirectory allOrders) {
        this.allOrders = allOrders;
    }

    
    
}
