/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Rating;
/**
 *
 * @author WacMac
 */
public class RateAndCommentDAO extends DBContext {
    public int insertRateMentor(Rating rate){
        String sql="insert into rating(rateAmount,rateDescription,menteeID,mentorID) values (?,?,?,?)"; 
        try{
            PreparedStatement st = connection.prepareStatement(sql);      
            st.setInt(1, rate.getRateAmount());
            st.setString(2, rate.getRateDescription());        
            st.setInt(3, rate.getMenteeID());
            st.setInt(4, rate.getMentorID());
            return st.executeUpdate();        
        }catch(SQLException e){
            System.out.println(e);
        }
        return 0;
    } 
    
    public boolean CheckLearned(int id, int id2){
        String sql= "select count(*) from course c inner join requestsCourse rc on c.courseID =rc.courseID inner join request r on rc.requestID=r.requestID where r.userID=? and c.mentorID=?";
        try{
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, id);
        st.setInt(2, id2);
        ResultSet rs = st.executeQuery();       
           if (rs.next()) {
               return rs.getInt(1)>0;
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
            return false;  
    }
    
    public boolean checkRated(int id, int id2){
        String sql = "select count(*) from Rating where menteeID=? and mentorID=?";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.setInt(2, id2);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                return rs.getInt(1)>0;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return false;
    }
    
    
    public float getRatebyMentorID(int ID) {
        String sql="select  Format(AVG(cast(rateAmount as float)),'N1') from rating where mentorID=?";
        try{
             PreparedStatement st = connection.prepareStatement(sql);      
            st.setInt(1, ID);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                return  rs.getFloat(1);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    return 0;
}
    
    public int updateRate(Rating rate){
        String sql = "UPDATE Rating set rateAmount = ?,rateDescription = ?  where mentorID = ? and menteeID = ?";
    try{
        PreparedStatement st = connection.prepareStatement(sql);
        st.setInt(1, rate.getRateAmount());
        st.setString(2, rate.getRateDescription());
        st.setInt(3, rate.getMentorID());
        st.setInt(4, rate.getMenteeID());
        return st.executeUpdate();
    }catch(SQLException e){
        System.out.println(e);
    }
    return 0;
}   
    public static void main(String[] args) {
        RateAndCommentDAO rate = new RateAndCommentDAO();
        rate.insertRateMentor(new Rating(2, "Allahu",2,4));
    }
}
