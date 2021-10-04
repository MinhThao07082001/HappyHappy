/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Message;

public class MessageDAO extends DBContext {

    public List<Message> getMessageByConservationID(int id) {
        List<Message> mList = new ArrayList<>();
        String sql = "SELECT TOP 1000 [messageID]\n"
                + "      ,[conversationID]\n"
                + "      ,[sender]\n"
                + "      ,[receiver]\n"
                + "      ,[content]\n"
                + "      ,[createTime]\n"
                + "  FROM [SWP391].[dbo].[message] where [conversationID] = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Message ms = new Message(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6));
                mList.add(ms);
            }
            return mList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public int insertMessage(Message m) {
        String sql = "INSERT INTO [message]([conversationID], [sender], [receiver], [content]) values (?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, m.getConversationID());
            ps.setInt(2, m.getSender());
            ps.setInt(3, m.getReceiver());
            ps.setString(4, m.getContent());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static void main(String[] args) {
        MessageDAO md =  new MessageDAO();
        md.insertMessage(new Message(1, 10, 3, 1, "helo",""));
    }
}
