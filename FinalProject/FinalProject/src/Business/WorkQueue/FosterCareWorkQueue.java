/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author brandonz
 */
public class FosterCareWorkQueue {
    private ArrayList<FostCareWorkRequest> workRequestList;

    public FosterCareWorkQueue() {
        workRequestList=new ArrayList<FostCareWorkRequest>();
    }

    public ArrayList<FostCareWorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<FostCareWorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }

    
}
