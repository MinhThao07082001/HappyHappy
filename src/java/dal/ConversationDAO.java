package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conversation;
import model.UserCommon;

public class ConversationDAO extends DBContext {

    public Conversation getConversationByUserID(int userID1, int userID2) {
        String sql = "SELECT * FROM [SWP391].[dbo].[conversation]"
                + "  where (userID1 = ? and userID2 = ?) or (userID2 = ? and userID1 = ?)";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setInt(1, userID1);
            st.setInt(2, userID2);
            st.setInt(3, userID1);
            st.setInt(4, userID2);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Conversation(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public Conversation getConversationByID(int ID) {
        String sql = "SELECT * FROM [SWP391].[dbo].[conversation]"
                + "  where [conversationID] = ?";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setInt(1, ID);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Conversation(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public int createConversation(int userID1, int userID2) {
        String sql = "INSERT INTO conversation(userID1, userID2) values (?,?)";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setInt(1, userID1);
            st.setInt(2, userID2);
            return st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public List<UserCommon> getListConversation(int userID) {
        List<UserCommon> uList = new ArrayList<>();
        String sql = "SELECT TOP 1000\n"
                + "      [userID1]\n"
                + "      ,[userID2]\n"
                + "  FROM [SWP391].[dbo].[conversation] where userID1 = ? or userID2 = ?";
        UserDAO ud = new UserDAO();
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setInt(1, userID);
            st.setInt(2, userID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1)==userID?rs.getInt(2):rs.getInt(1);
                UserCommon u = ud.getAccountByID(Integer.toString(id));
                uList.add(u);
            }
            return uList;

        } catch (SQLException e) {

            System.out.println(e);
        }
        return null;

    }

    public static void main(String[] args) {
        ConversationDAO cd = new ConversationDAO();
//        cd.createConversation(1, 3);
        System.out.println(cd.getListConversation(2).size());
    }
}
