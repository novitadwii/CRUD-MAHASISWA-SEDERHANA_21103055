/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudmahasiswasederhana.db;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 * Novita Dwi
 * 21103055
 * SI05C
 */

public class ConnectionHelper {
    public static Connection connect;
    public static Statement st;
    public static ResultSet rs;
    
    public static Connection getConnection(){
        String db = "sisteminformasi";
        String url = "jdbc:mysql://localhost:3306/sisteminformasi";
        String username = "root";
        String pass = "";
        if(connect==null){
            try{
                System.out.println("Membuat koneksi...");
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect=DriverManager.getConnection(url, username, pass);
                st = (Statement) connect.createStatement();
                JOptionPane.showMessageDialog(null,"Terkoneksi");
                System.out.println("Koneksi berhasil.");
            }catch(ClassNotFoundException | SQLException e){
                JOptionPane.showMessageDialog(null,"Tidak Terkoneksi");
                System.out.println("Koneksi berhasil.");
            }
        }
        return connect;
    }
    public static void main(String[] args) {
        ConnectionHelper.getConnection();
    }
}
    
