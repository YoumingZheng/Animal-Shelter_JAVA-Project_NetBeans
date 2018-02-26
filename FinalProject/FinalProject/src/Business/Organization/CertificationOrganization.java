/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CertificationManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Emmet Zhao
 */
public class CertificationOrganization extends Organization{
    public CertificationOrganization() {
        super(Organization.Type.Certification.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CertificationManager());
        return roles;
    }
}
