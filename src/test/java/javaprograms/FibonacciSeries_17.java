package javaprograms;

import java.util.Scanner;

public class FibonacciSeries_17 {
    public static void main(String[] args) {
        System.out.println("Enter no of items");
        int no = new Scanner(System.in).nextInt();
        int firstNo = 0;
        int secondNo = 1;
        System.out.print(firstNo + "\t" + secondNo + "\t");
        for (int i = 0; i < no - 2; i++) {
            int sum = firstNo + secondNo;
            System.out.print(sum + "\t");
            firstNo = secondNo;
            secondNo = sum;
        }
    }
}
