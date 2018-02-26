/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Person.CustomerList;
import Business.Person.VolunteerList;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Youming Zheng
 */
public class CustomerAndVolunteerEnterprise extends Enterprise{
    private CustomerList customerList;
    private VolunteerList volunteerList;
    

    public CustomerList getCustomerList() {
        return customerList;
    }

    public void setCustomerList(CustomerList customerList) {
        this.customerList = customerList;
    }

    public VolunteerList getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(VolunteerList volunteerList) {
        this.volunteerList = volunteerList;
    }
    
    public CustomerAndVolunteerEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.CustomerVolunteer);
        customerList=new CustomerList();
        volunteerList=new VolunteerList();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
