package javaprograms;

import java.util.Scanner;

public class PowerOfNo_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int no = sc.nextInt();
        System.out.println("Enter power:");
        int power = sc.nextInt();
        double noPower = Math.pow(no, power);
        System.out.println(no + "^" + power + " = " + noPower);
    }
}
