/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author tianzhichen
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory() {
        
    }
    
    public Enterprise createEnterprise(EnterpriseType type) {
        Enterprise enterprise;
        
        if(type == EnterpriseType.Advertisment) {
            enterprise = new AdvertismentEnterprise();
            enterpriseList.add(enterprise);
            return enterprise;     
        }
        
        return null;
    }
    
}
