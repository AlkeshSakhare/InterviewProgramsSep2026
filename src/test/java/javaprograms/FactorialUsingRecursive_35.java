package javaprograms;

import java.util.Scanner;

public class FactorialUsingRecursive_35 {
    public static void main(String[] args) {
        System.out.println("Enter No");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int fact = factorial(no);
        System.out.println(no + "!=" + fact);
    }

    private static int factorial(int no) {
        int fact = no;
        if (no == 1) {
            return fact;
        }
        if (no == 0) {
            return 1;
        }
        fact = fact * factorial(no - 1);
        return fact;
    }
}
