package javaprograms;

import java.util.Scanner;

public class DisplayPrimeBetween2Nos_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no1 greater than 1:");
        int no1 = sc.nextInt();
        System.out.println("Enter no2 greater than no1:");
        int no2 = sc.nextInt();
        for (int i = no1; i <= no2; i++) {
            boolean no = checkPrimeNo(i);
            if (no) {
                System.out.print(i + "\t");
            }
        }
    }

    private static boolean checkPrimeNo(int i) {
        boolean isPrime = true;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
