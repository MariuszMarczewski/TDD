import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.DateTimeException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Rozne {

    public static void main(String[] args){

//        int mojTimestamp
//
//        Calendar calendar = new GregorianCalendar();
//        calendar.getTime();

        String mojaData = "16-06-2019";

        try {

            Date date = new SimpleDateFormat("dd-mm-yyy").parse(mojaData);

            System.out.println(date.getTime());

            System.out.println(date.toString());

        } catch (ParseException e) {

            e.printStackTrace();

        }
    }
}
