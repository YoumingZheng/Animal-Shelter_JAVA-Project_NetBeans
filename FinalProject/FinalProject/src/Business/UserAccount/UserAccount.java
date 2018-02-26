/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.AdoptionWorkQueue;
import Business.WorkQueue.FosterCareWorkQueue;
import Business.WorkQueue.InspectionWorkQueue;
import Business.WorkQueue.LostAnimalWorkQueue;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Person person;
    private Role role;
    private WorkQueue workQueue;
    private AdoptionWorkQueue adoptionWorkQueue;
    private LostAnimalWorkQueue lostAnimalWorkQueue;
    private InspectionWorkQueue inspectionWorkQueue;
    private FosterCareWorkQueue fosterCareWorkQueue;
    public UserAccount() {
        workQueue = new WorkQueue();
        adoptionWorkQueue=new AdoptionWorkQueue();
        lostAnimalWorkQueue=new LostAnimalWorkQueue();
        inspectionWorkQueue=new InspectionWorkQueue();
        fosterCareWorkQueue=new FosterCareWorkQueue();
    }

    public InspectionWorkQueue getInspectionWorkQueue() {
        return inspectionWorkQueue;
    }

    public void setInspectionWorkQueue(InspectionWorkQueue inspectionWorkQueue) {
        this.inspectionWorkQueue = inspectionWorkQueue;
    }
    
    
    public AdoptionWorkQueue getAdoptionWorkQueue() {
        return adoptionWorkQueue;
    }

    public void setAdoptionWorkQueue(AdoptionWorkQueue adoptionWorkQueue) {
        this.adoptionWorkQueue = adoptionWorkQueue;
    }

    public LostAnimalWorkQueue getLostAnimalWorkQueue() {
        return lostAnimalWorkQueue;
    }

    public void setLostAnimalWorkQueue(LostAnimalWorkQueue lostAnimalWorkQueue) {
        this.lostAnimalWorkQueue = lostAnimalWorkQueue;
    }

    public FosterCareWorkQueue getFosterCareWorkQueue() {
        return fosterCareWorkQueue;
    }

    public void setFosterCareWorkQueue(FosterCareWorkQueue fosterCareWorkQueue) {
        this.fosterCareWorkQueue = fosterCareWorkQueue;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    

    public void setRole(Role role) {
        this.role = role;
    }


    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
}