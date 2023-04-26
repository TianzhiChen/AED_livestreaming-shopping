/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Merchant;

import java.util.ArrayList;

/**
 *
 * @author tianzhichen
 */
public class MerchantDirectory {

    private ArrayList<Merchant> merchantList;

    public MerchantDirectory() {
        merchantList = new ArrayList<Merchant>();
    }

    public ArrayList<Merchant> getMerchantList() {
        return merchantList;
    }

    public void setMerchantList(ArrayList<Merchant> merchantList) {
        this.merchantList = merchantList;
    }

    public Merchant findMerchantByName(String name) {

        for (Merchant merchant : merchantList) {

            if (merchant.getMerchantName().equals(name)) {
                return merchant;
            }
        }
        return null;
    }

    public Merchant findById(String id) {;
        for (Merchant m : this.merchantList) {
            if (m.getPersonId().equals(id)) {
                return m;
            }
        }
        return null;
    }
    
     public Merchant createMerchant(String name) {
        Merchant m = new Merchant();
        m.setMerchantName(name);

        this.merchantList.add(m);
        return m;
    }
      

}
