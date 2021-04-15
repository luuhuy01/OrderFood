/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Table;
import java.sql.*;

/**
 *
 * @author luuhuy
 */
public class TableDAO extends DAO{

    public TableDAO() {
        super();
    }
    
    public ArrayList<Table> getTable(){
        String sql = "SELECT dbo.tblTable.id,dbo.tblTable.numberTable, dbo.tblTable.type, dbo.tblTable.description"
                + "  FROM dbo.tblTable, dbo.tblBookedTable, dbo.tblBookTableInfo "
                + "WHERE status = 'YES' AND dbo.tblBookedTable.id = tblBookedTableid AND tblTableid = dbo.tblTable.id";
        ArrayList<Table> result= new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Table tb = new Table();
                tb.setId(rs.getInt(1));
                tb.setNumberTable(rs.getInt(2));
                tb.setType(rs.getString(3));
                tb.setDes(rs.getString(4));
                result.add(tb);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return result;
    }
}
