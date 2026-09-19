package javaprograms;

import java.util.Arrays;

public class Concatenate2Arrays_59 {
    public static void main(String[] args) {
        int a[] = {1, 4, 3, 1, 1};
        int b[] = {11, 14, 13, 11, 11};
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        System.out.println("a:" + Arrays.toString(a));
        System.out.println("b:" + Arrays.toString(b));
        System.out.println("c:" + Arrays.toString(c));
    }
}
