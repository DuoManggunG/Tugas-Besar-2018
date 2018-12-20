/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar2018;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class koneksi {

    public static PreparedStatement prepareStatement(String insert) {
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Connection conn;
    public Statement stm;
    
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servis", "root","");
            stm = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal "+e.getMessage());
        }
    }
}