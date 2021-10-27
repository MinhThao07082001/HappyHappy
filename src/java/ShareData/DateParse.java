/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShareData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Admin
 */
public class DateParse {

    public static String dmyTOymd(String date) throws java.text.ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        return sdf2.format(sdf.parse(date));
    }

    public static long dateDiff(String date1, String date2) throws ParseException {
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date1Parse = myFormat.parse(date1);
        Date date2Parse = myFormat.parse(date2);
        long diff = date1Parse.getTime() - date2Parse.getTime();
        return Math.abs(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
    }

    public static int getDayByDate(String date) throws ParseException {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        c.setTime(format.parse(date));
        return c.get(Calendar.DAY_OF_WEEK);
    }
    public static int getDayByDate(Date date) throws ParseException {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        c.setTime(date);
        return c.get(Calendar.DAY_OF_WEEK);
    }

//    public static void main(String[] args) throws ParseException {
////        System.out.println(dmyTOymd("19-11-2001"));
//        System.out.println(dateDiff("2021-10-10", "2021-10-19"));
//        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Calendar start = Calendar.getInstance();
//        start.setTime(myFormat.parse("2021-10-27"));
//        Calendar end = Calendar.getInstance();
//        end.setTime(myFormat.parse("2021-11-17"));;
//
//        for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
//            // Do your job here with `date`.
//            System.out.println(getDayByDate(date));
//            System.out.println(myFormat.format(date));
//        }
//    }
}
