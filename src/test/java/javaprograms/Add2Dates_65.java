package javaprograms;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Add2Dates_65 {
    public static void main(String[] args) {
        String date1 = "19-04-1993";
        String date2 = "21-07-2026";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate localDate = LocalDate.parse(date1, dateTimeFormatter);
        LocalDate localDate2 = LocalDate.parse(date2, dateTimeFormatter);

        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();

        localDate2 = localDate2.plusDays(day);
        localDate2 = localDate2.plusMonths(month);
        localDate2 = localDate2.plusYears(year);

        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);
        System.out.println("Added date: " + localDate2);

    }
}
