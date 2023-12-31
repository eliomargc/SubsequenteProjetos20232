/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author eliom
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login2
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
        java.awt.GridBagConstraints gridBagConstraints;

        painelBackground = new javax.swing.JPanel();
        painelCentral = new javax.swing.JPanel();
        painelAreaLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkLogado = new javax.swing.JCheckBox();
        labelEsqueceuSenha = new javax.swing.JLabel();
        botaoLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoFacebook = new javax.swing.JButton();
        botaoTwitter = new javax.swing.JButton();
        botaoGoogle = new javax.swing.JButton();
        panelUserName = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        labelUser = new javax.swing.JLabel();
        painelPassword = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        labelPassword = new javax.swing.JLabel();
        labelImagemBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        painelBackground.setBackground(new java.awt.Color(0, 153, 255));
        painelBackground.setLayout(new java.awt.GridBagLayout());

        painelCentral.setOpaque(false);
        painelCentral.setLayout(null);

        painelAreaLogin.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(0, 51, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Login");

        jLabel2.setBackground(new java.awt.Color(0, 51, 204));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Faça login para continuar");

        checkLogado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        checkLogado.setForeground(new java.awt.Color(0, 0, 153));
        checkLogado.setText("Manter Logado");
        checkLogado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelEsqueceuSenha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelEsqueceuSenha.setForeground(new java.awt.Color(0, 0, 153));
        labelEsqueceuSenha.setText("Esqueceu a senha?");
        labelEsqueceuSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botaoLogin.setBackground(new java.awt.Color(0, 102, 255));
        botaoLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoLogin.setForeground(new java.awt.Color(255, 255, 255));
        botaoLogin.setText("LOGIN");
        botaoLogin.setBorder(null);
        botaoLogin.setBorderPainted(false);
        botaoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setBackground(new java.awt.Color(0, 51, 204));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Ou");

        jLabel5.setBackground(new java.awt.Color(0, 51, 204));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Login com");

        botaoFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/facebook_32.png"))); // NOI18N
        botaoFacebook.setBorderPainted(false);
        botaoFacebook.setContentAreaFilled(false);
        botaoFacebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botaoTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/twitter_32.png"))); // NOI18N
        botaoTwitter.setBorderPainted(false);
        botaoTwitter.setContentAreaFilled(false);
        botaoTwitter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botaoGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/google_32.png"))); // NOI18N
        botaoGoogle.setBorderPainted(false);
        botaoGoogle.setContentAreaFilled(false);
        botaoGoogle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        panelUserName.setBackground(new java.awt.Color(255, 255, 255));
        panelUserName.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 51, 204));
        txtUser.setBorder(null);
        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUser.setMargin(new java.awt.Insets(2, 50, 2, 2));
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
        });

        labelUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/user_login_32.png"))); // NOI18N

        javax.swing.GroupLayout panelUserNameLayout = new javax.swing.GroupLayout(panelUserName);
        panelUserName.setLayout(panelUserNameLayout);
        panelUserNameLayout.setHorizontalGroup(
            panelUserNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUserNameLayout.createSequentialGroup()
                .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelUserNameLayout.setVerticalGroup(
            panelUserNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUserNameLayout.createSequentialGroup()
                .addGroup(panelUserNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUser)
                    .addComponent(labelUser, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        painelPassword.setBackground(new java.awt.Color(255, 255, 255));
        painelPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 51, 204));
        txtPassword.setBorder(null);
        txtPassword.setMargin(new java.awt.Insets(2, 50, 2, 2));

        labelPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/lock_32.png"))); // NOI18N

        javax.swing.GroupLayout painelPasswordLayout = new javax.swing.GroupLayout(painelPassword);
        painelPassword.setLayout(painelPasswordLayout);
        painelPasswordLayout.setHorizontalGroup(
            painelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPasswordLayout.createSequentialGroup()
                .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelPasswordLayout.setVerticalGroup(
            painelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPasswordLayout.createSequentialGroup()
                .addGroup(painelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelAreaLoginLayout = new javax.swing.GroupLayout(painelAreaLogin);
        painelAreaLogin.setLayout(painelAreaLoginLayout);
        painelAreaLoginLayout.setHorizontalGroup(
            painelAreaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAreaLoginLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(painelAreaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelAreaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botaoLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAreaLoginLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(182, 182, 182))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAreaLoginLayout.createSequentialGroup()
                            .addComponent(botaoFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addGroup(painelAreaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painelAreaLoginLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(botaoTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(botaoGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAreaLoginLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(157, 157, 157)))))
                    .addGroup(painelAreaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(painelAreaLoginLayout.createSequentialGroup()
                            .addComponent(checkLogado)
                            .addGap(159, 159, 159)
                            .addComponent(labelEsqueceuSenha))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        painelAreaLoginLayout.setVerticalGroup(
            painelAreaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAreaLoginLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(panelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(painelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAreaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEsqueceuSenha)
                    .addComponent(checkLogado))
                .addGap(27, 27, 27)
                .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelAreaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelAreaLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelAreaLoginLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(painelAreaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelAreaLoginLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(13, 13, 13)
                                .addComponent(botaoTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botaoFacebook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );

        painelCentral.add(painelAreaLogin);
        painelAreaLogin.setBounds(470, 0, 470, 530);

        labelImagemBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagemBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/welcome.png"))); // NOI18N
        painelCentral.add(labelImagemBack);
        labelImagemBack.setBounds(0, 0, 945, 533);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 945;
        gridBagConstraints.ipady = 533;
        painelBackground.add(painelCentral, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 1535, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
        //jTextField2.setText("");
    }//GEN-LAST:event_txtUserMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFacebook;
    private javax.swing.JButton botaoGoogle;
    private javax.swing.JButton botaoLogin;
    private javax.swing.JButton botaoTwitter;
    private javax.swing.JCheckBox checkLogado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelEsqueceuSenha;
    private javax.swing.JLabel labelImagemBack;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPanel painelAreaLogin;
    private javax.swing.JPanel painelBackground;
    private javax.swing.JPanel painelCentral;
    private javax.swing.JPanel painelPassword;
    private javax.swing.JPanel panelUserName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
