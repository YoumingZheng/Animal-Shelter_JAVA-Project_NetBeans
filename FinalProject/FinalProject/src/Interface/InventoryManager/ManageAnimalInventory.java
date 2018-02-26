/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.InventoryManager;

import Business.Animal.Animal;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.io.File;
/**
 *
 * @author Youming Zheng
 */
public class ManageAnimalInventory extends javax.swing.JPanel {

    /**
     * Creates new form ManageAnimalInventory
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Network network;
    EcoSystem system;
    ImageIcon icon;
    String picturepath=null;

    ManageAnimalInventory(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.organization=organization;
        this.enterprise=enterprise;
        this.network=network;
        this.system=system;
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
        
        if(enterprise.getAnimalDirectory()!=null){
            for (Animal animal : enterprise.getAnimalDirectory().getAnimalDirectory()){
            Object[] row = new Object[5];
            row[0] = animal;
            row[1] = animal.getSpecies();
            row[2]=animal.getBreed();
            row[3]=animal.getColor();
            row[4]=animal.getAge();
            
           
            
            model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtBreed = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSpecies = new javax.swing.JTextField();
        jlPhoto = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Species", "Breed", "Color", "Age"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, 917, 255));

        jLabel1.setText("Breed:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 396, -1, -1));

        jLabel2.setText("Gender:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 431, -1, -1));

        jLabel3.setText("Color:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 471, -1, -1));

        jLabel4.setText("Age:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 506, -1, -1));
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 428, 170, -1));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 503, 170, -1));
        add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 468, 170, -1));
        add(txtBreed, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 393, 170, -1));

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 560, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 560, -1, -1));

        jLabel5.setText("Species:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 356, -1, -1));
        add(txtSpecies, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 353, 170, -1));

        jlPhoto.setText("      Upload photo here");
        add(jlPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 353, 189, 165));

        jButton2.setText("Upload");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 531, -1, -1));

        jButton3.setText("Bar Chart");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 531, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("Manage Inventory");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Animal an=enterprise.getAnimalDirectory().newAnimal();
        
        //an.setIcon(icon);
        an.setPicturepath(picturepath);
        an.setSpecies(txtSpecies.getText());
        an.setBreed(txtBreed.getText());
        an.setColor(txtColor.getText());
        an.setGender(txtGender.getText());
        an.setAge(txtAge.getText());
        
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        /*JFileChooser imgc = new JFileChooser();
        imgc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i = imgc.showOpenDialog(null);
        String path;
        path = imgc.getSelectedFile().getAbsolutePath();
        if(i== imgc.APPROVE_OPTION){
            
            String name = imgc.getSelectedFile().getName();
            System.out.println("path:"+path+"; name:"+name);
        }else{
            System.out.println("no document");
        }
        icon = new ImageIcon(Image.class.getResource(String.valueOf(path)));//ImageIcon(path);
        icon.setImage(icon.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
        jlPhoto.setIcon(icon);*/
        /*JFileChooser imgc = new JFileChooser();
        imgc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i = imgc.showOpenDialog(null);
        String path;
        path = imgc.getSelectedFile().getAbsolutePath();
        if(i== imgc.APPROVE_OPTION){
            
            String name = imgc.getSelectedFile().getName();
            System.out.println("path:"+path+"; name:"+name);
        }else{
            System.out.println("no document");
        }
        icon = new ImageIcon(path);
        icon.setImage(icon.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
        jlPhoto.setIcon(icon);*/
        
        picturepath = null;
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);
        File pic = jfc.getSelectedFile();
        if (pic!=null&&pic.getAbsolutePath().endsWith(".jpg")){
            
            picturepath = pic.getAbsolutePath();
            ImageIcon imageIcon = new ImageIcon(picturepath);
            Image image = imageIcon.getImage();
            Image smallImage = image.getScaledInstance(169,169,Image.SCALE_FAST);
            ImageIcon smallIcon = new ImageIcon(smallImage);
            jlPhoto.setIcon(smallIcon);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int dog = 0;
        int cat = 0;
        for(Animal an:enterprise.getAnimalDirectory().getAnimalDirectory()){
        if(an.getSpecies().equals("dog")){
            dog++;
        }
        if(an.getSpecies().equals("cat")){
            cat++;
        }
    }
        dataset.setValue(dog, "1", "Dog");
        dataset.setValue(cat, "2", "Cat");
        JFreeChart chart = ChartFactory.createBarChart("Animal Variety", "Animals Species", "Amount", dataset, PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLACK);
        ChartFrame frame = new ChartFrame("Bar Chart for Animals", chart);
        frame.setVisible(true);
        frame.setSize(450,350);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlPhoto;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBreed;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtSpecies;
    // End of variables declaration//GEN-END:variables
}