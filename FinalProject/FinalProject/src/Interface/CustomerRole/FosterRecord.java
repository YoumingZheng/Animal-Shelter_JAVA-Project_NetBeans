/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CustomerRole;

import Business.Animal.Animal;
import Business.Person.Customer;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FostCareWorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Youming Zheng
 */
public class FosterRecord extends javax.swing.JPanel {

    /**
     * Creates new form FosterRecord
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;

    FosterRecord(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);
        
        for(FostCareWorkRequest fcwr : userAccount.getFosterCareWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = fcwr;
            row[1] = fcwr.getCustomer().getAddress();
            row[2] = fcwr.getAnimal().getSpecies();
            row[3] = fcwr.getAnimal().getBreed();
            row[4] = fcwr.getAnimal().getGender();
 
            model.addRow(row);
        }
    }
    
    public void populateimage(String url, JLabel lbl) {

            ImageIcon imageIcon = new ImageIcon(url);
            Image image = imageIcon.getImage();
            Image smallImage = image.getScaledInstance(200, 200, Image.SCALE_FAST);
            ImageIcon smallIcon = new ImageIcon(smallImage);
            lbl.setIcon(smallIcon);
            
    }
    
    /*
    public void populateTable() {
       
        
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);
        
        for(FostCareWorkRequest fcwr : enterprise.getFosterCareWorkQueue().getWorkRequestList()){
            if(!fcwr.getStatus().equals("Received")){
                if( fcwr.getCustomer().getZipCode().equals(zipTxt.getText()) || zipTxt.getText().equals("")){
                Object[] row = new Object[5];
                row[0] = fcwr;
                row[1] = fcwr.getCustomer().getAddress();
                row[2] = fcwr.getAnimal().getSpecies();
                row[3] = fcwr.getAnimal().getBreed();
                row[4] = fcwr.getAnimal().getGender();
 
                model.addRow(row);
                }
            }
        }
    }
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtBreed2 = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSpecies = new javax.swing.JTextField();
        txtDay = new javax.swing.JTextField();
        txtHabit = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jlPhoto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        txtAge = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Age:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 472, -1, -1));

        jLabel1.setText("Email:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 378, -1, -1));

        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 315, -1, -1));

        jLabel8.setText("Address:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 349, -1, -1));

        jButton2.setText("See Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 213, -1, -1));

        txtAddress.setEditable(false);
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 346, 188, -1));

        jLabel20.setText("Help me for how many days:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 479, -1, -1));

        txtEmail.setEditable(false);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 375, 188, -1));

        txtBreed2.setEditable(false);
        txtBreed2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBreed2ActionPerformed(evt);
            }
        });
        add(txtBreed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 389, 188, -1));

        txtName.setEditable(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 312, 188, -1));

        txtColor.setEditable(false);
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 429, 188, -1));

        txtGender.setEditable(false);
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 349, 188, -1));

        jLabel15.setText("Species:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 315, -1, -1));

        jLabel5.setText("Gender:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 352, -1, -1));

        txtSpecies.setEditable(false);
        txtSpecies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpeciesActionPerformed(evt);
            }
        });
        add(txtSpecies, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 312, 188, -1));

        txtDay.setEditable(false);
        txtDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDayActionPerformed(evt);
            }
        });
        add(txtDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 476, 52, -1));

        txtHabit.setEditable(false);
        txtHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabitActionPerformed(evt);
            }
        });
        add(txtHabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 441, 188, -1));

        jLabel17.setText("Phone:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 407, -1, -1));

        jlPhoto.setText("      Upload photo here");
        add(jlPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 516, 189, 165));

        jLabel6.setText("Pet Habit:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 444, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("My Information:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 256, -1, -1));

        txtPhone.setEditable(false);
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 404, 188, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Animal Information:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 256, -1, -1));

        jLabel13.setText("Color:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 432, -1, -1));

        jLabel14.setText("Breed:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 392, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Address", "Species", "Breed", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 64, 846, 136));

        txtAge.setEditable(false);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 469, 188, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 586, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Foster Record");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable3.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row first!","Warining",JOptionPane.WARNING_MESSAGE);
            return;
        }
        FostCareWorkRequest fcwr=(FostCareWorkRequest)jTable3.getValueAt(selectedRow, 0);

        Animal animal=fcwr.getAnimal();
        Customer customer=fcwr.getCustomer();

        txtSpecies.setText(animal.getSpecies());
        txtGender.setText(animal.getGender());
        txtBreed2.setText(animal.getBreed());
        txtColor.setText(animal.getColor());
        txtAge.setText(animal.getAge());
        //jlPhoto.setIcon(animal.getIcon());
        populateimage(animal.getPicturepath(), jlPhoto);

        txtName.setText(customer.getName());
        txtAddress.setText(customer.getAddress());
        txtEmail.setText(customer.getEmail());
        txtPhone.setText(fcwr.getPhone());
        txtHabit.setText(fcwr.getHabit());
        txtDay.setText(fcwr.getDayCount());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtBreed2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBreed2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBreed2ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtSpeciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpeciesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpeciesActionPerformed

    private void txtDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDayActionPerformed

    private void txtHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabitActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel jlPhoto;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBreed2;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHabit;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSpecies;
    // End of variables declaration//GEN-END:variables
}
