/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.CertificationManager.CertificationManagerWorkArea;
import Interface.InspectionManager.InspectionManagerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Emmet Zhao
 */
public class InspectionManager extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new InspectionManagerWorkArea(userProcessContainer, account, organization, enterprise, network, system);
    }
}
