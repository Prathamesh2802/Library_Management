/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Library_mgmt;

import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Prathamesh
 */
public class Student_Login extends javax.swing.JFrame {

    
    /**
     * Creates new form Student_Dashboard
     */
    public Student_Login() {
        initComponents();
        show.setEnabled(false);
        show.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JButton();
        closebtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        Stud_label = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        Admin_login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        hidden = new javax.swing.JLabel();
        show = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login_16.png"))); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        closebtn.setForeground(new java.awt.Color(102, 255, 255));
        closebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closebtn.setText("X");
        closebtn.setToolTipText("");
        closebtn.setOpaque(true);
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pass_16.png"))); // NOI18N
        jLabel1.setText("Password:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/username_16.png"))); // NOI18N
        jLabel2.setText("Username:");

        uname.setToolTipText("");
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });

        Stud_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Stud_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_book_32.png"))); // NOI18N
        Stud_label.setText("Student Login");

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        Admin_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Admin_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/admin_16.png"))); // NOI18N
        Admin_login.setText("Admin Login");
        Admin_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_loginActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_user_male_16.png"))); // NOI18N

        hidden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_blind_16.png"))); // NOI18N
        hidden.setAlignmentY(0.0F);
        hidden.setIconTextGap(0);
        hidden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hiddenMouseClicked(evt);
            }
        });

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_eye_16.png"))); // NOI18N
        show.setAlignmentY(0.0F);
        show.setEnabled(false);
        show.setFocusable(false);
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Stud_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uname)
                            .addComponent(pass)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Admin_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addGap(106, 106, 106)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show)
                    .addComponent(hidden))
                .addGap(104, 104, 104))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Stud_label, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uname)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hidden)
                            .addComponent(show))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(Admin_login)
                .addGap(84, 84, 84))
        );

        setSize(new java.awt.Dimension(644, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String Uname = uname.getText();
        String Pass = new String(pass.getPassword());
        try
        {
            DB_Connection con = new DB_Connection();
            String sql = "select * from student where email=? and password=?";
            PreparedStatement st = con.c.prepareStatement(sql);
            st.setString(1, Uname);
            st.setString(2, Pass);
            ResultSet rs = st.executeQuery();
            if(rs.next())
            {
               JOptionPane.showMessageDialog(null, "Login Successful", "Login Success", JOptionPane.DEFAULT_OPTION);
               new Student_Dashboard().setVisible(true);
               setVisible(false);

            }
            else
            {
             JOptionPane.showMessageDialog(null, "Login Failed", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }

           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
//        String Pass = new String(pass.getPassword());
//        if(uname.getText().equals("abc") && Pass.equals("abc"))
//        {
//           JOptionPane.showMessageDialog(null, "Login Successful", "Login Success", JOptionPane.DEFAULT_OPTION);
//              Student_Dashboard dashboard = new Student_Dashboard();  
//              
//            //make page visible to the user  
//            dashboard.setVisible(true);  
//        }
//        else
//        {
//           JOptionPane.showMessageDialog(null, "Login Failed", "Login Failed", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_loginActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void Admin_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_loginActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Admin_Login().setVisible(true);
    }//GEN-LAST:event_Admin_loginActionPerformed

    private void hiddenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hiddenMouseClicked
        // TODO add your handling code here:
        pass.setEchoChar((char)0);
        hidden.setVisible(false);
        hidden.setEnabled(false);
        show.setVisible(true);
        show.setEnabled(true);
    }//GEN-LAST:event_hiddenMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        // TODO add your handling code here:
        pass.setEchoChar((char)8226);
        hidden.setVisible(true);
        hidden.setEnabled(true);
        show.setVisible(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closebtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
      
        FlatDarkLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Student_Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin_login;
    private javax.swing.JLabel Stud_label;
    private javax.swing.JLabel closebtn;
    private javax.swing.JLabel hidden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel show;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables

}
