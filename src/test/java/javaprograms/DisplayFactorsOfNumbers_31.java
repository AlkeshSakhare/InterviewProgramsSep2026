package javaprograms;

import java.util.Scanner;

public class DisplayFactorsOfNumbers_31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int no = sc.nextInt();

        System.out.println("Factors of " + no + ":");

        for (int i = 1; i <= no; i++) {
            if (no % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
