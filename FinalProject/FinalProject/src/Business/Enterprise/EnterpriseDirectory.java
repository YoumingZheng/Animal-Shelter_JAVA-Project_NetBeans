/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.AnimalShelter){
            enterprise = new AnimalShelterEnterprise(name);
            enterpriseList.add(enterprise);
        }else
        if (type == Enterprise.EnterpriseType.CityHall){
            enterprise = new CityHallEnterprise(name);
            enterpriseList.add(enterprise);
        }else
        if (type == Enterprise.EnterpriseType.DepartmentOfFinance){
            enterprise = new DepartmentOfFinanceEnterprise(name);
            enterpriseList.add(enterprise);
        }else
        if (type == Enterprise.EnterpriseType.CustomerVolunteer){
            enterprise = new CustomerAndVolunteerEnterprise(name);
            enterpriseList.add(enterprise);
        }    
        
        
        return enterprise;
    }
    
}
