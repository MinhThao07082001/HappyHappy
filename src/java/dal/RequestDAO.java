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
import model.Request;
import model.RequestSlotTime;

/**
 *
 * @author Admin
 */
public class RequestDAO extends DBContext {

    public int insertRequest(Request req, List<RequestSlotTime> listReq) {
        String sql = "INSERT INTO request(userID, subjectID, moneyPerSlot, timePerSlot, startTime, endTime, description, learnType) values"
                + "(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, req.getUserID());
            ps.setInt(2, req.getSubjectID());
            ps.setInt(3, req.getMoneyPerSlot());
            ps.setInt(4, req.getTimePerSlot());
            ps.setString(5, req.getStartTime());
            ps.setString(6, req.getEndTime());
            ps.setString(7, req.getDescription());
            ps.setInt(8, req.getLearnType());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public List<Request> getListRequest(String sql) {
        List<Request> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Request req = new Request(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getInt(9), rs.getInt(10), rs.getString(11));
                list.add(req);
            }
            return list;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Request> getListRequestOfMentee() {
        String sql = "SELECT TOP 100 [requestID]\n"
                + "      ,r.[userID]\n"
                + "      ,[subjectID]\n"
                + "      ,[moneyPerSlot]\n"
                + "      ,[timePerSlot]\n"
                + "      ,[startTime]\n"
                + "      ,[endTime]\n"
                + "      ,r.[description]\n"
                + "      ,r.[status]\n"
                + "      ,[learnType]\n"
                + "      ,[reqTime]\n"
                + "	  ,u.[role]\n"
                + "  FROM [SWP391].[dbo].[request] r\n"
                + "  inner join userCommon u on r.userID = u.userID where u.role = 1";
        return getListRequest(sql);
    }

    public List<Request> getListRequestOfMentor() {
        String sql = "SELECT TOP 100 [requestID]\n"
                + "      ,r.[userID]\n"
                + "      ,[subjectID]\n"
                + "      ,[moneyPerSlot]\n"
                + "      ,[timePerSlot]\n"
                + "      ,[startTime]\n"
                + "      ,[endTime]\n"
                + "      ,r.[description]\n"
                + "      ,r.[status]\n"
                + "      ,[learnType]\n"
                + "      ,[reqTime]\n"
                + "	  ,u.[role]\n"
                + "  FROM [SWP391].[dbo].[request] r\n"
                + "  inner join userCommon u on r.userID = u.userID where u.role = 2";
        return getListRequest(sql);
    }
//
//    public static void main(String[] args) {
//
//        Request req = new Request(1, 1, 1, 11000, 112, "2023/11/19", "2022/11/19", "Uoa", 1, 1, "");
//        
//        RequestDAO re = new RequestDAO();
//        re.insertRequest(req, null);
//        List<Request> l = new ArrayList<>();
//        l = re.getListRequestOfMentee();
//        for (Request request : l) {
//            System.out.println(request.getStartTime());
//        }
//    }
}
