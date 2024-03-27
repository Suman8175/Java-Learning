import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

//JAVA stores times in milliseconds after 1st Jan 1970.
public class Java_Date_Time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println("Seconds gone since 1970 Jan 1st: "+System.currentTimeMillis()/1000);
        System.out.println("Minutes gone since 1970 Jan 1st: "+System.currentTimeMillis()/(1000*60));
        System.out.println("Hours gone since 1970 Jan 1st: "+System.currentTimeMillis()/(1000*60*60));
        System.out.println("Days gone since 1970 Jan 1st: "+System.currentTimeMillis()/(1000*60*60*24));
        System.out.println("Year gone since 1970 Jan 1st: "+System.currentTimeMillis()/1000/60/60/24/365);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
       //For Showing System Date and Time we use
    Date d=new Date();
//        System.out.println(d);
//        System.out.println(d.getDate());
//        System.out.println(d.getDay());
//        System.out.println(d.getMonth()+1);
//        System.out.println(d.getHours());
        //Use calender for new
        Calendar c1= Calendar.getInstance();
        System.out.println(c1.getTime());
        System.out.println(c1.getTimeZone());
        System.out.println(c1.get(Calendar.HOUR_OF_DAY)+" : "+c1.get(Calendar.MINUTE)+" : "+c1.get(Calendar.SECOND));

        //To set TimeZone according to ID

        Calendar c2= Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));

        System.out.println(c2.getTime());
        System.out.println(c2.getTimeZone().getID());


        //TO find time of any country
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 'T' HH:mm:ss");
        TimeZone pakistan = TimeZone.getTimeZone("Asia/Singapore");
        sdf.setTimeZone(pakistan);
        System.err.println(sdf.format(new Date()));
    }
}
