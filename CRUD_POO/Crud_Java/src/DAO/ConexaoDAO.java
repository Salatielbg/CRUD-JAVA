/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author henri
 */
public class ConexaoDAO {

    public Connection conectaDB() {
        Connection conn = null;
        try {
        
            String url = "jdbc:mysql://localhost:3306/trabalho_crud?user=root&password=1234&useSSL=false";

            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, erro.getMessage());
        } 
        return conn;
    }
}
