
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
public class InspectionWorkQueue {
    private ArrayList<InspectionWorkRequest> workRequestList;

    public InspectionWorkQueue() {
        workRequestList=new ArrayList<InspectionWorkRequest>();
    }

    public ArrayList<InspectionWorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<InspectionWorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


