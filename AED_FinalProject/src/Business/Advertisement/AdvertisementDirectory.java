/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Advertisement;

import Business.ProductCatalog.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tianzhichen
 */
public class AdvertisementDirectory {

    private ArrayList<Advertisement> adList;

    public AdvertisementDirectory() {
        this.adList = new ArrayList<Advertisement>();
    }

    public Advertisement findAdByName(String name) {
        for (Advertisement ad : this.adList) {
            if (ad.getAdName().equals(name)) {
                return ad;
            }
        }
        return null;
    }

    public Advertisement findAdById(String name) {
        for (Advertisement ad : this.adList) {
            if (ad.getAdName().equals(name)) {
                return ad;
            }
        }
        return null;
    }
    
    public Advertisement createAd(String name, double price, int populiraty) {
        Advertisement ad = new Advertisement();
 
        ad.setAdName(name);
        ad.setAdPrice(price);
        ad.setPopularity(populiraty);
        
        for (Advertisement a : this.adList) {
            if (a.getAdName().equals(name)) {
                JOptionPane.showMessageDialog(null, "Advertisement existed");
                return null;
            }
        }
        this.adList.add(ad);
        return ad;
    }
    
    public void removeAd(String name) {
        for (Advertisement a : this.adList) {
            if (a.getAdName().equals(name)) {
                this.adList.remove(a);
                break;
            }
        }
    }

    public ArrayList<Advertisement> getAdList() {
        return adList;
    }

    public void setAdList(ArrayList<Advertisement> adList) {
        this.adList = adList;
    }
    
    
}
