/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;

/**
 *
 * @author raunak
 */
public class InventoryWorkRequest extends WorkRequest{
    
    private Enterprise enterpriseSend;
    private Enterprise enterpriseReceive;

    public Enterprise getEnterpriseSend() {
        return enterpriseSend;
    }

    public void setEnterpriseSend(Enterprise enterpriseSend) {
        this.enterpriseSend = enterpriseSend;
    }

    public Enterprise getEnterpriseReceive() {
        return enterpriseReceive;
    }

    public void setEnterpriseReceive(Enterprise enterpriseReceive) {
        this.enterpriseReceive = enterpriseReceive;
    }
    
    @Override
    public String toString() {
        return enterpriseReceive.getName();
    }

}
