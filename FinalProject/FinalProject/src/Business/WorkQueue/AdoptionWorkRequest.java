/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Person.Customer;

/**
 *
 * @author Youming Zheng
 */
public class AdoptionWorkRequest extends WorkRequest{
    
    private Customer adopter;
    private Boolean validId;
    private Boolean hadPet;
    private Boolean havingPet;
    private String allergy;
    private String fund;
    private String time;
    private String home;

    public Customer getAdopter() {
        return adopter;
    }

    public void setAdopter(Customer adopter) {
        this.adopter = adopter;
    }

    public Boolean getValidId() {
        return validId;
    }

    public void setValidId(Boolean validId) {
        this.validId = validId;
    }

    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public Boolean getHadPet() {
        return hadPet;
    }

    public void setHadPet(Boolean hadPet) {
        this.hadPet = hadPet;
    }

    public Boolean getHavingPet() {
        return havingPet;
    }

    public void setHavingPet(Boolean havingPet) {
        this.havingPet = havingPet;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    
    
    @Override
    public String toString() {
        return adopter.getName();
    }
}
