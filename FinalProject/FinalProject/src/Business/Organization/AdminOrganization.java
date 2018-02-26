/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Person.CustomerList;
import Business.Person.VolunteerList;
import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AdminOrganization extends Organization{

    /*private CustomerList customerList;
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
    }*/
    
    public AdminOrganization() {
        super(Type.Admin.getValue());
        //customerList=new CustomerList();
        //volunteerList=new VolunteerList();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
     
}
