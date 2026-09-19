package javaprograms;

public class LargestElemenInArray_43 {
    public static void main(String[] args) {
        int a[] = {1, 20, 30, 50, -545, 40, 20, 200, 5, 653};
        int max = a[0];

        for (int j = 1; j < a.length; j++) {
            if (a[j] > max) {
                max = a[j];
            }

        }
        System.out.println("Largest No from Arrays is " + max);
    }
}
