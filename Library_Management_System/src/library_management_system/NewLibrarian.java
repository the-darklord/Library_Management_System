/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_management_system;

import Project.Encryption;
import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author SAIMIHIRNATH
 */
public class NewLibrarian extends javax.swing.JFrame {

    /**
     * Creates new form NewLibrarian
     */
    public NewLibrarian() {
        initComponents();
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
        LibrarianRegistrationDetails = new javax.swing.JLabel();
        LibrarianID = new javax.swing.JLabel();
        LibrarianIDValue = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        MobileNumber = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        NameValue = new javax.swing.JTextField();
        MobileNumberValue = new javax.swing.JTextField();
        AddressValue = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        Passwordvalue = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LibrarianRegistrationDetails.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        LibrarianRegistrationDetails.setForeground(new java.awt.Color(255, 255, 255));
        LibrarianRegistrationDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LibrarianRegistrationDetails.setText("LIBRARIAN REGISTRATION DETAILS");
        getContentPane().add(LibrarianRegistrationDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 28, 493, 42));

        LibrarianID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LibrarianID.setForeground(new java.awt.Color(255, 255, 255));
        LibrarianID.setText("Librarian ID");
        getContentPane().add(LibrarianID, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 96, 139, -1));

        LibrarianIDValue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LibrarianIDValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibrarianIDValueActionPerformed(evt);
            }
        });
        getContentPane().add(LibrarianIDValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 93, 308, -1));

        Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Name");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 150, 139, -1));

        Gender.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setText("Gender");
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 200, 139, -1));

        MobileNumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MobileNumber.setForeground(new java.awt.Color(255, 255, 255));
        MobileNumber.setText("Mobile Number");
        getContentPane().add(MobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 247, 139, -1));

        Address.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 255, 255));
        Address.setText("Address");
        getContentPane().add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 295, 139, -1));

        Password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 346, 139, -1));

        NameValue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(NameValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 147, 308, -1));

        MobileNumberValue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(MobileNumberValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 308, -1));

        AddressValue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(AddressValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 308, -1));

        Save.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/save-icon--1.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 411, 131, 40));

        Close.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/red-x-mark-transparent-background-3.png"))); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 411, 121, 40));

        buttonGroup1.add(Male);
        Male.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Male.setForeground(new java.awt.Color(255, 255, 255));
        Male.setText("Male");
        getContentPane().add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 121, -1));

        buttonGroup1.add(Female);
        Female.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Female.setForeground(new java.awt.Color(255, 255, 255));
        Female.setText("Female");
        getContentPane().add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 121, -1));

        Passwordvalue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(Passwordvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 308, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/libreg.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LibrarianIDValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibrarianIDValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LibrarianIDValueActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        String librarianid=LibrarianIDValue.getText();
        String name=NameValue.getText();
        String mobilenumber=MobileNumberValue.getText();
        String address=AddressValue.getText();
        String password=Passwordvalue.getText();
        String gender="-";
        if(Male.isSelected())
        {
            gender="M";
        }
        else if(Female.isSelected())
        {
            gender="F";
        }
        try
        {
            Connection con=ConnectionProvider.getCon();
            PreparedStatement st=con.prepareStatement("INSERT INTO LIBRARIAN VALUES(?,?,?,?,?)");
            st.setString(1,librarianid);
            st.setString(2,name);
            st.setString(3,gender);
            st.setString(4,mobilenumber);
            st.setString(5,address);
            int i=st.executeUpdate();
            PreparedStatement pt=con.prepareStatement("INSERT INTO LIBRARIAN_CREDENTIALS VALUES(?,?,?)");
            pt.setString(1, librarianid);
            String salt=Encryption.genRandString(5);
            String hash=Encryption.encrypt(password, salt);
            pt.setString(2,hash);
            pt.setString(3, salt);
            int j=pt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Updated.");
            setVisible(false);
            new NewLibrarian().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_SaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewLibrarian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JTextField AddressValue;
    private javax.swing.JButton Close;
    private javax.swing.JRadioButton Female;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel LibrarianID;
    private javax.swing.JTextField LibrarianIDValue;
    private javax.swing.JLabel LibrarianRegistrationDetails;
    private javax.swing.JRadioButton Male;
    private javax.swing.JLabel MobileNumber;
    private javax.swing.JTextField MobileNumberValue;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameValue;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField Passwordvalue;
    private javax.swing.JButton Save;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
