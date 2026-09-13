package javaprograms;

import java.util.Scanner;

public class CheckPrime_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int no = sc.nextInt();
        boolean isPrime = true;
        if (no < 2) {
            System.out.println("Prime no starts from 2");
        } else {
            for (int i = 2; i <= no / 2; i++) {
                if (no % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(no + " is prime: " + isPrime);
        }
    }
}
