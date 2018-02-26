/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerWorkArea;

import Business.WorkQueue.InspectionWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author brandonz
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
     JPanel userProcessContainer;
    InspectionWorkRequest request;
    public ProcessWorkRequestJPanel( JPanel userProcessContainer, InspectionWorkRequest request) {
        initComponents();
        this.request =request;
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 130, -1, -1));

        jLabel1.setText("Result");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 67, -1, -1));
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 64, 204, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Process Work Request");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        request.setResult(resultJTextField.getText());
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(null, "Message processed");

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AssignJPanel lwjp = (AssignJPanel) component;
        lwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
