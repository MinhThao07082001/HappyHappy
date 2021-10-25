package dal.admin;

import dal.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DataDashboard extends DBContext{
    public String getCountUserOneWeek(int from){
        String s = "";
        for(int i=from; i>=from-6; i--){
            String sql = "select count(*) from userCommon where CAST(createTime as date)= cast(GETDATE()-? as date)";
            try {
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setInt(1, i);
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    s += rs.getInt(1)+",";
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        s = s.substring(0, s.length()-1);
        return s;
    }
    public static void main(String[] args) {
        DataDashboard db = new DataDashboard();
        System.out.println(db.getCountUserOneWeek(6));
    }

}
