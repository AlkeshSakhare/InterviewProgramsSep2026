package javaprograms;

import java.util.Arrays;

public class CheckIfArrayContainsValue_61 {
    public static void main(String[] args) {
        String value = "ABC";
        String a[] = {"ABC", "abc", "ds", "ads", "ABCD"};
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(value)) {
                count++;
            }
        }
        System.out.println(Arrays.toString(a) + " contains value " + value + " " + count + " times");

    }
}
