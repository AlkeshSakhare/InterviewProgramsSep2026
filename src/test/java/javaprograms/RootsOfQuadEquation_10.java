package javaprograms;

import java.util.Scanner;

public class RootsOfQuadEquation_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficient of quadratic equations");
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        int realValue = b * b - 4 * a * c;
        if (realValue >= 0) {
            System.out.println("Roots are reals");
            double d1 = (-b + realValue) / (2 * a);
            double d2 = (-b - realValue) / (2 * a);
            System.out.println("d1:" + d1 + "\nd2:" + d2);
        } else {
            System.out.println("Roots are imaginary ");
            double d1 = (-b / (2 * a));
            System.out.println("d1:" + d1 + "+" + Math.sqrt(Math.abs(realValue)) / 2 + "i");
            System.out.println("d2:" + d1 + "-" + Math.sqrt(Math.abs(realValue)) / 2 + "i");

        }


    }
}
