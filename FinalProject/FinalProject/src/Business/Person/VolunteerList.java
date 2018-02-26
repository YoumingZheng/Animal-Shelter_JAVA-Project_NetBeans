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
public class VolunteerList {
    /*
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
    */
    private ArrayList<Volunteer> volunteerList;

    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }
    
    public VolunteerList(){
        volunteerList=new ArrayList<Volunteer>();
    }
    
    public Volunteer newVolunteer(String name){
        Volunteer volunteer=new Volunteer();
        volunteer.setName(name);
        volunteerList.add(volunteer);
        return volunteer;
    }
}
