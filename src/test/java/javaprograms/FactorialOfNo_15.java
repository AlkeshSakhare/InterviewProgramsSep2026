package javaprograms;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfNo_15 {
    public static void main(String[] args) {
        System.out.println("Enter positive integer");
        int no = new Scanner(System.in).nextInt();
        BigInteger fact = BigInteger.ONE;
        if (no == 0) {
            System.out.println(no + "! = " + fact);
        } else if (no < 0) {
            System.out.println("Please enter positive no");
        } else {
            for (int i = 1; i <= no; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println(no + "! = " + fact);
        }
    }
}
