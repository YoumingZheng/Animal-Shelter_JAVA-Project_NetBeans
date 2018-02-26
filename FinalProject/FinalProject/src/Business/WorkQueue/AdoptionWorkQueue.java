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
public class AdoptionWorkQueue {
        private ArrayList<AdoptionWorkRequest> AdoptionWorkRequestList;

    public AdoptionWorkQueue() {
        AdoptionWorkRequestList = new ArrayList<>();
    }

    public ArrayList<AdoptionWorkRequest> getAdoptionWorkRequestList() {
        return AdoptionWorkRequestList;
    }
}
