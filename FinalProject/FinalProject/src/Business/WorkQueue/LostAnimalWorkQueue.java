/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Youming Zheng
 */
public class LostAnimalWorkQueue {
    private ArrayList<LostAnimalWorkRequest> workRequestList;

    public LostAnimalWorkQueue() {
        workRequestList=new ArrayList<LostAnimalWorkRequest>();
    }

    public ArrayList<LostAnimalWorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<LostAnimalWorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }
    
    
    
}
