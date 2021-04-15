/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.User;
import java.sql.*;

/**
 *
 * @author luuhuy
 */
public class UserDAO extends DAO {

    public UserDAO() {
        super();
    }

    public boolean checkLogin(User user) {
        boolean result = false;
        String sql = "SELECT name, position FROM dbo.tblUser WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user.setName(rs.getString("name"));
                user.setPosition(rs.getString("position"));
                result = true;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return result;
    }
}
