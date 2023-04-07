package library_management_system;


import library_management_system.admin_home;
import javax.swing.*;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author SAIMIHIRNATH
 */
public class admin_login extends javax.swing.JFrame {

    /**
     * Creates new form 
     * login
     */
    public admin_login() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Username = new javax.swing.JLabel();
        UsernameValue = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        PasswordValue = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("USERNAME");
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 110, 40));

        UsernameValue.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        UsernameValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameValueActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 232, 34));

        Password.setBackground(new java.awt.Color(0, 0, 0));
        Password.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("PASSWORD");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 110, 40));

        PasswordValue.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        getContentPane().add(PasswordValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 460, 232, 34));

        Login.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        Login.setText("LOGIN");
        Login.setPreferredSize(new java.awt.Dimension(81, 31));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, -1, 34));

        Close.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        Close.setText("CLOSE");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 530, -1, 34));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library_management_system/loginbg.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameValueActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_UsernameValueActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        if(UsernameValue.getText().equals("admin")&&PasswordValue.getText().equals("admin"))
        {
            setVisible(false);
            new admin_home().setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_CloseActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton Login;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordValue;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField UsernameValue;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
