package javaprograms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate_57 {
    public static void main(String[] args) {
        String date = "19-09-2026";

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate localDate = LocalDate.parse(date, formatter);

        System.out.println("Date = " + localDate);
    }
}
