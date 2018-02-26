/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Youming Zheng
 */
public class CustomerList {
    
    private ArrayList<Customer> customerList;

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public CustomerList(){
        customerList=new ArrayList<Customer>();
    }
    
    public Customer newCustomer(String name){
        Customer customer=new Customer();
        customer.setName(name);
        customerList.add(customer);
        return customer;
    }
    
}
