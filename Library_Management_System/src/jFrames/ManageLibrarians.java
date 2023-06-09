/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrames;

import Project.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SAIMIHIRNATH
 */
public class ManageLibrarians extends javax.swing.JFrame {

    /**
     * Creates new form ManageStudents
     */
    public ManageLibrarians() {
        initComponents();
        setLibrarianDetailsToTable();
    }
    public void setLibrarianDetailsToTable(){
        DefaultTableModel model;
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from librarian order by librarianid");
            
            LibrarianTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
     public void clearTable(){
          DefaultTableModel model = (DefaultTableModel)LibrarianTable.getModel();
          model.setRowCount(0);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        LibrarianTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        LibrarianID = new javax.swing.JLabel();
        LibrarianIDValue = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        NameValue = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        MobileNumber = new javax.swing.JLabel();
        MobileNumberValue = new javax.swing.JTextField();
        Address = new javax.swing.JLabel();
        AddressValue = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        PasswordValue = new javax.swing.JPasswordField();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LibrarianTable.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        LibrarianTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "LIBRARIANID", "NAME", "GENDER", "MOBILENUMBER", "ADDRESS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LibrarianTable.setColumnSelectionAllowed(true);
        LibrarianTable.setShowGrid(true);
        LibrarianTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LibrarianTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LibrarianTable);
        LibrarianTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (LibrarianTable.getColumnModel().getColumnCount() > 0) {
            LibrarianTable.getColumnModel().getColumn(0).setResizable(false);
            LibrarianTable.getColumnModel().getColumn(1).setResizable(false);
            LibrarianTable.getColumnModel().getColumn(2).setResizable(false);
            LibrarianTable.getColumnModel().getColumn(3).setResizable(false);
            LibrarianTable.getColumnModel().getColumn(4).setResizable(false);
        }
        LibrarianTable.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 970, 964));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 65)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE LIBRARIANS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 970, -1));

        LibrarianID.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        LibrarianID.setForeground(new java.awt.Color(255, 255, 255));
        LibrarianID.setText("LibrarianID");
        getContentPane().add(LibrarianID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        LibrarianIDValue.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        getContentPane().add(LibrarianIDValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 336, -1));

        Name.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Name");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        NameValue.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        NameValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameValueActionPerformed(evt);
            }
        });
        getContentPane().add(NameValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 336, -1));

        Gender.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setText("Gender");
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        buttonGroup1.add(Male);
        Male.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Male.setText("Male");
        Male.setOpaque(true);
        getContentPane().add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 123, -1));

        buttonGroup1.add(Female);
        Female.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Female.setText("Female");
        Female.setOpaque(true);
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });
        getContentPane().add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 130, -1));

        MobileNumber.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        MobileNumber.setForeground(new java.awt.Color(255, 255, 255));
        MobileNumber.setText("Mobile Number");
        getContentPane().add(MobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        MobileNumberValue.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        getContentPane().add(MobileNumberValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 336, -1));

        Address.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 255, 255));
        Address.setText("Address");
        getContentPane().add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        AddressValue.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        getContentPane().add(AddressValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 336, -1));

        Password.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        PasswordValue.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        getContentPane().add(PasswordValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 336, -1));

        Add.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 688, 138, -1));

        Update.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 688, -1, -1));

        Delete.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 688, 145, -1));

        Close.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        Close.setText("CLOSE");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 756, 513, 54));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4219053.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameValueActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        String librarianid=LibrarianIDValue.getText();
        String name=NameValue.getText();
        String mobilenumber=MobileNumberValue.getText();
        String address=AddressValue.getText();
        String gender="-";
        if(Male.isSelected())
        {
            gender="M";
        }
        else if(Female.isSelected())
        {
            gender="F";
        }
        String password=PasswordValue.getText();
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
            JOptionPane.showMessageDialog(null,"Successfully Added.");
            clearTable();
            setLibrarianDetailsToTable();
            setVisible(false);
            new ManageLibrarians().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_AddActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        String librarianid=LibrarianIDValue.getText();
        String name=NameValue.getText();
        String mobilenumber=MobileNumberValue.getText();
        String address=AddressValue.getText();
        String gender="-";
        if(Male.isSelected())
        {
            gender="M";
        }
        else if(Female.isSelected())
        {
            gender="F";
        }
        String password=PasswordValue.getText();
        try
        {
            Connection con=ConnectionProvider.getCon();
            PreparedStatement st=con.prepareStatement("UPDATE LIBRARIAN SET NAME=?,GENDER=?,MOBILENUMBER=?,ADDRESS=? WHERE LIBRARIANID=?");
            st.setString(1,name);
            st.setString(2,gender);
            st.setString(3,mobilenumber);
            st.setString(4,address);
            st.setString(5,librarianid);
            int i=st.executeUpdate();
            if(!password.matches(""))
            {
                PreparedStatement pt=con.prepareStatement("UPDATE LIBRARIAN_CREDENTIALS SET PASSWORD=?,SALT=? WHERE LIBRARIANID=?");
                String salt=Encryption.genRandString(5);
                String hash=Encryption.encrypt(password, salt);
                pt.setString(1,hash);
                pt.setString(2, salt);
                pt.setString(3, librarianid);
                int j=pt.executeUpdate();
            }
            JOptionPane.showMessageDialog(null,"Successfully Updated.");
            clearTable();
            setLibrarianDetailsToTable();
            setVisible(false);
            new ManageLibrarians().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        String librarianid=LibrarianIDValue.getText();
        try
        {
            Connection con=ConnectionProvider.getCon();
            PreparedStatement st=con.prepareStatement("DELETE FROM LIBRARIAN WHERE LIBRARIANID=?");
            st.setString(1,librarianid);
            int i=st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Deleted.");
            clearTable();
            setLibrarianDetailsToTable();
            setVisible(false);
            new ManageLibrarians().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void LibrarianTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibrarianTableMouseClicked
        // TODO add your handling code here:
        int rowNo =LibrarianTable.getSelectedRow();
        TableModel model = LibrarianTable.getModel();
        
        LibrarianIDValue.setText(model.getValueAt(rowNo, 0).toString());
        NameValue.setText(model.getValueAt(rowNo, 1).toString());
        if(model.getValueAt(rowNo, 2).toString().matches("M"))
        {
            Male.setSelected(true);
        }
        else
        {
            Female.setSelected(true);
        }
        MobileNumberValue.setText(model.getValueAt(rowNo, 3).toString());
        AddressValue.setText(model.getValueAt(rowNo, 4).toString());
    }//GEN-LAST:event_LibrarianTableMouseClicked

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
            java.util.logging.Logger.getLogger(ManageLibrarians.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageLibrarians.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageLibrarians.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageLibrarians.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageLibrarians().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Address;
    private javax.swing.JTextField AddressValue;
    private javax.swing.JButton Close;
    private javax.swing.JButton Delete;
    private javax.swing.JRadioButton Female;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel LibrarianID;
    private javax.swing.JTextField LibrarianIDValue;
    private javax.swing.JTable LibrarianTable;
    private javax.swing.JRadioButton Male;
    private javax.swing.JLabel MobileNumber;
    private javax.swing.JTextField MobileNumberValue;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameValue;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordValue;
    private javax.swing.JButton Update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
