package javaprograms;

import java.util.Scanner;

public class ReverseANo_22 {
    public static void main(String[] args) {
        System.out.println("Enter no:");
        int no = new Scanner(System.in).nextInt();
        int reverse = 0;
        int remainder;
        while (no != 0) {
            remainder = no % 10;
            reverse = remainder + reverse * 10;
            no = no / 10;
        }
        System.out.println("Reverse: " + reverse);
    }
}
