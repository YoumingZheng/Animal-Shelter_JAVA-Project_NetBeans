/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Person.Customer;
import Business.Person.Volunteer;
import java.util.Date;

/**
 *
 * @author brandonz
 */
public class InspectionWorkRequest extends WorkRequest{
    private String Result;
    private Date lastTimeCheckDate;
    private Customer customer;
    private String firstInspection;
    private String secondInspection;
    private String thirdInspection;
    private Volunteer volunteer;
    
    public InspectionWorkRequest(){
        super();
        lastTimeCheckDate=this.getRequestDate();
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

    public Date getLastTimeCheckDate() {
        return lastTimeCheckDate;
    }

    public void setLastTimeCheckDate(Date lastTimeCheckDate) {
        this.lastTimeCheckDate = lastTimeCheckDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getFirstInspection() {
        return firstInspection;
    }

    public void setFirstInspection(String firstInspection) {
        this.firstInspection = firstInspection;
    }

    public String getSecondInspection() {
        return secondInspection;
    }

    public void setSecondInspection(String secondInspection) {
        this.secondInspection = secondInspection;
    }

    public String getThirdInspection() {
        return thirdInspection;
    }

    public void setThirdInspection(String thirdInspection) {
        this.thirdInspection = thirdInspection;
    }
    
    public boolean nextTimeCheck(double i){
        long day=(((new Date(lastTimeCheckDate.getTime()+(long)30*24*60*60*1000)).getTime())-(lastTimeCheckDate.getTime()))/(24*60*60*1000);
        if(true) //     day<=i
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return customer.getName();
    }
    
     
}
