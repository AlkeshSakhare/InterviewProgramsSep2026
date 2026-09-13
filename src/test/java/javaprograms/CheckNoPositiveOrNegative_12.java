package javaprograms;

import java.util.Scanner;

public class CheckNoPositiveOrNegative_12 {
    public static void main(String[] args) {
        System.out.println("Enter no:");
        double no = new Scanner(System.in).nextDouble();
        if (no > 0) {
            System.out.println(no + " is positive");
        } else if (no == 0) {
            System.out.println(no + " is not positive or negative");
        } else System.out.println(no + " is negative");
    }
}
