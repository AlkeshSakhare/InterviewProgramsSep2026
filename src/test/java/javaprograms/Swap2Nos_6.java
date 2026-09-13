package javaprograms;

public class Swap2Nos_6 {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 20;

        System.out.println("Before Swapping:");
        System.out.println("No1:" + no1 + "\nNo2:" + no2);
        int a = no1;
        no1 = no2;
        no2 = a;
        System.out.println("After Swapping:");
        System.out.println("No1:" + no1 + "\nNo2:" + no2);
    }

}
