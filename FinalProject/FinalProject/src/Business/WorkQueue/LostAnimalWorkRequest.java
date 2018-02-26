/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Person.Customer;
import javax.swing.ImageIcon;

/**
 *
 * @author Youming Zheng
 */
public class LostAnimalWorkRequest extends WorkRequest{
     private String Result;
     private Customer lostCustomer;
     private boolean validId;
     private boolean vaccineHistory;
     private boolean receipt;
     private ImageIcon icon;
     private String picturepath;

    public String getPicturepath() {
        return picturepath;
    }

    public void setPicturepath(String picturepath) {
        this.picturepath = picturepath;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
     

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

    public Customer getLostCustomer() {
        return lostCustomer;
    }

    public void setLostCustomer(Customer lostCustomer) {
        this.lostCustomer = lostCustomer;
    }

    public boolean isValidId() {
        return validId;
    }

    public void setValidId(boolean validId) {
        this.validId = validId;
    }

    public boolean isVaccineHistory() {
        return vaccineHistory;
    }

    public void setVaccineHistory(boolean vaccineHistory) {
        this.vaccineHistory = vaccineHistory;
    }

    public boolean isReceipt() {
        return receipt;
    }

    public void setReceipt(boolean receipt) {
        this.receipt = receipt;
    }
    
    @Override
    public String toString() {
        return lostCustomer.getName();
    }
}
