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
import model.Major;
import model.Mentee;
import model.Subject;

/**
 *
 * @author Admin
 */
public class MajorDAO extends DBContext {

    public List<Subject> getListMajorByMentorID(int id) {
        List<Subject> mList = new ArrayList<>();
        String sql = "SELECT TOP 1000 s.[subjectID]\n"
                + "      ,s.subjectName, s.level\n"
                + "  FROM [SWP391].[dbo].[major] m\n"
                + "  inner join [subject] s on m.subjectID = s.subjectID where mentorID = ?";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Subject s = new Subject(rs.getInt(1), rs.getString(2), rs.getString(3));
                mList.add(s);
            }
            return mList;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
