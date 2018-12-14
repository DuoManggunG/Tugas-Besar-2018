/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar2018;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Connection {
    
    private Connection connection;
    
    public Connection getConnection(){
        return connection;
    }
    
    //untuk koneksi ke database
    public void dbCOnnection(){
        try{
            Class.forName("");//mus
            
            //cek Database
            try{
            String url, user, password;
            url="";//mus
            user="root";
            password="";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi Sukses");
            
            }catch (SQLException se){
                JOptionPane.showMessageDialog(null, "Konksi Gagal!"+ se);
                System.exit(0);
            }catch (ClassNotFoundException cnfe){
                JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!" + cnfe);
                System.exit(0);
            }
        }
        public static void main(String[] kon) {
        new Koneksi().dbConnection();
    }
}
