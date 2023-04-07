/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library_management_system;

/**
 *
 * @author SAIMIHIRNATH
 */
public class admin_home extends javax.swing.JFrame {

    /**
     * Creates new form admin_home
     */
    public admin_home() {
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

        NewStudent = new javax.swing.JButton();
        NewLibrarian = new javax.swing.JButton();
        NewBook = new javax.swing.JButton();
        Statistics = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewStudent.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        NewStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/newstudent.jpg"))); // NOI18N
        NewStudent.setText("New Student");
        NewStudent.setMaximumSize(new java.awt.Dimension(200, 75));
        NewStudent.setMinimumSize(new java.awt.Dimension(200, 75));
        NewStudent.setPreferredSize(new java.awt.Dimension(200, 75));
        NewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewStudentActionPerformed(evt);
            }
        });
        getContentPane().add(NewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 105, 230, 110));

        NewLibrarian.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        NewLibrarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/newlibrarian.png"))); // NOI18N
        NewLibrarian.setText("New Librarian");
        NewLibrarian.setMaximumSize(new java.awt.Dimension(100, 25));
        NewLibrarian.setMinimumSize(new java.awt.Dimension(100, 25));
        NewLibrarian.setPreferredSize(new java.awt.Dimension(200, 75));
        NewLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewLibrarianActionPerformed(evt);
            }
        });
        getContentPane().add(NewLibrarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 240, 110));

        NewBook.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        NewBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/newbook.png"))); // NOI18N
        NewBook.setText("New Book");
        NewBook.setMaximumSize(new java.awt.Dimension(100, 25));
        NewBook.setMinimumSize(new java.awt.Dimension(100, 25));
        NewBook.setPreferredSize(new java.awt.Dimension(200, 75));
        NewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBookActionPerformed(evt);
            }
        });
        getContentPane().add(NewBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 230, 110));

        Statistics.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        Statistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/statistics.jpg"))); // NOI18N
        Statistics.setText("Statistics");
        Statistics.setMaximumSize(new java.awt.Dimension(100, 25));
        Statistics.setMinimumSize(new java.awt.Dimension(100, 25));
        Statistics.setPreferredSize(new java.awt.Dimension(200, 75));
        Statistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsActionPerformed(evt);
            }
        });
        getContentPane().add(Statistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 240, 110));

        Logout.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/logout.jpg"))); // NOI18N
        Logout.setText("Logout");
        Logout.setMaximumSize(new java.awt.Dimension(100, 25));
        Logout.setMinimumSize(new java.awt.Dimension(100, 25));
        Logout.setPreferredSize(new java.awt.Dimension(200, 75));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 615, 230, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/admin_home.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewStudentActionPerformed
        // TODO add your handling code here:
        new NewStudent().setVisible(true);
    }//GEN-LAST:event_NewStudentActionPerformed

    private void NewLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewLibrarianActionPerformed
        // TODO add your handling code here:
        new NewLibrarian().setVisible(true);
    }//GEN-LAST:event_NewLibrarianActionPerformed

    private void NewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBookActionPerformed
        // TODO add your handling code here:
        new NewBook().setVisible(true);
    }//GEN-LAST:event_NewBookActionPerformed

    private void StatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsActionPerformed
        // TODO add your handling code here:
        new Statistics().setVisible(true);
    }//GEN-LAST:event_StatisticsActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JButton NewBook;
    private javax.swing.JButton NewLibrarian;
    private javax.swing.JButton NewStudent;
    private javax.swing.JButton Statistics;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
