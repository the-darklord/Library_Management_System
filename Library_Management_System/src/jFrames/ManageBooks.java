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
public class ManageBooks extends javax.swing.JFrame {

    /**
     * Creates new form ManageStudents
     */
    public ManageBooks() {
        initComponents();
        setBookDetailsToTable();
    }
    public void setBookDetailsToTable(){
        DefaultTableModel model;
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from book order by bookid");
            
            BookTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
     public void clearTable(){
          DefaultTableModel model = (DefaultTableModel)BookTable.getModel();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        BookTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        StudentID = new javax.swing.JLabel();
        BookIDValue = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        NameValue = new javax.swing.JTextField();
        Publisher = new javax.swing.JLabel();
        PublisherValue = new javax.swing.JTextField();
        Price = new javax.swing.JLabel();
        PriceValue = new javax.swing.JTextField();
        PublishedYear = new javax.swing.JLabel();
        PublishedYearValue = new javax.swing.JTextField();
        Capacity = new javax.swing.JLabel();
        CapacityValue = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        Author = new javax.swing.JLabel();
        AuthorValue = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BookTable.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        BookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKID", "NAME", "AUTHOR", "PUBLISHER", "PRICE", "PUBLISHEDYEAR", "CAPACITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BookTable.setColumnSelectionAllowed(true);
        BookTable.setShowGrid(true);
        BookTable.getTableHeader().setReorderingAllowed(false);
        BookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BookTable);
        BookTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (BookTable.getColumnModel().getColumnCount() > 0) {
            BookTable.getColumnModel().getColumn(0).setResizable(false);
            BookTable.getColumnModel().getColumn(1).setResizable(false);
            BookTable.getColumnModel().getColumn(2).setResizable(false);
            BookTable.getColumnModel().getColumn(3).setResizable(false);
            BookTable.getColumnModel().getColumn(4).setResizable(false);
            BookTable.getColumnModel().getColumn(5).setResizable(false);
            BookTable.getColumnModel().getColumn(6).setResizable(false);
        }
        BookTable.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 960, 690));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 65)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE BOOKS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 960, -1));

        StudentID.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        StudentID.setText("Book ID");
        getContentPane().add(StudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        BookIDValue.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        getContentPane().add(BookIDValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 336, -1));

        Name.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Name.setText("Name");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        NameValue.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        NameValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameValueActionPerformed(evt);
            }
        });
        getContentPane().add(NameValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 336, -1));

        Publisher.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Publisher.setText("Publisher");
        getContentPane().add(Publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        PublisherValue.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        getContentPane().add(PublisherValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 336, -1));

        Price.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Price.setText("Price");
        getContentPane().add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        PriceValue.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        getContentPane().add(PriceValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 336, -1));

        PublishedYear.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        PublishedYear.setText("Published Year");
        getContentPane().add(PublishedYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        PublishedYearValue.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        getContentPane().add(PublishedYearValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 336, -1));

        Capacity.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Capacity.setText("Capacity");
        getContentPane().add(Capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        CapacityValue.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        getContentPane().add(CapacityValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, 336, -1));

        Add.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 138, -1));

        Update.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 670, -1, -1));

        Delete.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 670, 145, -1));

        Close.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        Close.setText("CLOSE");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 730, 530, 54));

        Author.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Author.setText("Author");
        Author.setPreferredSize(new java.awt.Dimension(118, 33));
        getContentPane().add(Author, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 258, 128, -1));

        AuthorValue.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        getContentPane().add(AuthorValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 330, 33));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/light-color-pink-and-blue-background-8zrww1yggwb8mbh3.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameValueActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        String bookid=BookIDValue.getText();
        String name=NameValue.getText();
        String author=AuthorValue.getText();
        String publisher=PublisherValue.getText();
        String price=PriceValue.getText();
        String publishedyear=PublishedYearValue.getText();
        String capacity=CapacityValue.getText();
        try
        {
            Connection con=ConnectionProvider.getCon();
            PreparedStatement st=con.prepareStatement("INSERT INTO BOOK VALUES(?,?,?,?,?,?,?)");
            st.setString(1,bookid);
            st.setString(2,name);
            st.setString(3,author);
            st.setString(4,publisher);
            st.setString(5,price);
            st.setString(6,publishedyear);
            st.setString(7,capacity);
            int i=st.executeUpdate(); 
            JOptionPane.showMessageDialog(null,"Successfully Added.");
            clearTable();
            setBookDetailsToTable();
            setVisible(false);
            new ManageBooks().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_AddActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        String bookid=BookIDValue.getText();
        String name=NameValue.getText();
        String author=AuthorValue.getText();
        String publisher=PublisherValue.getText();
        String price=PriceValue.getText();
        String publishedyear=PublishedYearValue.getText();
        String capacity=CapacityValue.getText();
        try
        {
            Connection con=ConnectionProvider.getCon();
            PreparedStatement st=con.prepareStatement("UPDATE BOOK SET NAME=?,AUTHOR=?,PUBLISHER=?,PRICE=?,PUBLISHEDYEAR=?,CAPACITY=? WHERE BOOKID=?");
            st.setString(1,name);
            st.setString(2,author);
            st.setString(3,publisher);
            st.setString(4,price);
            st.setString(5,publishedyear);
            st.setString(6,capacity);
            st.setString(7,bookid);
            int i=st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Updated.");
            clearTable();
            setBookDetailsToTable();
            setVisible(false);
            new ManageBooks().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        String bookid=BookIDValue.getText();
        try
        {
            Connection con=ConnectionProvider.getCon();
            PreparedStatement st=con.prepareStatement("DELETE FROM BOOK WHERE BOOKID=?");
            st.setString(1,bookid);
            int i=st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Successfully Deleted.");
            clearTable();
            setBookDetailsToTable();
            setVisible(false);
            new ManageBooks().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void BookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookTableMouseClicked
        // TODO add your handling code here:
        int rowNo =BookTable.getSelectedRow();
        TableModel model = BookTable.getModel();
        
        BookIDValue.setText(model.getValueAt(rowNo, 0).toString());
        NameValue.setText(model.getValueAt(rowNo, 1).toString());
        AuthorValue.setText(model.getValueAt(rowNo,2).toString());
        PublisherValue.setText(model.getValueAt(rowNo, 3).toString());
        PriceValue.setText(model.getValueAt(rowNo, 4).toString());
        PublishedYearValue.setText(model.getValueAt(rowNo, 5).toString());
        CapacityValue.setText(model.getValueAt(rowNo, 6).toString());
    }//GEN-LAST:event_BookTableMouseClicked

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
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Author;
    private javax.swing.JTextField AuthorValue;
    private javax.swing.JTextField BookIDValue;
    private javax.swing.JTable BookTable;
    private javax.swing.JLabel Capacity;
    private javax.swing.JTextField CapacityValue;
    private javax.swing.JButton Close;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameValue;
    private javax.swing.JLabel Price;
    private javax.swing.JTextField PriceValue;
    private javax.swing.JLabel PublishedYear;
    private javax.swing.JTextField PublishedYearValue;
    private javax.swing.JLabel Publisher;
    private javax.swing.JTextField PublisherValue;
    private javax.swing.JLabel StudentID;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}