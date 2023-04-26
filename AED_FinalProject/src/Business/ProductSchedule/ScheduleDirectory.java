/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ProductSchedule;

import Business.ProductCatalog.Product;
import Business.ProductCatalog.ProductCatalog;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Record of all live-streaming schedules.
 *
 * @author tianzhichen
 */
public class ScheduleDirectory {

    ArrayList<Schedule> scheduleList;

    public ScheduleDirectory() {
        this.scheduleList = new ArrayList<>();
    }

    public Schedule createSchedule(String name, Date date) {
        Schedule schedule = new Schedule(name, date);
        schedule.setDate(date);
        schedule.setName(name);
        for (Schedule s : this.scheduleList) {
            if (s.getName().equals(name) && s.getDate().equals(date)) {
                JOptionPane.showMessageDialog(null, "Scehdule existed");
                return null;
            }
        }        
        this.scheduleList.add(schedule);
        JOptionPane.showMessageDialog(null, "Scehdule created");
        return schedule;
    }

    public Schedule findScheduleByName(String name) {
        for (Schedule schedule : scheduleList) {
            if (schedule.getName().equals(name) ) {
                return schedule;
            }
        }
        return null;
    }

    public void removeSchedule(String name, Date date) {
        // find the product obj in the arraylist with this name
        for (Schedule schedule : this.scheduleList) {
            if (schedule.getName().equals(name) && schedule.getDate().equals(date)) {
                this.scheduleList.remove(schedule);
                break;
            }
        }
    }

    public ArrayList<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(ArrayList<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }
    
    

}
