/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerWorkArea;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.InspectionWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author brandonz
 */
public class GradeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GradeJPanel
     */
    JPanel userProcessContainer;
    UserAccount useraccount;
    InspectionWorkRequest isp;
    int grade;
    String s=new String();
    
    public GradeJPanel(JPanel userProcessContainer, UserAccount useraccount, InspectionWorkRequest isp  ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.isp = isp;
        grade = 0;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtGrade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Good");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Fair");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Bad");

        jLabel2.setText("Status");

        jLabel3.setText("Relationship between customer and pet");

        buttonGroup6.add(jRadioButton4);
        jRadioButton4.setText("Good");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup6.add(jRadioButton5);
        jRadioButton5.setText("Fair");

        buttonGroup6.add(jRadioButton6);
        jRadioButton6.setText("Bad");

        jLabel4.setText("Living condition");

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setText("Good");

        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setText("Fair");

        buttonGroup2.add(jRadioButton9);
        jRadioButton9.setText("Bad");

        jLabel5.setText("Space");

        buttonGroup3.add(jRadioButton10);
        jRadioButton10.setText("Good");

        buttonGroup3.add(jRadioButton11);
        jRadioButton11.setText("Fair");

        buttonGroup3.add(jRadioButton12);
        jRadioButton12.setText("Bad");

        jLabel6.setText("Food");

        buttonGroup4.add(jRadioButton13);
        jRadioButton13.setText("Good");

        buttonGroup4.add(jRadioButton14);
        jRadioButton14.setText("Fair");

        buttonGroup4.add(jRadioButton15);
        jRadioButton15.setText("Bad");

        jLabel7.setText("Pet supplies");

        buttonGroup5.add(jRadioButton16);
        jRadioButton16.setText("Good");

        buttonGroup5.add(jRadioButton17);
        jRadioButton17.setText("Fair");

        buttonGroup5.add(jRadioButton18);
        jRadioButton18.setText("Bad");

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtGrade.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText("Grade Inspection");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(135, 135, 135))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(36, 36, 36)
                                .addComponent(jRadioButton2)
                                .addGap(28, 28, 28)
                                .addComponent(jRadioButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton7)
                                .addGap(36, 36, 36)
                                .addComponent(jRadioButton8)
                                .addGap(28, 28, 28)
                                .addComponent(jRadioButton9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton10)
                                .addGap(36, 36, 36)
                                .addComponent(jRadioButton11)
                                .addGap(28, 28, 28)
                                .addComponent(jRadioButton12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton13)
                                .addGap(36, 36, 36)
                                .addComponent(jRadioButton14)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton16)
                                .addGap(46, 46, 46)
                                .addComponent(jRadioButton17)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton4)
                                .addGap(36, 36, 36)
                                .addComponent(jRadioButton5)
                                .addGap(28, 28, 28)
                                .addComponent(jRadioButton6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton2)
                        .addGap(142, 142, 142)
                        .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)))
                .addGap(215, 215, 215))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14)
                    .addComponent(jRadioButton15))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton16)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton18))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton4)
                        .addComponent(jLabel3))
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       

        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(jRadioButton1.isSelected() == false && jRadioButton2.isSelected() == false && jRadioButton3.isSelected() == false){
           JOptionPane.showMessageDialog(null, "answer the first question");
           return;
        }
        if(jRadioButton7.isSelected() == false && jRadioButton8.isSelected() == false && jRadioButton9.isSelected() == false){
           JOptionPane.showMessageDialog(null, "answer the second question");
           return;
        }
        if(jRadioButton10.isSelected() == false && jRadioButton11.isSelected() == false && jRadioButton12.isSelected() == false){
           JOptionPane.showMessageDialog(null, "answer the third question");
           return;
        }
        if(jRadioButton13.isSelected() == false && jRadioButton14.isSelected() == false && jRadioButton15.isSelected() == false){
           JOptionPane.showMessageDialog(null, "answer the forth question");
           return;
        }
        if(jRadioButton16.isSelected() == false && jRadioButton17.isSelected() == false && jRadioButton18.isSelected() == false){
           JOptionPane.showMessageDialog(null, "answer the fifth question");
           return;
        }
        if(jRadioButton4.isSelected() == false && jRadioButton5.isSelected() == false && jRadioButton6.isSelected() == false){
           JOptionPane.showMessageDialog(null, "answer the sixth question");
           return;
        }
        
        grade = 0;
        s=null;
        
        if(jRadioButton1.isSelected())  {
            grade = grade +3;
        }
        if(jRadioButton2.isSelected())  {
            grade = grade +2;
        }
        if(jRadioButton3.isSelected()){
            grade = grade +1;
        }
        if(jRadioButton7.isSelected())  {
            grade = grade +3;
        }
        if(jRadioButton8.isSelected())  {
            grade = grade +2;
        }
        if(jRadioButton9.isSelected()){
            grade = grade +1;
        }
        if(jRadioButton10.isSelected())  {
            grade = grade +3;
        }
        if(jRadioButton11.isSelected())  {
            grade = grade +2;
        }
        if(jRadioButton12.isSelected()){
            grade = grade +1;
        }
        if(jRadioButton13.isSelected())  {
            grade = grade +3;
        }
        if(jRadioButton14.isSelected())  {
            grade = grade +2;
        }
        if(jRadioButton15.isSelected()){
            grade = grade +1;
        }
        if(jRadioButton16.isSelected())  {
            grade = grade +3;
        }
        if(jRadioButton17.isSelected())  {
            grade = grade +2;
        }
        if(jRadioButton18.isSelected()){
            grade = grade +1;
        }
        if(jRadioButton4.isSelected())  {
            grade = grade +3;
        }
        if(jRadioButton5.isSelected())  {
            grade = grade +2;
        }
        if(jRadioButton6.isSelected()){
            grade = grade +1;
        }
        Date date = new Date();
        //isp.setGrade(grade);
        isp.setLastTimeCheckDate(date);
        isp.setStatus("Completed");
        
        
        if(grade<=7){
            s="C";
        }else if(grade>7 && grade<=14){
            s="B";
        }else if(grade>14 && grade<=18){
            s="A";
        }
        
        if(isp.getFirstInspection()==null){
            isp.setFirstInspection(s);
        }else if(isp.getSecondInspection()==null){
            isp.setSecondInspection(s);
        }else if(isp.getThirdInspection()==null){
            isp.setThirdInspection(s);
        }
        
        useraccount.getInspectionWorkQueue().getWorkRequestList().remove(isp);
        
        txtGrade.setText(s);
        JOptionPane.showMessageDialog(null, "Grade Completed");
        jButton1.setEnabled(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.show(userProcessContainer,"AssignJPanel");  */
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AssignJPanel assignJPanel = (AssignJPanel) component;
        assignJPanel.populateTable1();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jRadioButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField txtGrade;
    // End of variables declaration//GEN-END:variables
}
