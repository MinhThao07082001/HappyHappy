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

    public int insertRequest(Request req) {
        String sql = "INSERT INTO request(userID, subjectID, moneyPerSlot, timePerSlot, startTime, endTime, description, learnType) values\n"
                + "                (?,?,?,?,?,?,?,?)\n";
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
            int x = ps.executeUpdate();
            sql = "SELECT @@Identity";
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public int updateStatusRequest(int requestID, int status) {
        String sql = "UPDATE request set status = ? where requestID = ? ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, status);
            ps.setInt(2, requestID);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public int insertRequestSlot(RequestSlotTime rst) {
        String sql = "INSERT INTO requestSlotTime values\n"
                + "                (?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, rst.getRequestID());
            ps.setString(2, rst.getSlotFrom());
            ps.setString(3, rst.getSlotTo());
            ps.setInt(4, rst.getDay());
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public int insertWishRequest(int mteeReq, int mtorReq) {
        String sql = "INSERT INTO wishRequest values (?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, mteeReq);
            ps.setInt(2, mtorReq);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public void insertRequestSlot(List<RequestSlotTime> rstList) {
        rstList.forEach((rst) -> {
            insertRequestSlot(rst);
        });
    }

    public List<Request> getListRequest(String sql) {
        List<Request> list = new ArrayList<>();
        SubjectDAO sd = new SubjectDAO();

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Request req = new Request(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getInt(9), rs.getInt(10), rs.getString(11));
                req.setSubject(sd.getSubject(req.getSubjectID()));
                req.setListSlotTime(getListRequestSlotTime(req.getRequestID()));
                list.add(req);
            }
            return list;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    public List<Request> getListMenteeReqByMentorReq(int mentorReqID){
        String sql = "select [requestID]\n" +
"      ,[userID]\n" +
"      ,[subjectID]\n" +
"      ,[moneyPerSlot]\n" +
"      ,[timePerSlot]\n" +
"      ,[startTime]\n" +
"      ,[endTime]\n" +
"      ,[description]\n" +
"      ,[status]\n" +
"      ,[learnType]\n" +
"      ,[reqTime] from wishRequest w inner join request r on w.requestMenteeID = r.requestID where w.requestMentorID = "+mentorReqID;
        return getListRequest(sql);
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
                + "  inner join userCommon u on r.userID = u.userID where u.role = 1 and  (r.status < 1 or r.status is null)";
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
                + "  inner join userCommon u on r.userID = u.userID where u.role = 2 and (r.status < 1 or r.status is null)";
        return getListRequest(sql);
    }

    public List<Request> getListRequestOfMe(int userID) {
        String sql = "SELECT TOP 1000 [requestID]\n"
                + "      ,[userID]\n"
                + "      ,[subjectID]\n"
                + "      ,[moneyPerSlot]\n"
                + "      ,[timePerSlot]\n"
                + "      ,[startTime]\n"
                + "      ,[endTime]\n"
                + "      ,[description]\n"
                + "      ,[status]\n"
                + "      ,[learnType]\n"
                + "      ,[reqTime]\n"
                + "  FROM [SWP391].[dbo].[request]\n"
                + "  where userID = " + userID;
        List<Request> rList = getListRequest(sql);
        return rList;

    }

    public Request getRequestById(int id) {
        String sql = "SELECT TOP 1000 [requestID]\n"
                + "      ,[userID]\n"
                + "      ,[subjectID]\n"
                + "      ,[moneyPerSlot]\n"
                + "      ,[timePerSlot]\n"
                + "      ,[startTime]\n"
                + "      ,[endTime]\n"
                + "      ,[description]\n"
                + "      ,[status]\n"
                + "      ,[learnType]\n"
                + "      ,[reqTime]\n"
                + "  FROM [SWP391].[dbo].[request]\n"
                + "  where requestID = " + id;
        List<Request> rList = getListRequest(sql);
        return rList.get(0);

    }

    public List<RequestSlotTime> getListRequestSlotTime(int id) {
        List<RequestSlotTime> rstList = new ArrayList<>();
        String sql = "SELECT TOP 1000 [requestID]\n"
                + "      ,[slotFrom]\n"
                + "      ,[slotTo]\n"
                + "      ,[day]\n"
                + "  FROM [SWP391].[dbo].[requestSlotTime]\n"
                + "  where requestID = ? order by day asc";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RequestSlotTime rst = new RequestSlotTime(rs.getInt(1), rs.getInt(4), rs.getString(2), rs.getString(3));
                rstList.add(rst);
            }
            return rstList;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public void updateRequest(Request req, List<RequestSlotTime> rstList) {
        String sql = "UPDATE request\n"
                + "SET [subjectID] = ?,\n"
                + "[moneyPerSlot] = ?,\n"
                + "[timePerSlot] = ?,\n"
                + "[startTime] = ?,\n"
                + "[endTime] = ?,\n"
                + "[description] = ?,\n"
                + "[learnType] = ?\n"
                + "where [requestID] = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, req.getSubjectID());
            ps.setInt(2, req.getMoneyPerSlot());
            ps.setInt(3, req.getTimePerSlot());
            ps.setString(4, req.getStartTime());
            ps.setString(5, req.getEndTime());
            ps.setString(6, req.getDescription());
            ps.setInt(7, req.getLearnType());
            ps.setInt(8, req.getRequestID());
            int x = ps.executeUpdate();
            for (RequestSlotTime rst : rstList) {
                int y = updateRequestSlotTime(rst);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public int updateRequestSlotTime(RequestSlotTime rst) {
        String sql = "UPDATE requestSlotTime "
                + "SET slotFrom = ? , "
                + "slotTo = ? "
                + "where requestID = ? and day = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, rst.getSlotFrom());
            ps.setString(2, rst.getSlotTo());
            ps.setInt(3, rst.getRequestID());
            ps.setInt(4, rst.getDay());
            return ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public static void main(String[] args) {

//        Request req = new Request(1, 1, 1, 11000, 112, "2023/11/19", "2022/11/19", "Uoa", 1, 1, "");
        
        RequestDAO re = new RequestDAO();
        List<Request> l = re.getListRequestOfMe(2);
//        l = re.getListRequestOfMentee();
//        for (Request request : l) {
//            System.out.println(request.getListSlotTime().get(0).getSlotFrom());
//        }
//        System.out.println(re.getRequestById(13).getSubject());
//System.out.println(re.getListMenteeReqByMentorReq(17).get(0).getUserID());
        List<RequestSlotTime> reqList = re.getListRequestSlotTime(18);
        for (RequestSlotTime requestSlotTime : reqList) {
            System.out.println(requestSlotTime.getDay());
        }
    }
}
