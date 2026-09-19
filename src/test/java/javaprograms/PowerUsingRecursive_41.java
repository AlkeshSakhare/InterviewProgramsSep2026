package javaprograms;

import java.util.Scanner;

public class PowerUsingRecursive_41 {
    public static void main(String[] args) {
        int no, pow;
        no = new Scanner(System.in).nextInt();
        pow = new Scanner(System.in).nextInt();
        int powerOfNumber = powerOfNo(no, pow);
        System.out.println(no + "^" + pow + " = " + powerOfNumber);
    }

    private static int powerOfNo(int no, int pow) {
        if (pow == 0) {
            return 1;
        }
        return no * powerOfNo(no, --pow);
    }
}
