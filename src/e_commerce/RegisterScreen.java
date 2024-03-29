/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e_commerce;

import com.mysql.cj.util.StringUtils;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Nihal gupta
 */
public class RegisterScreen extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;

    /**
     * Creates new form RegisterScreen
     */
    public RegisterScreen() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        et_pass = new javax.swing.JPasswordField();
        et_name = new javax.swing.JTextField();
        et_email = new javax.swing.JTextField();
        et_phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        et_username = new javax.swing.JTextField();
        et_lname = new javax.swing.JTextField();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Username");

        jLabel8.setText("Don't have an Account?");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("click here");
        jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/register.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 121, 250, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Register Yourself");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 13, 300, 47));

        jLabel10.setText("Have an Account?");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setText("click here");
        jLabel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Register");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 190, 40));

        jLabel12.setText("+91");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, 38));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 240, 40));
        jPanel1.add(et_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 240, 40));

        et_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        et_name.setToolTipText("");
        jPanel1.add(et_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 241, -1));

        et_email.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        et_email.setToolTipText("");
        jPanel1.add(et_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 241, -1));

        et_phone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        et_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                et_phoneActionPerformed(evt);
            }
        });
        et_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                et_phoneKeyReleased(evt);
            }
        });
        jPanel1.add(et_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 210, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Confirm Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("email id");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Phone number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Username");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Last Name");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        et_username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        et_username.setToolTipText("");
        jPanel1.add(et_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 241, -1));

        et_lname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        et_lname.setToolTipText("");
        jPanel1.add(et_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 241, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        LoginScreen login = new LoginScreen();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if (!et_name.getText().isEmpty() && !et_phone.getText().isEmpty() && !et_email.getText().isEmpty() && !et_pass.getText().isEmpty() && !jPasswordField1.getText().isEmpty()) {
            EmailValidator emailValidator = new EmailValidator();
            if (!emailValidator.validate(et_email.getText().trim())) {
                JOptionPane.showMessageDialog(this, "Invalid Email!!");
            } else {
                if (et_pass.getText().equalsIgnoreCase(jPasswordField1.getText())) {
                    if (et_phone.getText().length() == 10) {
                        try {  //jdbc:mysql://localhost:3306/cakemarket?user=root&password=Jayshree123
                            //jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5467923","sql5467923","i72hfcDGCJ
                            long pnumber = Long.parseLong(et_phone.getText());
                            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5467923","sql5467923","i72hfcDGCJ");
                            ps = con.prepareStatement("insert into customer(pno,username,fname,lname,emailid,cpassword) values(?,?,?,?,?,?)");
                            ps.setLong(1, pnumber);
                            ps.setString(2, et_username.getText());
                            ps.setString(3, et_lname.getText());
                            ps.setString(4, et_name.getText());
                            ps.setString(5, et_email.getText());
                            ps.setString(6, et_pass.getText());
                            ps.executeUpdate();

                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(this, "Username Exists", "Error", JOptionPane.INFORMATION_MESSAGE);
                            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
                            return;
                        }
                        JOptionPane.showMessageDialog(this, "Registered Successfully!!", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                        LoginScreen login = new LoginScreen();
                        login.setVisible(true);
                        login.setLocationRelativeTo(null);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Phone Number Not Valid!!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Password Not Same!!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fill All Details");
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void et_phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_et_phoneKeyReleased
        // TODO add your handling code here:
        long x;
        String textnow = et_phone.getText();
        try {
            textnow = textnow.substring(0, textnow.length() - 1);
            x = Long.parseLong(et_phone.getText());
        } catch (NumberFormatException nfe) {
            et_phone.setText(textnow);
        }
    }//GEN-LAST:event_et_phoneKeyReleased

    private void et_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_et_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_et_phoneActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField et_email;
    private javax.swing.JTextField et_lname;
    private javax.swing.JTextField et_name;
    private javax.swing.JPasswordField et_pass;
    private javax.swing.JTextField et_phone;
    private javax.swing.JTextField et_username;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
