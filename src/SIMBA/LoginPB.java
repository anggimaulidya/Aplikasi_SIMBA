/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMBA;

import javax.swing.JOptionPane;

/**
 *
 * @author WIN 11
 */
public class LoginPB extends javax.swing.JFrame {

    /**
     * Creates new form LoginDanDaftar_1
     */
    public LoginPB() {
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

        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtnKodeID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BtnPassword = new javax.swing.JPasswordField();
        BtnMasuk = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        jLabel3.setText("Welcome!");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back 50.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setPreferredSize(new java.awt.Dimension(1346, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pink and White Watercolor Illustration Pattern Desktop Wallpaper (1) (1) (1) (1) (1) (1) (1) (1).png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Swis721 Blk BT", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Petugas Bangsal");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo SIMBA fixx (2).png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Swis721 BT", 1, 18)); // NOI18N
        jLabel7.setText("Kode ID");

        BtnKodeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKodeIDActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Swis721 BT", 1, 18)); // NOI18N
        jLabel9.setText("Password");

        BtnPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPasswordActionPerformed(evt);
            }
        });

        BtnMasuk.setBackground(new java.awt.Color(0, 102, 102));
        BtnMasuk.setFont(new java.awt.Font("Swis721 BT", 1, 18)); // NOI18N
        BtnMasuk.setForeground(new java.awt.Color(255, 255, 255));
        BtnMasuk.setText("Masuk");
        BtnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMasukActionPerformed(evt);
            }
        });

        BtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back 50.png"))); // NOI18N
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnHapus.setBackground(new java.awt.Color(255, 255, 255));
        BtnHapus.setFont(new java.awt.Font("Swis721 BT", 1, 18)); // NOI18N
        BtnHapus.setForeground(new java.awt.Color(204, 0, 0));
        BtnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete 20.png"))); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(BtnKodeID, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .addComponent(BtnPassword))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 105, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(109, 109, 109))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(BtnMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(218, 218, 218))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnBack)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnBack)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnKodeID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(1936, 1119));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPasswordActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BtnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMasukActionPerformed
    if (BtnKodeID.getText().equals("")) {
    JOptionPane.showMessageDialog(null, "Harap isi kode petugas dengan benar!");
    BtnKodeID.requestFocus();
} else if (BtnPassword.getText().equals("")) {
    JOptionPane.showMessageDialog(null, "Harap isi password dengan benar!");
    BtnPassword.requestFocus();
} else if (
    (BtnKodeID.getText().equals("P-2024-00001") && BtnPassword.getText().equals("password1")) ||
    (BtnKodeID.getText().equals("P-2024-00002") && BtnPassword.getText().equals("password2")) ||
    (BtnKodeID.getText().equals("P-2024-00003") && BtnPassword.getText().equals("password3")) ||
    (BtnKodeID.getText().equals("P-2024-00004") && BtnPassword.getText().equals("password4")) ||
    (BtnKodeID.getText().equals("P-2024-00005") && BtnPassword.getText().equals("password5")) ||
    (BtnKodeID.getText().equals("P-2024-00006") && BtnPassword.getText().equals("password6")) ||
    (BtnKodeID.getText().equals("P-2024-00007") && BtnPassword.getText().equals("password7")) ||
    (BtnKodeID.getText().equals("P-2024-00008") && BtnPassword.getText().equals("password8")) ||
    (BtnKodeID.getText().equals("P-2024-00009") && BtnPassword.getText().equals("password9")) ||
    (BtnKodeID.getText().equals("P-2024-00010") && BtnPassword.getText().equals("password10"))
) {
    new BerandaPB().show();
    this.dispose();
} else {
    JOptionPane.showMessageDialog(null, "Username atau password tidak sesuai");
}

    }//GEN-LAST:event_BtnMasukActionPerformed

    private void BtnKodeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKodeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnKodeIDActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        
    Object[] options = {"Ya", "Tidak"};
    int response = JOptionPane.showOptionDialog(
        this,
        "Yakin Data Akan Dihapus?", 
        "Konfirmasi Hapus", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[0]
    );

    // Jika pengguna memilih "Ya"
    if (response == JOptionPane.YES_OPTION) {
        // Mengosongkan field ID Petugas dan Password
        BtnKodeID.setText("");
        BtnPassword.setText("");

        // Fokuskan kembali ke field ID Petugas (opsional)
        BtnKodeID.requestFocus();
    }
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        LoginDanDaftar LoginDanDaftar = new LoginDanDaftar();
        LoginDanDaftar.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_BtnBackActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JTextField BtnKodeID;
    private javax.swing.JButton BtnMasuk;
    private javax.swing.JPasswordField BtnPassword;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
