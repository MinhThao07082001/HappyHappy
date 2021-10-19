/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal.admin;

import dal.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Admin;

/**
 *
 * @author Admin
 */
public class AdminDAO extends DBContext{
        public Admin getAccount(String username, String password){
        String sql="select * from admin where username=? and password=?";
        try{
            PreparedStatement st=connection.prepareCall(sql);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;    
    }
//        public static void main(String[] args) {
//        AdminDAO ad = new AdminDAO();
//            System.out.println(ad.getAccount("test", "test"));
//    }
}
