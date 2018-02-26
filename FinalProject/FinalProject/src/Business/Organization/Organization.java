/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Animal.AnimalDirectory;
import Business.Person.CustomerList;
import Business.Person.Staff;
import Business.Person.VolunteerList;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.AdoptionWorkQueue;
import Business.WorkQueue.FosterCareWorkQueue;
import Business.WorkQueue.InspectionWorkQueue;
import Business.WorkQueue.LostAnimalWorkQueue;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueueSent;
    private WorkQueue workQueueReceived;
    private AdoptionWorkQueue adoptionWorkQueue;
    private LostAnimalWorkQueue lostAnimalWorkQueue;
    private InspectionWorkQueue inspectionWorkQueue;
    private FosterCareWorkQueue fosterCareWorkQueue;
    private UserAccountDirectory userAccountDirectory;
    private AnimalDirectory animalDirectory;
    private Staff staff;
    private int organizationID;
    private static int counter;
    private String ZipCode;
    private String Address;
    
    public enum Type{
        Admin("Admin Organization"), 
        Inventory("Animal inventory center"),
        Certification("Certification Organization"),
        Inspection("InspectionOrganization");
        
  
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueueSent = new WorkQueue();
        workQueueReceived = new WorkQueue();
        adoptionWorkQueue=new AdoptionWorkQueue();
        lostAnimalWorkQueue=new LostAnimalWorkQueue();
        inspectionWorkQueue = new InspectionWorkQueue();
        fosterCareWorkQueue = new FosterCareWorkQueue();
        animalDirectory=new AnimalDirectory();
        staff=new Staff();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public AdoptionWorkQueue getAdoptionWorkQueue() {
        return adoptionWorkQueue;
    }

    public LostAnimalWorkQueue getLostAnimalWorkQueue() {
        return lostAnimalWorkQueue;
    }

    public FosterCareWorkQueue getFosterCareWorkQueue() {
        return fosterCareWorkQueue;
    }

    public void setFosterCareWorkQueue(FosterCareWorkQueue fosterCareWorkQueue) {
        this.fosterCareWorkQueue = fosterCareWorkQueue;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    

    public abstract ArrayList<Role> getSupportedRole();

    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public Staff getStaff() {
        return staff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public WorkQueue getWorkQueueSent() {
        return workQueueSent;
    }

    public void setWorkQueueSent(WorkQueue workQueueSent) {
        this.workQueueSent = workQueueSent;
    }

    public WorkQueue getWorkQueueReceived() {
        return workQueueReceived;
    }

    public void setWorkQueueReceived(WorkQueue workQueueReceived) {
        this.workQueueReceived = workQueueReceived;
    }

    public AnimalDirectory getAnimalDirectory() {
        return animalDirectory;
    }

    public InspectionWorkQueue getInspectionWorkQueue() {
        return inspectionWorkQueue;
    }

    public void setInspectionWorkQueue(InspectionWorkQueue inspectionWorkQueue) {
        this.inspectionWorkQueue = inspectionWorkQueue;
    }
    
    
}
