/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Delivery;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author shansun
 */
public class DeliveryAgentDirectory {

    ArrayList<DeliveryAgent> agents;

    public DeliveryAgentDirectory() {
        this.agents = new ArrayList<>();
    }

    public ArrayList<DeliveryAgent> getAgents() {
        return agents;
    }

    public void setAgents(ArrayList<DeliveryAgent> agents) {
        this.agents = agents;
    }

    public DeliveryAgent createAgent(String name) {
        DeliveryAgent da = new DeliveryAgent(name);
        da.setName(name);
        for (DeliveryAgent d : this.agents) {
            if (d.getName().equals(name)) {
                JOptionPane.showMessageDialog(null, "Agent existed");
                return null;
            }
        }
        this.agents.add(da);
        JOptionPane.showMessageDialog(null, "Agent created");
        return da;
    }

    public DeliveryAgent findbyname(String name){
        for (DeliveryAgent d : this.agents)
            if(d.getName().equals(name))
                return d;
        return null;
    
    }

    public void removeAgent(String name) {
        for (DeliveryAgent da : this.agents) {
            if (da.getName().equals(name)) {
                this.agents.remove(da);
                break;
            }
        }
    }
}
