/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author tianzhichen
 */
public class EcoSystem {

    public static EcoSystem ecosystem;

    ArrayList<Network> networkList;
    
    static EcoSystem getInstance() {
        if (ecosystem == null) {
            ecosystem = new EcoSystem();
            return ecosystem;
        }
        return ecosystem;
    }
    
    // create network and add to the list
}
