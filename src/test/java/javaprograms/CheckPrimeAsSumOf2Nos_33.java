package javaprograms;

import java.util.Scanner;

public class CheckPrimeAsSumOf2Nos_33 {
    public static void main(String[] args) {
        System.out.println("Enter no");
        int no = new Scanner(System.in).nextInt();
        int firstNo, secondNo;
        boolean isSumOf2PrimeNo = false;
        for (int i = 2; i < no / 2; i++) {
            firstNo = i;
            secondNo = no - i;
            if (checkPrimeNo(firstNo) && checkPrimeNo(secondNo)) {
                isSumOf2PrimeNo = true;
                System.out.println(no + " can be represented as sum of 2 Prime nos as " + firstNo + " + " + secondNo);
            }
        }
        if (!isSumOf2PrimeNo) {
            System.out.println("it can not be represented as sum of 2 Prime nos");
        }
    }

    static boolean checkPrimeNo(int no) {
        boolean isPrime = true;
        if (no <= 1)
            return false;
        for (int i = 2; i <= no / 2; i++) {
            if (no % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
