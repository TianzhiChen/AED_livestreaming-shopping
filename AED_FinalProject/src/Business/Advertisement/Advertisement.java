/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Advertisement;

import Business.Merchant.Merchant;
import Business.ProductSchedule.Schedule;
import java.util.UUID;

/**
 *
 * @author tianzhichen
 */
public class Advertisement {

    private static int count = 0;
    private String adId;
    private String adName;
    private Double adPrice;
    private int popularity;
    Merchant merchant;
    Schedule schedule;

    public Advertisement() {
        this.adId = "AD" + count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Advertisement.count = count;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public Double getAdPrice() {
        return adPrice;
    }

    public void setAdPrice(Double adPrice) {
        this.adPrice = adPrice;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

  
    @Override
    public String toString() {
        return this.adId;
    }

}
