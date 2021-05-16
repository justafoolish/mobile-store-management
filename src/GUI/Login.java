/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

/**
 *
 * @author Gyn
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        LogTitle = new javax.swing.JPanel();
        LoginTitle = new javax.swing.JLabel();
        LogContent = new javax.swing.JPanel();
        lbLogPassword = new javax.swing.JLabel();
        lbLogLogin = new javax.swing.JLabel();
        tfLogUser = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        cbShowPassword = new javax.swing.JCheckBox();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Phone Management");
        setBackground(new java.awt.Color(139, 232, 220));
        setName("LoginForm"); // NOI18N
        setResizable(false);

        LogTitle.setBackground(new java.awt.Color(139, 232, 220));
        LogTitle.setForeground(new java.awt.Color(139, 232, 220));
        LogTitle.setPreferredSize(new java.awt.Dimension(300, 73));

        LoginTitle.setFont(new java.awt.Font("Markazi Text SemiBold", 1, 45)); // NOI18N
        LoginTitle.setForeground(new java.awt.Color(255, 255, 255));
        LoginTitle.setText("Đăng Nhập");

        javax.swing.GroupLayout LogTitleLayout = new javax.swing.GroupLayout(LogTitle);
        LogTitle.setLayout(LogTitleLayout);
        LogTitleLayout.setHorizontalGroup(
            LogTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginTitle)
                .addGap(60, 60, 60))
        );
        LogTitleLayout.setVerticalGroup(
            LogTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginTitle)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        LogContent.setBackground(new java.awt.Color(192, 241, 236));

        lbLogPassword.setFont(new java.awt.Font("Markazi Text Bold", 1, 20)); // NOI18N
        lbLogPassword.setForeground(new java.awt.Color(0, 0, 0));
        lbLogPassword.setText("Mật khẩu :");
        lbLogPassword.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        lbLogLogin.setFont(new java.awt.Font("Markazi Text Bold", 1, 20)); // NOI18N
        lbLogLogin.setForeground(new java.awt.Color(0, 0, 0));
        lbLogLogin.setText("Tài khoản : ");
        lbLogLogin.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        tfLogUser.setBackground(new java.awt.Color(255, 255, 255));
        tfLogUser.setFont(new java.awt.Font("Exo 2 Light", 0, 12)); // NOI18N
        tfLogUser.setForeground(new java.awt.Color(0, 0, 0));
        tfLogUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLogUserActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(16, 158, 139));
        btnLogin.setFont(new java.awt.Font("Exo 2 ExtraBold", 0, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Đăng nhập");
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        cbShowPassword.setBackground(new java.awt.Color(192, 241, 236));
        cbShowPassword.setFont(new java.awt.Font("Exo 2 Light", 1, 12)); // NOI18N
        cbShowPassword.setForeground(new java.awt.Color(0, 0, 0));
        cbShowPassword.setText("Hiện mật khẩu");
        cbShowPassword.setFocusPainted(false);
        cbShowPassword.setFocusable(false);
        cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPasswordActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Markazi Text Bold", 0, 12)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout LogContentLayout = new javax.swing.GroupLayout(LogContent);
        LogContent.setLayout(LogContentLayout);
        LogContentLayout.setHorizontalGroup(
            LogContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogContentLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(LogContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbShowPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LogContentLayout.createSequentialGroup()
                        .addGroup(LogContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLogPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLogLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LogContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfLogUser, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jPasswordField1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogContentLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        LogContentLayout.setVerticalGroup(
            LogContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogContentLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(LogContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbLogLogin)
                    .addGroup(LogContentLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(tfLogUser)))
                .addGap(18, 18, 18)
                .addGroup(LogContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField1)
                    .addComponent(lbLogPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbShowPassword)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LogContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(LogTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(LogContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfLogUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLogUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLogUserActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        Menu menuFrame = new Menu();
        menuFrame.setVisible(true);
        menuFrame.pack();
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbShowPasswordActionPerformed

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
           UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch (Exception e) {
            System.out.println(e);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login loginFrame = new Login();
                loginFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogContent;
    private javax.swing.JPanel LogTitle;
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lbLogLogin;
    private javax.swing.JLabel lbLogPassword;
    private javax.swing.JTextField tfLogUser;
    // End of variables declaration//GEN-END:variables
}
