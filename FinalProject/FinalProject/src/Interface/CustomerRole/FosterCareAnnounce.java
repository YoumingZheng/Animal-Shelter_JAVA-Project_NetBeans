/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CustomerRole;

import Business.Animal.Animal;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdoptionWorkRequest;
import Business.WorkQueue.FostCareWorkRequest;
import Business.WorkQueue.InspectionWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brandonz
 */
public class FosterCareAnnounce extends javax.swing.JPanel {

    /**
     * Creates new form FosterCareAnnounce
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Network netWork;
    private Animal an;
    public FosterCareAnnounce(JPanel userProcessContainer,UserAccount userAccount, Enterprise enterprise, Network network,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.netWork = network;
      
        display();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBreed2 = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSpecies = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtDay = new javax.swing.JTextField();
        txtHabit = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Announce");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(846, 670, -1, -1));

        jLabel3.setText("My Animal");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 101, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Species", "Breed", "Color", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 124, 960, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Animal Information:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 449, -1, -1));

        jLabel13.setText("Color:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 616, -1, -1));

        jLabel14.setText("Breed:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 576, -1, -1));

        txtBreed2.setEditable(false);
        txtBreed2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBreed2ActionPerformed(evt);
            }
        });
        add(txtBreed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 573, 188, -1));

        txtColor.setEditable(false);
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 613, 188, -1));

        txtGender.setEditable(false);
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 533, 188, -1));

        jLabel15.setText("Species:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 499, -1, -1));

        jButton2.setText("Import Animal Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 397, -1, -1));

        jLabel5.setText("Gender:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 536, -1, -1));

        txtSpecies.setEditable(false);
        txtSpecies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpeciesActionPerformed(evt);
            }
        });
        add(txtSpecies, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 496, 188, -1));

        jLabel16.setText("Age:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 656, -1, -1));

        txtAge.setEditable(false);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 653, 188, -1));

        txtDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDayActionPerformed(evt);
            }
        });
        add(txtDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 569, 92, -1));

        txtHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabitActionPerformed(evt);
            }
        });
        add(txtHabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 529, 188, -1));

        jLabel17.setText("Phone:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 495, -1, -1));

        jLabel6.setText("Pet Habit:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 532, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("My Information:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 445, -1, -1));

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 492, 188, -1));

        jLabel20.setText("Help me for how many days:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 572, -1, -1));

        jLabel2.setText("Message:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 607, -1, -1));

        txtMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageActionPerformed(evt);
            }
        });
        add(txtMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 604, 188, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 693, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setText("Foster Care Announce");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            FostCareWorkRequest frequest = new FostCareWorkRequest();
            InspectionWorkRequest irequest = (InspectionWorkRequest) jTable1.getValueAt(selectedRow, 0);
            frequest.setAnimal(irequest.getAnimal());
            frequest.setCustomer(irequest.getCustomer());
            frequest.setDayCount(txtDay.getText());
            frequest.setPhone(txtPhone.getText());
            frequest.setHabit(txtHabit.getText());
            frequest.setMessage(txtMessage.getText());
            frequest.setStatus("Sent");
            frequest.setResult("");
            enterprise.getFosterCareWorkQueue().getWorkRequestList().add(frequest);
            
            JOptionPane.showMessageDialog(null, "Request Posted");
            //userAccount.getFosterCareWorkQueue().getWorkRequestList().add(frequest);
      } else {
           JOptionPane.showMessageDialog(null, "Choose a row to announce.");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtBreed2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBreed2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBreed2ActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtSpeciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpeciesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpeciesActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDayActionPerformed

    private void txtHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabitActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row first!","Warining",JOptionPane.WARNING_MESSAGE);
            return;
        }
        InspectionWorkRequest inspectionWorkRequest=(InspectionWorkRequest)jTable1.getValueAt(selectedRow, 0);
        Animal animal=inspectionWorkRequest.getAnimal();
        
        txtSpecies.setText(animal.getSpecies());
        txtGender.setText(animal.getGender());
        txtBreed2.setText(animal.getBreed());
        txtColor.setText(animal.getColor());
        txtAge.setText(animal.getAge());

        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBreed2;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHabit;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSpecies;
    // End of variables declaration//GEN-END:variables

    private void display() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for(InspectionWorkRequest inspectionWorkRequest: userAccount.getInspectionWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            Animal animal=inspectionWorkRequest.getAnimal();
            row[0] = inspectionWorkRequest;
            row[1] = animal.getSpecies();
            row[2]=animal.getBreed();
            row[3]=animal.getColor();
            row[4]=animal.getAge();
            
           
            
            model.addRow(row);
        }
        
    }  
}
