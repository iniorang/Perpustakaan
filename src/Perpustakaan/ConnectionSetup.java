/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionSetup {
    Connection setup;
    public static Connection setup(){
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection setup = DriverManager.getConnection("jdbc:mysql://localhost/perpus","root","");
            return setup;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
