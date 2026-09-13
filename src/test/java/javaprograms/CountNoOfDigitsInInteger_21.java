package javaprograms;

import java.util.Scanner;

public class CountNoOfDigitsInInteger_21 {
    public static void main(String[] args) {
        System.out.println("Enter no:");
        int no = new Scanner(System.in).nextInt();
        int actualno = no;
        int count = 0;
        while (no != 0) {
            no = no / 10;
            count++;
        }
        System.out.println("No of digits in:" + actualno + " is =" + count);
    }
}
