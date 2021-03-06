/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CustomerRole;

import Business.Enterprise.AnimalShelterEnterprise;
import Business.Organization.CertificationOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LostAnimalWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author brandonz
 */
public class RequestLost extends javax.swing.JPanel {

    /**
     * Creates new form RequestLost
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    LostAnimalWorkRequest request;
    public RequestLost(JPanel userProcessContainer, UserAccount userAccount, LostAnimalWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Submit Message");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 95, -1, -1));

        jLabel1.setText("Message");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 40, -1, -1));
        jPanel1.add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 37, 89, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 138, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 46, 447, 323));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Request Lost Animal");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        String result = messageJTextField.getText();
        if(result.equals("") || result.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter something to send.");
            return;
        }
        request.setMessage(messageJTextField.getText());
        request.setStatus("Sent");
        JOptionPane.showMessageDialog(null, "Request Submitted, please visit the animal shelter you chose");
       
       
        
        

       

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

       userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}
