package javaprograms;

import java.util.Scanner;

public class CheckArmstrongNo_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int no = sc.nextInt();
/*        String novalue = String.valueOf(no);
        double sum = 0;
        for (int i = 0; i <= novalue.length() - 1; i++) {
            sum = sum + Math.pow(Integer.parseInt(String.valueOf(novalue.charAt(i))), 3);
            System.out.println(sum);
        }
        if (sum == no) {
            System.out.println(no + " is Armstrong number");
        } else System.out.println(no + " is not Armstrong number");*/
        int actualno = no;
        double digit, sum = 0;
        while (no != 0) {
            digit = no % 10;
            sum = sum + Math.pow(digit, 3);
            no = no / 10;
        }
        if (sum == actualno) {
            System.out.println(actualno + " is Armstrong number");
        } else System.out.println(actualno + " is not Armstrong number");
    }
}
