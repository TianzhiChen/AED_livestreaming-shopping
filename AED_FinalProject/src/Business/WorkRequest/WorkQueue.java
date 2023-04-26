/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import java.util.ArrayList;

/**
 *
 * @author tianzhichen
 */
public class WorkQueue {
    ArrayList<WorkRequest> packageShipping;
    
    public void createWorkRequest(String type) {
        if(type.equals("package")) {
            WorkRequest request = new PackageShippingRequest();
            packageShipping.add(request);
        }
    }
}
