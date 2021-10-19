/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import model.UserCommon;


/**
 *
 * @author Admin
 */
public class UserDAO extends DBContext {
    public UserCommon getAccount(String email, String password){
        String sql="select * from userCommon where email=? and password=?";
        try{
            PreparedStatement st=connection.prepareCall(sql);
            st.setString(1, email);
            st.setString(2, password);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return new UserCommon(rs.getInt("userID"),
                                    rs.getString("name"),
                                    rs.getString("password"),
                                    rs.getString("email"),
                                    rs.getString("dob"),
                                    rs.getInt("sex"),
                                    rs.getString("address"),
                                    rs.getString("phone"),
                                    rs.getString("imgAvt"),
                                    rs.getString("description"),
                                    rs.getString("status"),
                                    rs.getInt("moneyLeft"),
                                    rs.getDate("createTime"),
                                    rs.getInt("role"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;    
    }
    
    public UserCommon getEmail(String email){
        String sql="select * from userCommon where email=?";
        try{
            PreparedStatement st=connection.prepareCall(sql);
            st.setString(1, email);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return new UserCommon(rs.getInt("userID"),
                                    rs.getString("name"),
                                    rs.getString("password"),
                                    rs.getString("email"),
                                    rs.getString("dob"),
                                    rs.getInt("sex"),
                                    rs.getString("address"),
                                    rs.getString("phone"),
                                    rs.getString("imgAvt"),
                                    rs.getString("description"),
                                    rs.getString("status"),
                                    rs.getInt("moneyLeft"),
                                    rs.getDate("createTime"),
                                    rs.getInt("role"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public UserCommon getPhone(String phone){
        String sql="select * from userCommon where phone=?";
        try{
            PreparedStatement st=connection.prepareCall(sql);
            st.setString(1, phone);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                return new UserCommon(rs.getInt("userID"),
                                    rs.getString("name"),
                                    rs.getString("password"),
                                    rs.getString("email"),
                                    rs.getString("dob"),
                                    rs.getInt("sex"),
                                    rs.getString("address"),
                                    rs.getString("phone"),
                                    rs.getString("imgAvt"),
                                    rs.getString("description"),
                                    rs.getString("status"),
                                    rs.getInt("moneyLeft"),
                                    rs.getDate("createTime"),
                                    rs.getInt("role"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    public int create(UserCommon u){
        String sql="insert into userCommon(name,password,email,dob,sex,address,phone,role) values (?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement st=connection.prepareCall(sql);
            st.setNString(1, u.getName());
            st.setString(2, u.getPassword());
            st.setString(3, u.getEmail());
            st.setString(4, u.getDob());
            st.setInt(5, u.getSex());
            st.setString(6, u.getAddress());
            st.setString(7, u.getPhone());
            st.setInt(8, u.getRole());
            return st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    }
    public UserCommon getAccountByID(String userID) {
        String sql = "select * from userCommon where userID = ?";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setString(1, userID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new UserCommon(rs.getInt("userID"),
                                    rs.getString("name"),
                                    rs.getString("password"),
                                    rs.getString("email"),
                                    rs.getString("dob"),
                                    rs.getInt("sex"),
                                    rs.getString("address"),
                                    rs.getString("phone"),
                                    rs.getString("imgAvt"),
                                    rs.getString("description"),
                                    rs.getString("status"),
                                    rs.getInt("moneyLeft"),
                                    rs.getDate("createTime"),
                                    rs.getInt("role"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;   
    }
    public boolean updatePassword(String userID, String newPassword) {
    
        String sql = "UPDATE userCommon\n"
                + "SET password = ?\n"
                + "WHERE email = ?";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setString(1, newPassword);
            st.setString(2, userID);
            st.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
    
    public UserCommon getAccountByEmail(String userEmail) {
        String sql = "select * from userCommon where email = ?";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setString(1, userEmail);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new UserCommon(rs.getInt("userID"),
                        rs.getString("name"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getString("dob"),
                        rs.getInt("sex"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("imgAvt"),
                        rs.getString("description"),
                        rs.getString("status"),
                        rs.getInt("moneyLeft"),
                        rs.getDate("createTime"),
                        rs.getInt("role"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    
        public String randomCaptcha() {
        String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random r = new Random();
        String captcha = "";
        for (int i = 0; i < 5; i++) {
            int index = r.nextInt(s.length());
            captcha = captcha + s.charAt(index);
            s = s.substring(0, index) + s.substring(index + 1);
        }
        return captcha;
    }
}
