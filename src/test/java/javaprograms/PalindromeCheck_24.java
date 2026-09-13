package javaprograms;

import java.util.Scanner;

public class PalindromeCheck_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int no = sc.nextInt();
        int reverseNo = getReverseNo(no);
        System.out.println("reverse:" + reverseNo);
        System.out.println(no + " is palindrome:" + (no == reverseNo));
    }

    static int getReverseNo(int no) {
        int reverse = 0, digit;
        while (no != 0) {
            digit = no % 10;
            reverse = reverse * 10 + digit;
            no = no / 10;
        }
        return reverse;
    }
}
