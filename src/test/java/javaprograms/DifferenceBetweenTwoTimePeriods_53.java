package javaprograms;

import java.time.Duration;
import java.time.LocalTime;

public class DifferenceBetweenTwoTimePeriods_53 {
    public static void main(String[] args) {

        LocalTime start = LocalTime.of(10, 30, 45);
        LocalTime end = LocalTime.of(14, 45, 4);

        Duration duration = Duration.between(start, end);

        System.out.println("Difference = " +
                duration.toHours() + " hours " +
                duration.toMinutesPart() + " minutes " +
                duration.toSecondsPart() + " seconds");
    }
}