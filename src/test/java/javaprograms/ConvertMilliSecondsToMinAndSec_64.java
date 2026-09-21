package javaprograms;

public class ConvertMilliSecondsToMinAndSec_64 {
    public static void main(String[] args) {
        long milliseconds = 125000;

        long totalSeconds = milliseconds / 1000;

        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;

        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);


    }
}
