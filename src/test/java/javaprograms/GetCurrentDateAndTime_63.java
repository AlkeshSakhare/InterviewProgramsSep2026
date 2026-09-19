package javaprograms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetCurrentDateAndTime_63 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        //  date and time
        DateTimeFormatter dateAndTime = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss:a");
        String formattedDateTime = now.format(dateAndTime);
        System.out.println("Current Date and Time: " + formattedDateTime);
        //  date
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = now.format(date);
        System.out.println("Current Date : " + formattedDate);

        //  time
        DateTimeFormatter time = DateTimeFormatter.ofPattern("hh:mm:ss:a");
        String formattedTime = now.format(time);
        System.out.println("Current Time: " + formattedTime);
    }
}
