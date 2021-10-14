package dal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Conversation;
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
    public static void main(String[] args) {
        ConversationDAO cd  =  new ConversationDAO();
//        cd.createConversation(1, 3);
        System.out.println(cd.getConversationByID(2).getUserID1());
    }
}
