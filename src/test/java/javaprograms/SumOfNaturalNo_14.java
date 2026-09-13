package javaprograms;

import java.util.Scanner;

public class SumOfNaturalNo_14 {
    public static void main(String[] args) {
        System.out.println("Enter character");
        int no = new Scanner(System.in).nextInt();
        int sum = no * (no + 1) / 2;
        System.out.println("Sum of Natural no is: " + sum);
    }
}
