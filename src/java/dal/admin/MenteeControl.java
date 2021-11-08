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
import java.util.ArrayList;
import java.util.List;
import model.Mentee;

/**
 *
 * @author user
 */
public class MenteeControl extends DBContext {

    public List<Mentee> getListMentee() {
        List<Mentee> list = new ArrayList();
        String sql = "SELECT TOP 100 * FROM userCommon u inner join mentee m on u.userID = m.userID";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
//            public Mentee(int menteeID, String name, String password, String email, String dob, int sex, String address, String phone, String img, String description, String status, int moneyLeft, String createTime) 
            while (rs.next()) {
                Mentee mentee = new Mentee();
                mentee.setMenteeID(rs.getInt(1));
                mentee.setName(rs.getString(2));
                mentee.setPassword(rs.getString(3));
                mentee.setEmail(rs.getString(4));
                mentee.setDob(rs.getString(5));
                mentee.setSex(rs.getInt(6));
                mentee.setAddress(rs.getString(7));
                mentee.setPhone(rs.getString(8));
                mentee.setImg(rs.getString(9));
                mentee.setDescription(rs.getString(10));
                mentee.setStatus(rs.getString(11));
                mentee.setMoneyLeft(rs.getInt(12));
                mentee.setCreateTime(rs.getString(13));
                list.add(mentee);
            }
            return list;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Mentee> getMeteeBySearch(String searchString) { 
        List<Mentee> list = new ArrayList<>();
        String sql = "select * from userCommon where name like '%" + searchString + "%' and role = 2 "  ;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Mentee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getInt(12),
                        rs.getString(13)));

            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    public static void main(String[] args) {
        MenteeControl mt = new MenteeControl();
        System.out.println(mt.getListMentee().get(0).getMenteeID());
    }
}
