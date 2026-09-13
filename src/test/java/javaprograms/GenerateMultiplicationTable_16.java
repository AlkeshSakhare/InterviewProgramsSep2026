package javaprograms;

import java.util.Scanner;

public class GenerateMultiplicationTable_16 {
    public static void main(String[] args) {
        System.out.println("Enter no:");
        int no = new Scanner(System.in).nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(no + " * " + i + " = " + (no * i));
        }
    }
}
