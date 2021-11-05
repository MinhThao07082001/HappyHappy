package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Mentee;
import model.UserCommon;

public class MenteeDAO extends DBContext {

    public int updateMentee(Mentee mentee) {
        String sql = "  UPDATE userCommon set "
                + "      [name] = ?,"
                + "      [dob] = ?,"
                + "      [address] = ?,"
                + "      [phone] = ?,"
                + "      [imgAvt] = ?,"
                + "      [description] = ?"
                + "      where userID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, mentee.getName());
            ps.setString(2, mentee.getDob());
            ps.setString(3, mentee.getAddress());
            ps.setString(4, mentee.getPhone());
            ps.setString(5, mentee.getImg());
            ps.setString(6, mentee.getDescription());
            ps.setInt(7, mentee.getMenteeID());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public int createMentee(UserCommon u) {
        String sql = "insert into mentee (userID) select userID from userCommon where email = ?";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setString(1, u.getEmail());
            return st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public Mentee getMenteeByEmail(String email) {
        String sql = "SELECT TOP 1000 u.[userID]\n"
                + "      ,[name]\n"
                + "      ,[password]\n"
                + "      ,[email]\n"
                + "      ,[dob]\n"
                + "      ,[sex]\n"
                + "      ,[address]\n"
                + "      ,[phone]\n"
                + "      ,[imgAvt]\n"
                + "      ,[description]\n"
                + "      ,[status]\n"
                + "      ,[moneyLeft]\n"
                + "      ,[createTime]\n"
                + "      ,[role]\n"
                + "     FROM [SWP391].[dbo].[userCommon] u inner join mentee m on u.userID = m.userID "
                + "     where email = ?";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setString(1, email);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Mentee m = new Mentee(
                        rs.getInt("userID"),
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
                        rs.getString("createTime"));
                return m;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
      public Mentee getMenteeById(int id) {
        String sql = "SELECT TOP 1000 u.[userID]\n"
                + "      ,[name]\n"
                + "      ,[password]\n"
                + "      ,[email]\n"
                + "      ,[dob]\n"
                + "      ,[sex]\n"
                + "      ,[address]\n"
                + "      ,[phone]\n"
                + "      ,[imgAvt]\n"
                + "      ,[description]\n"
                + "      ,[status]\n"
                + "      ,[moneyLeft]\n"
                + "      ,[createTime]\n"
                + "      ,[role]\n"
                + "     FROM [SWP391].[dbo].[userCommon] u inner join mentee m on u.userID = m.userID "
                + "     where m.userID = ?";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Mentee m = new Mentee(
                        rs.getInt("userID"),
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
                        rs.getString("createTime"));
                return m;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
      public List<Mentee> getListMentee() {
          List<Mentee> mList = new ArrayList<>();
        String sql = "SELECT TOP 1000 u.[userID]\n"
                + "      ,[name]\n"
                + "      ,[password]\n"
                + "      ,[email]\n"
                + "      ,[dob]\n"
                + "      ,[sex]\n"
                + "      ,[address]\n"
                + "      ,[phone]\n"
                + "      ,[imgAvt]\n"
                + "      ,[description]\n"
                + "      ,[status]\n"
                + "      ,[moneyLeft]\n"
                + "      ,[createTime]\n"
                + "      ,[role]\n"
                + "     FROM [SWP391].[dbo].[userCommon] u inner join mentee m on u.userID = m.userID ";
        try {
            PreparedStatement st = connection.prepareCall(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Mentee m = new Mentee(
                        rs.getInt("userID"),
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
                        rs.getString("createTime"));
                mList.add(m);
            }
            return mList;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
 //Test
    public static void main(String[] args) {
        Mentee m = new Mentee(1, "Name", "Name", "Name", "2019-10-10", 1, "Adderess", "0102391293", "", "Des", "No", 999, "2918-12-12");
        MenteeDAO md = new MenteeDAO();
        System.out.println(md.getListMentee().size());
        System.out.println(md.getMenteeById(12));;
       
    }

}
