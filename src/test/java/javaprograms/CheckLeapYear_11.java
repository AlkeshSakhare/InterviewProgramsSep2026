package javaprograms;

import java.util.Scanner;

public class CheckLeapYear_11 {
    public static void main(String[] args) {
        System.out.println("Enter Year:");
        int year = new Scanner(System.in).nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is leap");
        } else System.out.println(year + " is not leap");
    }
}
