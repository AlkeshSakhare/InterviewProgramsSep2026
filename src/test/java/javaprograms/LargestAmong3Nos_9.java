package javaprograms;

public class LargestAmong3Nos_9 {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 200;
        int no3 = 30;
        int max = no1;
        if (max < no2) {
            max = no2;
        }
        if (max < no3) {
            max = no3;
        }
        System.out.println("Max no is: " + max);
    }
}
