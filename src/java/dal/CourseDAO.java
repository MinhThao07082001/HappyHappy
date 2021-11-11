package dal;

import ShareData.DateParse;
import static ShareData.DateParse.getDayByDate;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import model.Course;
import model.CourseSlot;
import model.Request;
import model.RequestSlotTime;

/**
 *
 * @author Admin
 */
public class CourseDAO extends DBContext {

    public void insertCourse(int mentorRequestID) {
        try {
            RequestDAO rd = new RequestDAO();
            List<Request> reqList = rd.getListMenteeReqByMentorReq(mentorRequestID);
            int mentorID = getMentorIDWishReq(mentorRequestID);
            insertCourse(mentorID, reqList);
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    public int getMentorIDWishReq(int wishReqId) {
        String sql = "select TOP 1 userID from wishRequest w inner join request r on w.requestMentorID = r.requestID where w.requestMentorID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, wishReqId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    private int insertCourse(int mentorID, List<Request> reqListOfCourse) throws ParseException {
        String sql = "INSERT INTO course(subjectID, mentorID, slots, timePerSlot, moneyPerSlot, timeStart, timeEnd, learnType, status, description)  "
                + "values (?,?,?,?,?,?,?,?,?,?)";
        Request rq = reqListOfCourse.get(0);
        Course course = new Course();
        course.setSubjectID(rq.getSubjectID());
        //course.setMenteeID(mentorID);
        course.setSlots(getNumberOfSlot(rq.getStartTime(), rq.getEndTime(), daysOfRequest(rq.getRequestID())));
        course.setTimePerSlot(rq.getTimePerSlot());
        course.setMoneyPerSlot(rq.getMoneyPerSlot());
        course.setTimeStart(rq.getStartTime());
        course.setTimeEnd(rq.getEndTime());
        course.setLearnType(rq.getLearnType());
        course.setStatus(1);
        course.setDescription(rq.getDescription());
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, course.getSubjectID());
            ps.setInt(2, mentorID);
            ps.setInt(3, course.getSlots());
            ps.setInt(4, course.getTimePerSlot());
            ps.setInt(5, course.getMoneyPerSlot());
            ps.setString(6, course.getTimeStart());
            ps.setString(7, course.getTimeEnd());
            ps.setInt(8, course.getLearnType());
            ps.setInt(9, course.getStatus());
            ps.setString(10, course.getDescription());
            System.out.println(mentorID);
            ps.executeUpdate();
            sql = "SELECT @@Identity";
            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int idCourse = 0;
            if (rs.next()) {
                idCourse = rs.getInt(1);
            }
            //insert list request
            for (Request request : reqListOfCourse) {
                insertRequestCourse(idCourse, request.getRequestID(), getRequestCourseType(request.getRequestID()));
            }
            insertSlot(rq.getStartTime(), rq.getEndTime(), rq.getListSlotTime(), idCourse);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public String daysOfRequest(int requestID) {
        String sql = "select [day] from requestSlotTime where slotFrom != '00:00:00' and slotTo != '00:00:00' and requestID = ?";
        String str = "";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, requestID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                str += Integer.toString(rs.getInt(1) == 8 ? 1 : rs.getInt(1));
            }
            return str;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return str;

    }

    public void insertSlot(String from, String to, List<RequestSlotTime> timeList, int courseID) throws SQLException {
        try {
            SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar start = Calendar.getInstance();
            start.setTime(myFormat.parse(from));
            Calendar end = Calendar.getInstance();
            end.setTime(myFormat.parse(to));
            //from to end insert by day
            for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
                int day = getDayByDate(date);
                day = day == 1 ? 8 : day;
                String sql = "INSERT INTO slot(slotTimeFrom, slotTimeTo, courseID) values (?,?,?)";
                PreparedStatement ps = connection.prepareStatement(sql);
                String rawTimeFrom = timeList.get(day - 2).getSlotFrom();
                String rawTimeTo = timeList.get(day - 2).getSlotTo();
                String timeFrom = myFormat.format(date) + " " + rawTimeFrom.substring(0, rawTimeFrom.length() - 4);
                String timeTo = myFormat.format(date) + " " + rawTimeTo.substring(0, rawTimeTo.length() - 4);
                ps.setString(1, timeFrom);
                ps.setString(2, timeTo);
                ps.setInt(3, courseID);
//                System.out.println(timeFrom);
//                System.out.println(timeTo);
                if (!"00:00:00.000".equals(timeFrom.substring(11, timeFrom.length()))) {
                    ps.executeUpdate();
                }
            }
        } catch (ParseException e) {
        }
    }

