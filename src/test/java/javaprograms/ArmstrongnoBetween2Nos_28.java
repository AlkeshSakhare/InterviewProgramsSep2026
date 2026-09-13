package javaprograms;

import java.util.Scanner;

public class ArmstrongnoBetween2Nos_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no1 greater than 1:");
        int no1 = sc.nextInt();
        System.out.println("Enter no2 greater than no1:");
        int no2 = sc.nextInt();

        for (int i = no1; i <= no2; i++) {
            boolean isArmStrong = checkArmStrong(i);
            if (isArmStrong) {
                System.out.print(i + "\t");
            }
        }
    }

    private static boolean checkArmStrong(int no) {
        int actualno = no;
        double digit, sum = 0;
        while (no != 0) {
            digit = no % 10;
            sum = sum + Math.pow(digit, 3);
            no = no / 10;
        }
        if (sum == actualno) {
            return true;
        } else return false;
    }
}
