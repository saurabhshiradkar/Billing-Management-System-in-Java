/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.*;

/**
 *
 * @author saura
 */
public class ConnectionProvider {

    public static Connection getCon() {

        String url = "jdbc:mysql://127.0.0.1:3306/bms";
        String username = "root";
        String password = "Mysql@12345";
        try 
        {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:bms.db");
            return con;
            
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection(url, username, password);
            
        } catch (Exception e) {
            return null;
        }
    }
}
