package javaprograms;

import java.util.Arrays;

public class PrintArray_56 {
    public static void main(String[] args) {
        int a[] = new int[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.random() * 10;
        }
        System.out.println("Array is: " + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
