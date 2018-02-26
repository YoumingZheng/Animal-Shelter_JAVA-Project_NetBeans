/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Youming Zheng
 */
public class Staff {
    private ArrayList<Employee> staff;

    public ArrayList<Employee> getStaff() {
        return staff;
    }
    
    public Staff(){
        staff=new ArrayList<Employee>();
    }
    
    public Employee newEmployee(String name){
        Employee employee=new Employee();
        employee.setName(name);
        staff.add(employee);
        return employee;
    }
}