    public int getNumberOfSlot(String from, String to, String dayArray) throws ParseException {
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar start = Calendar.getInstance();
        start.setTime(myFormat.parse(from));
        Calendar end = Calendar.getInstance();
        end.setTime(myFormat.parse(to));
        int count = 0;
        for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
            int day = getDayByDate(date);
            count += dayArray.contains(Integer.toString(day)) ? 1 : 0;
        }
        return count;
    }

    public int insertRequestCourse(int courseID, int requestID, int type) {
        String sql = "INSERT INTO requestsCourse values (?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, courseID);
            ps.setInt(2, requestID);
            ps.setInt(3, type);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;

    }

    public int getRequestCourseType(int requestID) {
        String sql = "SELECT u.[role] FROM [SWP391].[dbo].[request] r inner join userCommon u on r.userID = u.userID where requestID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, requestID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;

    }

    public List<CourseSlot> getSlotByCourse(int id) {
        List<CourseSlot> sList = new ArrayList<>();
        String sql = "SELECT TOP (1000) [slotID]\n"
                + "      ,[slotTimeFrom]\n"
                + "      ,[slotTimeTo]\n"
                + "      ,[courseID]\n"
                + "      ,[status]\n"
                + "      ,[description]\n"
                + "  FROM [SWP391].[dbo].[slot] where courseID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                sList.add(new CourseSlot(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6)));
}
        } catch (SQLException e) {
            System.out.println(e);
        }

        return sList;

    }

    public List<Course> getCoursesNotDoneByUserID(int id, int role) {
        String sql = "";
        if (role == 2) {
            sql = "SELECT TOP (1000) c.[courseID]\n"
                    + "      ,c.[subjectID]\n"
                    + "      ,[mentorID]\n"
                    + "      ,[slots]\n"
                    + "      ,c.[timePerSlot]\n"
                    + "      ,c.[moneyPerSlot]\n"
                    + "      ,[timeStart]\n"
                    + "      ,[timeEnd]\n"
                    + "      ,c.[learnType]\n"
                    + "      ,c.[status]\n"
                    + "      ,c.[description]\n"
                    + "      ,[createTime]\n"
                    + "  FROM [SWP391].[dbo].[course] c inner join requestsCourse r on c.courseID = r.courseID \n"
                    + "  inner join request req on r.requestID = req.requestID where req.userID = ? and timeEnd > GETDATE() and timeStart < GETDATE()";
        } else {
            sql = "SELECT TOP (1000) [courseID]\n"
                    + "      ,[subjectID]\n"
                    + "      ,[mentorID]\n"
                    + "      ,[slots]\n"
                    + "      ,[timePerSlot]\n"
                    + "      ,[moneyPerSlot]\n"
                    + "      ,[timeStart]\n"
                    + "      ,[timeEnd]\n"
                    + "      ,[learnType]\n"
                    + "      ,[status]\n"
                    + "      ,[description]\n"
                    + "      ,[createTime]\n"
                    + "  FROM [SWP391].[dbo].[course] where mentorID = ? and timeEnd > GETDATE() and timeStart < GETDATE()";
        }

        List<Course> cList = new ArrayList<>();
        MentorDAO md = new MentorDAO();
        SubjectDAO sd = new SubjectDAO();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Course c = new Course();
                c.setCourseID(rs.getInt(1));
                c.setSubjectID(rs.getInt(2));
                c.setMentorID(rs.getInt(3));
                c.setSlots(rs.getInt(4));
                c.setTimePerSlot(rs.getInt(5));
                c.setMoneyPerSlot(rs.getInt(6));
                c.setTimeStart(rs.getString(7));
                c.setTimeEnd(rs.getString(8));
                c.setLearnType(rs.getInt(9));
                c.setStatus(rs.getInt(10));
                c.setDescription(rs.getString(11));
                c.setCreateTime(rs.getString(12));
                c.setMentor(md.getMentorById(c.getMentorID()));
                c.setListCourseSlot(getSlotByCourse(c.getCourseID()));
                c.setSlotDone(getSlotDoneByCourseID(c.getCourseID()));
                c.setSubject(sd.getSubject(c.getSubjectID()));
                cList.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return cList;

    }

    public List<Course> getCoursesDoneByUserID(int id, int role) {
        String sql = "";
        if (role == 2) {
            sql = "SELECT TOP (1000) c.[courseID]\n"
                    + "      ,c.[subjectID]\n"
                    + "      ,[mentorID]\n"
                    + "      ,[slots]\n"
                    + "      ,c.[timePerSlot]\n"
                    + "      ,c.[moneyPerSlot]\n"
                    + "      ,[timeStart]\n"
                    + "      ,[timeEnd]\n"
                    + "      ,c.[learnType]\n"
                    + "      ,c.[status]\n"
                    + "      ,c.[description]\n"
                    + "      ,[createTime]\n"
                    + "  FROM [SWP391].[dbo].[course] c inner join requestsCourse r on c.courseID = r.courseID \n"
                    + "  inner join request req on r.requestID = req.requestID where req.userID = ? and timeEnd < GETDATE()";
        } else {
            sql = "SELECT TOP (1000) [courseID]\n"
                    + "      ,[subjectID]\n"
                    + "      ,[mentorID]\n"
                    + "      ,[slots]\n"
                    + "      ,[timePerSlot]\n"
                    + "      ,[moneyPerSlot]\n"
                    + "      ,[timeStart]\n"
                    + "      ,[timeEnd]\n"
                    + "      ,[learnType]\n"
                    + "      ,[status]\n"
                    + "      ,[description]\n"
                    + "      ,[createTime]\n"
                    + "  FROM [SWP391].[dbo].[course] where mentorID = ? and timeEnd < GETDATE()";
        }

        List<Course> cList = new ArrayList<>();
        MentorDAO md = new MentorDAO();
        SubjectDAO sd = new SubjectDAO();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Course c = new Course();
                c.setCourseID(rs.getInt(1));
                c.setSubjectID(rs.getInt(2));
                c.setMentorID(rs.getInt(3));
                c.setSlots(rs.getInt(4));
                c.setTimePerSlot(rs.getInt(5));
                c.setMoneyPerSlot(rs.getInt(6));
                c.setTimeStart(rs.getString(7));
                c.setTimeEnd(rs.getString(8));
                c.setLearnType(rs.getInt(9));
                c.setStatus(rs.getInt(10));
                c.setDescription(rs.getString(11));
                c.setCreateTime(rs.getString(12));
                c.setMentor(md.getMentorById(c.getMentorID()));
                c.setListCourseSlot(getSlotByCourse(c.getCourseID()));
                c.setSlotDone(getSlotDoneByCourseID(c.getCourseID()));
                c.setSubject(sd.getSubject(c.getSubjectID()));
                cList.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return cList;

    }

    public List<Course> getCoursesFutureByUserID(int id, int role) {
        String sql = "";
        if (role == 2) {
            sql = "SELECT TOP (1000) c.[courseID]\n"
                    + "      ,c.[subjectID]\n"
                    + "      ,[mentorID]\n"
                    + "      ,[slots]\n"
                    + "      ,c.[timePerSlot]\n"
                    + "      ,c.[moneyPerSlot]\n"
                    + "      ,[timeStart]\n"
                    + "      ,[timeEnd]\n"
                    + "      ,c.[learnType]\n"
                    + "      ,c.[status]\n"
                    + "      ,c.[description]\n"
                    + "      ,[createTime]\n"
                    + "  FROM [SWP391].[dbo].[course] c inner join requestsCourse r on c.courseID = r.courseID \n"
                    + "  inner join request req on r.requestID = req.requestID where req.userID = ? and timeStart > GETDATE()";
        } else {
            sql = "SELECT TOP (1000) [courseID]\n"
                    + "      ,[subjectID]\n"
                    + "      ,[mentorID]\n"
                    + "      ,[slots]\n"
                    + "      ,[timePerSlot]\n"
                    + "      ,[moneyPerSlot]\n"
                    + "      ,[timeStart]\n"
                    + "      ,[timeEnd]\n"
                    + "      ,[learnType]\n"
                    + "      ,[status]\n"
                    + "      ,[description]\n"
                    + "      ,[createTime]\n"
                    + "  FROM [SWP391].[dbo].[course] where mentorID = ? and timeStart > GETDATE()";
        }
        List<Course> cList = new ArrayList<>();
        MentorDAO md = new MentorDAO();
        SubjectDAO sd = new SubjectDAO();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Course c = new Course();
                c.setCourseID(rs.getInt(1));
                c.setSubjectID(rs.getInt(2));
                c.setMentorID(rs.getInt(3));
                c.setSlots(rs.getInt(4));
                c.setTimePerSlot(rs.getInt(5));
                c.setMoneyPerSlot(rs.getInt(6));
                c.setTimeStart(rs.getString(7));
                c.setTimeEnd(rs.getString(8));
                c.setLearnType(rs.getInt(9));
                c.setStatus(rs.getInt(10));
                c.setDescription(rs.getString(11));
                c.setCreateTime(rs.getString(12));
                c.setMentor(md.getMentorById(c.getMentorID()));
                c.setListCourseSlot(getSlotByCourse(c.getCourseID()));
                c.setSlotDone(getSlotDoneByCourseID(c.getCourseID()));
                c.setSubject(sd.getSubject(c.getSubjectID()));
                cList.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return cList;

    }

    public List<Course> getCoursesByUserID(int id) {
        String sql = "SELECT TOP (1000) c.[courseID]\n"
                + "      ,c.[subjectID]\n"
                + "      ,[mentorID]\n"
                + "      ,[slots]\n"
                + "      ,c.[timePerSlot]\n"
                + "      ,c.[moneyPerSlot]\n"
                + "      ,[timeStart]\n"
                + "      ,[timeEnd]\n"
                + "      ,c.[learnType]\n"
                + "      ,c.[status]\n"
                + "      ,c.[description]\n"
                + "      ,[createTime]\n"
                + "  FROM [SWP391].[dbo].[course] c inner join requestsCourse r on c.courseID = r.courseID \n"
                + "  inner join request req on r.requestID = req.requestID where req.userID = ?";
        List<Course> cList = new ArrayList<>();
        MentorDAO md = new MentorDAO();
        SubjectDAO sd = new SubjectDAO();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Course c = new Course();
                c.setCourseID(rs.getInt(1));
                c.setSubjectID(rs.getInt(2));
                c.setMentorID(rs.getInt(3));
                c.setSlots(rs.getInt(4));
                c.setTimePerSlot(rs.getInt(5));
                c.setMoneyPerSlot(rs.getInt(6));
                c.setTimeStart(rs.getString(7));
                c.setTimeEnd(rs.getString(8));
                c.setLearnType(rs.getInt(9));
                c.setStatus(rs.getInt(10));
                c.setDescription(rs.getString(11));
                c.setCreateTime(rs.getString(12));
                c.setMentor(md.getMentorById(c.getMentorID()));
                c.setListCourseSlot(getSlotByCourse(c.getCourseID()));
                c.setSlotDone(getSlotDoneByCourseID(c.getCourseID()));
                c.setSubject(sd.getSubject(c.getSubjectID()));
                cList.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return cList;

    }

    public Course getCourseByID(int id) {
        String sql = "SELECT TOP (1000) c.[courseID]\n"
                + "      ,c.[subjectID]\n"
                + "      ,[mentorID]\n"
                + "      ,[slots]\n"
                + "      ,c.[timePerSlot]\n"
                + "      ,c.[moneyPerSlot]\n"
                + "      ,[timeStart]\n"
                + "      ,[timeEnd]\n"
                + "      ,c.[learnType]\n"
                + "      ,c.[status]\n"
                + "      ,c.[description]\n"
                + "      ,[createTime]\n"
                + "  FROM [SWP391].[dbo].[course] c where c.courseID = ?";
        MentorDAO md = new MentorDAO();
        SubjectDAO sd = new SubjectDAO();
        Course c = new Course();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                c.setCourseID(rs.getInt(1));
                c.setSubjectID(rs.getInt(2));
                c.setMentorID(rs.getInt(3));
                c.setSlots(rs.getInt(4));
                c.setTimePerSlot(rs.getInt(5));
                c.setMoneyPerSlot(rs.getInt(6));
                c.setTimeStart(rs.getString(7));
                c.setTimeEnd(rs.getString(8));
                c.setLearnType(rs.getInt(9));
                c.setStatus(rs.getInt(10));
                c.setDescription(rs.getString(11));
                c.setCreateTime(rs.getString(12));
                c.setMentor(md.getMentorById(c.getMentorID()));
                c.setListCourseSlot(getSlotByCourse(c.getCourseID()));
                c.setSlotDone(getSlotDoneByCourseID(c.getCourseID()));
                c.setSubject(sd.getSubject(c.getSubjectID()));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return c;
    }

    public int getSlotDoneByCourseID(int id) {
        String sql = "SELECT count(*)\n"
                + "  FROM [SWP391].[dbo].[slot] where courseID = ? and slotTimeFrom < getDate()";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

}
