/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Food;

/**
 *
 * @author luuhuy
 */
public class FoodDAO extends DAO{

    public FoodDAO() {
        super();
    }
    
    public ArrayList<Food> getFood() {
        ArrayList<Food> arr = new ArrayList<>();
        String sql = "SELECT * FROM dbo.tblFood";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Food f = new Food();
                f.setId(rs.getInt(1));
                f.setName(rs.getString(2));
                f.setPrice(rs.getInt(3));
                f.setType(rs.getString(4));
                arr.add(f);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return arr;
    }
    
     public ArrayList<Food> searchFood(String key) {
        ArrayList<Food> arr = new ArrayList<>();
        String sql = "SELECT * FROM dbo.tblFood WHERE name LIKE ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + key + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Food f = new Food();
                f.setId(rs.getInt(1));
                f.setName(rs.getString(2));
                f.setPrice(rs.getInt(3));
                f.setType(rs.getString(4));
                arr.add(f);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return arr;
    }
     
     public void saveFood(int numberTable, int[] idFood, int [] amount){
         String sql = "INSERT INTO dbo.tblOrderFood(amount, tblFoodid, tblBookedTableid) VALUES(?, ?, ?)";
         String sql1 = "SELECT dbo.tblBookTableInfo.tblBookedTableid FROM dbo.tblTable, dbo.tblBookTableInfo "
                 + "WHERE dbo.tblTable.numberTable = ? AND dbo.tblTable.id = dbo.tblBookTableInfo.tblTableid";
        try {
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setInt(1, numberTable);
            ResultSet rs = ps1.executeQuery();
            int idBookTableInfo=0;
            while(rs.next()){
                idBookTableInfo = rs.getInt(1);
            }
            for(int i=0; i< idFood.length; i++){
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, amount[i]);
                ps.setInt(2, idFood[i]);
                ps.setInt(3, idBookTableInfo);
                ps.executeUpdate();
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
         
     }
}
