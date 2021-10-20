/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Subject;

/**
 *
 * @author Admin
 */
public class SubjectDAO extends DBContext {

    public List<Subject> getAll() {
        List<Subject> list = new ArrayList<>();
        String sql = "select * from subject";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Subject s = new Subject();
                s.setSubjectID(rs.getInt("subjectID"));
                s.setSubjectName(rs.getString("subjectname"));
                s.setLevel(rs.getString("level"));
                s.setStatus(rs.getString("status"));
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public Subject getSubject(int id) {
        String sql = "select * from subject where subjectID = " + id;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Subject s = new Subject();
                s.setSubjectID(rs.getInt("subjectID"));
                s.setSubjectName(rs.getString("subjectname"));
                s.setLevel(rs.getString("level"));
                s.setStatus(rs.getString("status"));
                return s;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public Subject getSubject(String name, String level) {
        String sql = "select * from subject where subjectName = ? and level = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, level);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Subject s = new Subject();
                s.setSubjectID(rs.getInt("subjectID"));
                s.setSubjectName(rs.getString("subjectname"));
                s.setLevel(rs.getString("level"));
                s.setStatus(rs.getString("status"));
                return s;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public List<String> getListSubjectName() {
        String sql = "SELECT distinct TOP 1000\n"
                + "      [subjectName]\n"
                + "  FROM [SWP391].[dbo].[subject] ";
        List<String> subList = new ArrayList<>();
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                subList.add(rs.getString(1));
            }
            return subList;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

}
