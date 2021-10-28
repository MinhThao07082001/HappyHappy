/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import static java.lang.ProcessBuilder.Redirect.to;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.UserCommon;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import model.Major;
import model.Mentor;
import model.Subject;
public class MentorDAO extends DBContext {

    public int updateImageAuthenMentor(int userID, String img1, String img2) {
        String sql = "UPDATE mentor set imgAuthen1 = ?, imgAuthen2 = ? where userID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, img1);
            ps.setString(2, img2);
            ps.setInt(3, userID);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

    public int createMentor(UserCommon u) {
        String sql = "insert into mentor (userID) select userID from userCommon where email = ?";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setString(1, u.getEmail());
            return st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }
    public int createMentorPro(Mentor m) {
        String sql = "insert into mentor (education,yearExperiment,intro) values(?,?,?) where userID=? ;\n" +
                     "insert into major (subjectID) values (?) where mentorID=?;";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            Major mj=new Major();
            st.setString(1, m.getEducation());
            st.setInt(2, m.getYearExperiment());
            st.setString(3, m.getIntro());
            st.setInt(4, m.getMentorID());
            st.setInt(5, mj.getSubjectID());
            st.setInt(6, m.getMentorID());
            return st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }
    public int updateMentor(Mentor m) {
        String sql = "UPDATE userCommon set "
                + "      [name] = ?,"
                + "      [dob] = ?,"
                + "      [address] = ?,"
                + "      [phone] = ?,"
                + "      [imgAvt] = ?,"
                + "      [description] = ?"
                + "      where userID = ?;"; 
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, m.getName());
            st.setString(2, m.getDob());
            st.setString(3, m.getAddress());
            st.setString(4, m.getPhone());
            st.setString(5, m.getImgAvt());
            st.setString(6, m.getDescription());
            st.setInt(7, m.getMentorID());
            return st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return 0;
    }
    public int updateMentorCV(Mentor m) {
        String sql ="UPDATE mentor set "
                + "      [education] = ?, "
                + "      [yearExperiment] = ?, "
                + "      [intro] = ? "
                + "      where userID = ?;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, m.getEducation());
            st.setInt(2, m.getYearExperiment());
            st.setString(3, m.getIntro());
            st.setInt(4, m.getMentorID());
            return st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return 0;
    }
    public int updateMentorAuthen(int id) {
        String sql = "UPDATE mentor set authen = 1 where userID = " +id;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public Mentor getMentorByEmail(String email) {
        String sql = "SELECT * FROM userCommon u inner join mentor m on u.userID = m.userID where u.email = ?";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setString(1, email);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Mentor mentor = new Mentor();
                mentor.setMentorID(rs.getInt(1));
                mentor.setName(rs.getString(2));
                mentor.setPassword(rs.getString(3));
                mentor.setEmail(rs.getString(4));
                mentor.setDob(rs.getString(5));
                mentor.setSex(rs.getInt(6));
                mentor.setAddress(rs.getString(7));
                mentor.setPhone(rs.getString(8));
                mentor.setImgAvt(rs.getString(9));
                mentor.setDescription(rs.getString(10));
                mentor.setStatus(rs.getString(11));
                mentor.setMoneyLeft(rs.getInt(12));
                mentor.setCreateTime(rs.getString(13));
                mentor.setEducation(rs.getString(16));
                mentor.setYearExperiment(rs.getInt(17));
                mentor.setIntro(rs.getString(18));
                mentor.setImgAuthen1(rs.getString(19));
                mentor.setImgAuthen2(rs.getString(20));
                mentor.setAuthen(rs.getInt(21));
                return mentor;

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public Mentor getMentorById(int id) {
        String sql = "SELECT * FROM userCommon u inner join mentor m on u.userID = m.userID where u.userID = ?";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Mentor mentor = new Mentor();
                mentor.setMentorID(rs.getInt(1));
                mentor.setName(rs.getString(2));
                mentor.setPassword(rs.getString(3));
                mentor.setEmail(rs.getString(4));
                mentor.setDob(rs.getString(5));
                mentor.setSex(rs.getInt(6));
                mentor.setAddress(rs.getString(7));
                mentor.setPhone(rs.getString(8));
                mentor.setImgAvt(rs.getString(9));
                mentor.setDescription(rs.getString(10));
                mentor.setStatus(rs.getString(11));
                mentor.setMoneyLeft(rs.getInt(12));
                mentor.setCreateTime(rs.getString(13));
                mentor.setEducation(rs.getString(16));
                mentor.setYearExperiment(rs.getInt(17));
                mentor.setIntro(rs.getString(18));
                mentor.setImgAuthen1(rs.getString(19));
                mentor.setImgAuthen2(rs.getString(20));
                mentor.setAuthen(rs.getInt(21));
                MajorDAO md = new MajorDAO();
                mentor.setListMajor(md.getListMajorByMentorID(id));
                return mentor;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
   public List<Mentor> getListMentor() {
        List<Mentor> mList = new ArrayList<>();
        String sql = "SELECT TOP 10 * FROM userCommon u inner join mentor m on u.userID = m.userID";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Mentor mentor = new Mentor();
                mentor.setMentorID(rs.getInt(1));
                mentor.setName(rs.getString(2));
                mentor.setPassword(rs.getString(3));
                mentor.setEmail(rs.getString(4));
                mentor.setDob(rs.getString(5));
                mentor.setSex(rs.getInt(6));
                mentor.setAddress(rs.getString(7));
                mentor.setPhone(rs.getString(8));
                mentor.setImgAvt(rs.getString(9));
                mentor.setDescription(rs.getString(10));
                mentor.setStatus(rs.getString(11));
                mentor.setMoneyLeft(rs.getInt(12));
                mentor.setCreateTime(rs.getString(13));
                mentor.setEducation(rs.getString(16));
                mentor.setYearExperiment(rs.getInt(17));
                mentor.setIntro(rs.getString(18));
                mentor.setImgAuthen1(rs.getString(19));
                mentor.setImgAuthen2(rs.getString(20));
                mentor.setAuthen(rs.getInt(21));
                MajorDAO md = new MajorDAO();
                List<Subject> sList = md.getListMajorByMentorID(mentor.getMentorID());
                mentor.setListMajor(sList);
                mList.add(mentor);
            }
            return mList;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    
       public HashMap<Mentor,Float> getListMentorTopRate() {
        HashMap<Mentor,Float> mList = new HashMap<>();
        String sql = "SELECT TOP 10 Format(AVG(cast(rateAmount as float)),'N1') as [avg],mentorID from Rating group by mentorID order by [avg] desc";
        MentorDAO md = new MentorDAO();
        try {
            PreparedStatement st = connection.prepareCall(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                mList.put(md.getMentorById(rs.getInt(2)), rs.getFloat(1));
            }
            return mList;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
        
    public List<Mentor> getListMentorNotAuthen() {
        List<Mentor> mList = new ArrayList<>();
        String sql = "SELECT * FROM userCommon u inner join mentor m on u.userID = m.userID where authen = 0";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Mentor mentor = new Mentor();
                mentor.setMentorID(rs.getInt(1));
                mentor.setName(rs.getString(2));
                mentor.setPassword(rs.getString(3));
                mentor.setEmail(rs.getString(4));
                mentor.setDob(rs.getString(5));
                mentor.setSex(rs.getInt(6));
                mentor.setAddress(rs.getString(7));
                mentor.setPhone(rs.getString(8));
                mentor.setImgAvt(rs.getString(9));
                mentor.setDescription(rs.getString(10));
                mentor.setStatus(rs.getString(11));
                mentor.setMoneyLeft(rs.getInt(12));
                mentor.setCreateTime(rs.getString(13));
                mentor.setEducation(rs.getString(16));
                mentor.setYearExperiment(rs.getInt(17));
                mentor.setIntro(rs.getString(18));
                mentor.setImgAuthen1(rs.getString(19));
                mentor.setImgAuthen2(rs.getString(20));
                mentor.setAuthen(rs.getInt(21));
                MajorDAO md = new MajorDAO();
                List<Subject> sList = md.getListMajorByMentorID(mentor.getMentorID());
                mentor.setListMajor(sList);
                mList.add(mentor);
            }
            return mList;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    public List<Mentor> getMentorByPage(List<Mentor> list,
            int start,int end){
        List<Mentor> t=new ArrayList<>();
        for(int i=start;i<end;i++){
            t.add(list.get(i));
        }
        return t;
    }

    public static void main(String[] args) {
        Mentor m = new Mentor();
        MentorDAO md = new MentorDAO();
        System.out.println(md.updateMentorCV(m));
    }
}
