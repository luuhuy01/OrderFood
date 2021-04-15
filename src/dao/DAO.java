/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;

/**
 *
 * @author luuhuy
 */
public class DAO {
    public static Connection con= null;

    public DAO() {        
        try{
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=ManageRestaurant";
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = (Connection) DriverManager.getConnection(url,user,pass);
        }catch(Exception ex){
            System.out.println("Disconected ");
        }
    }

}
