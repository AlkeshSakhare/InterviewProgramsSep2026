package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2ArrayAndViceVersa_67 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(1, 34, 4, 14, 14, 15, 7, 67));
        System.out.println("ArrayList :" + list);
        System.out.println("converted arraylist to array");
        Object[] a = list.toArray();
        System.out.println("converted Array: " + Arrays.toString(a));
        System.out.println("converted array to arraylist");
        List<Object> list1 = Arrays.stream(a).toList();
        System.out.println("converted ArrayList :" + list1);

    }
}
