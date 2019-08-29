import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);

        //return number of milliseconds since January 1, 1970, 00:00:00 GMT
        System.out.println(timestamp.getTime());

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj swój Timestamp: ");
        Long x = in.nextLong();
        System.out.println(x);


        Date date = new Date(x * 1000);
        System.out.println("Twoja data urodzenia to: " + date);


        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formatDate = date.format(formattedDate);

        System.out.println(formattedDate);
    }
}

