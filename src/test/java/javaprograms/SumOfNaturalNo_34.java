package javaprograms;

import java.util.Scanner;

public class SumOfNaturalNo_34 {
    public static void main(String[] args) {

        System.out.println("Enter no");
        int no = new Scanner(System.in).nextInt();
        int sum = calculateSum(no);
        System.out.println("Sum of Natural no is: " + sum);
    }

    static int calculateSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + calculateSum(n - 1);
    }
}
