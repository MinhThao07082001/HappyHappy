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
import model.Request;

/**
 *
 * @author WacMac
 */
public class RateAndCommentDAO extends DBContext {
    public int RateMentor(Rating rate){
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
 
    
    public static void main(String[] args) {
        RateAndCommentDAO rate = new RateAndCommentDAO();       
        System.out.println(rate.CheckLearned(3,2));
    }
}
