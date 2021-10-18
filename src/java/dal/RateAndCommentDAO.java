/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Rating;

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
    
    public int CheckLearned(){
        String sql= "select * from";
        return 0;
    }
    
    
    
    
    
    public static void main(String[] args) {
        RateAndCommentDAO rate = new RateAndCommentDAO();
        rate.RateMentor(new Rating(2, "Allahu",2,4));
    }
}
