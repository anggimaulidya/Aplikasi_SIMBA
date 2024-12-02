/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMBA;

/**
 *
 * @author WIN 11
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class BuatAkun extends javax.swing.JFrame {

    /**
     * Creates new form LoginDanDaftar_1
     */
    public Statement st;
    public ResultSet rs;
    Connection cn = Koneksi.KoneksiDatabase.BukaKoneksi();
    public BuatAkun() {
        initComponents();
    }
    
    private void Bersih(){
        txtNamaLengkap.setText("");
        txtKodeID.setText("");
        txtJabatan.setText("");
        txtEmail.setText("");
        txtTelepon.setText("");
        txtPassword.setText("");
        
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNamaLengkap = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BtnHapus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtKodeID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtJabatan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTelepon = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        BtnBuatAkun = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        jLabel3.setText("Welcome!");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1346, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1096, 753));

        jLabel4.setFont(new java.awt.Font("Swis721 Blk BT", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Buat Akun");

        jLabel7.setFont(new java.awt.Font("Swis721 BT", 1, 18)); // NOI18N
        jLabel7.setText("Nama Lengkap");

        jLabel9.setFont(new java.awt.Font("Swis721 BT", 1, 18)); // NOI18N
        jLabel9.setText("Kode ID");

        BtnHapus.setBackground(new java.awt.Color(0, 102, 102));
        BtnHapus.setFont(new java.awt.Font("Swis721 BT", 1, 18)); // NOI18N
        BtnHapus.setForeground(new java.awt.Color(255, 255, 255));
        BtnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete 20.png"))); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Profil 400.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Swis721 BT", 1, 18)); // NOI18N
        jLabel10.setText("Jabatan");

        jLabel11.setFont(new java.awt.Font("Swis721 BT", 1, 18)); // NOI18N
        jLabel11.setText("Alamat E-Mail");

        jLabel12.setFont(new java.awt.Font("Swis721 BT", 1, 18)); // NOI18N
        jLabel12.setText("Telepon");

        jLabel13.setFont(new java.awt.Font("Swis721 BT", 1, 18)); // NOI18N
        jLabel13.setText("Password");

        BtnBuatAkun.setBackground(new java.awt.Color(0, 102, 102));
        BtnBuatAkun.setFont(new java.awt.Font("Swis721 BT", 1, 18)); // NOI18N
        BtnBuatAkun.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuatAkun.setText("Buat Akun");
        BtnBuatAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuatAkunActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Swis721 BT", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit 20.png"))); // NOI18N
        jButton3.setText("Ubah foto profil");

        BtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back 50.png"))); // NOI18N
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKodeID, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPassword)
                                .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(363, 363, 363)
                                .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(BtnBuatAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(321, 321, 321)
                        .addComponent(jLabel4)))
                .addGap(97, 97, 97))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnBack)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBuatAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKodeID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1267, 1267, 1267)
                .addComponent(jLabel1)
                .addContainerGap(653, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1936, 1119));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        LoginDanDaftar LoginDanDaftar = new LoginDanDaftar();
        LoginDanDaftar.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnBuatAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuatAkunActionPerformed
        // TODO add your handling code here:
        try {
    st = cn.createStatement();
    if (txtNamaLengkap.getText().equals("") ||
        txtKodeID.getText().equals("") ||
        txtJabatan.getText().equals("") ||
        txtEmail.getText().equals("") ||
        txtTelepon.getText().equals("") ||
        txtPassword.getText().equals("")) {
        
        JOptionPane.showMessageDialog(null, "Data tidak boleh kosong", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
    
    // Aksi simpan data
    if (BtnBuatAkun.getText().equals("Buat Akun")) {
        String cek = "SELECT * FROM daftar_petugas WHERE `Kode_ID` = '" + txtKodeID.getText() + "'";
        rs = st.executeQuery(cek);
        
        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "Ups...Kode ID ini sudah terdaftar");
        } else {
            String sql = "INSERT INTO daftar_petugas VALUES ('" + txtKodeID.getText() +
                         "', '" + txtNamaLengkap.getText() +
                         "', '" + txtJabatan.getText() +
                         "', '" + txtEmail.getText() +
                         "', '" + txtTelepon.getText() +
                         "', '" + txtPassword.getText() + "')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        }
    } else {
        // Aksi ubah data
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
    e.printStackTrace();
}
        
    }//GEN-LAST:event_BtnBuatAkunActionPerformed

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
        txtNamaLengkap.setText("");
        txtKodeID.setText("");
        txtJabatan.setText("");
        txtEmail.setText("");
        txtTelepon.setText("");
        txtPassword.setText("");
        

        // Fokuskan kembali ke field ID Petugas (opsional)
        txtNamaLengkap.requestFocus();
    }
    }//GEN-LAST:event_BtnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(BuatAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuatAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuatAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuatAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuatAkun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnBuatAkun;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtJabatan;
    private javax.swing.JTextField txtKodeID;
    private javax.swing.JTextField txtNamaLengkap;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables
}