package Koneksi;

import SIMBA.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class KoneksiDatabase {
    public static Connection BukaKoneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Versi terbaru MySQL driver
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/aplikasi_simba", "root", "");
            return cn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi database gagal: " + e.getMessage());
            return null;
        }
    }
}
