package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Join2List_66 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 43, 4, 41, 41));
        List<Integer> list2 = new ArrayList<>(List.of(2, 12, 42, 4, 12, 3, 1, 12, 35, 4));
        List<Integer> addedList = new ArrayList<>();
        addedList.addAll(list1);
        addedList.addAll(list2);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Added List : " + addedList);
    }
}
