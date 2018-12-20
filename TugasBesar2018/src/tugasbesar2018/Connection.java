/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar2018;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author HP
 */
public class Connection {
    com.mysql.jdbc.Connection conn;
    Statement st;
    ResultSet rs; 
public void setConnection(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","root");
            st=conn.createStatement();
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null,"<Error> Koneksikan Xampp Terlebih Dahulu : "+e,"Koneksi Gagal",JOptionPane.WARNING_MESSAGE);
            }
    }
}