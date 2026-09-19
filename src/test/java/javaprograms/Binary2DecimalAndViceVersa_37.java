package javaprograms;

import java.util.Scanner;

public class Binary2DecimalAndViceVersa_37 {
    public static void main(String[] args) {
        System.out.println("Enter Decimal No:");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int bi = binary(no);
        System.out.println(no + "=(" + bi + ")2");
        System.out.println("Enter Binary No:");
        no = sc.nextInt();
        int decimalNo = decimal(no);
        System.out.println("(" + no + ")2=" + decimalNo);
    }

    private static int binary(int no) {
        String binary = "";
        int remainder;
        while (no != 0) {
            remainder = no % 2;
            if (remainder == 0) {
                binary = binary + 0;
            } else {
                binary = binary + 1;
            }
            no = no / 2;
        }
        return Integer.parseInt(String.valueOf(new StringBuffer(binary).reverse()));
    }

    private static int decimal(int no) {
        int decimal = 0;
        int remainder;
        int power = 1;
        while (no != 0) {
            remainder = no % 10;
            decimal = decimal + remainder * power;
            power = power * 2;
            no = no / 10;
        }
        return decimal;
    }

}
