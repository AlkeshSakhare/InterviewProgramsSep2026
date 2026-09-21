package javaprograms;

import java.util.LinkedHashMap;
import java.util.List;

public class HashMapToList_69 {
    public static void main(String[] args) {
        //TreeMap - keep A-Z sequence
        //HashMap - dont maintain insertion order
        //LinkedHashMap - maintain insertion Order
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("Maharashtra", "Mumbai");
        map.put("Gujrat", "Gandhinagar");
        map.put("Madhyapradesh", "Bhopal");
        map.put("Rajasthan", "Jaipur");
        map.put("Goa", "Panji");

        List<String> states = map.keySet().stream().toList();
        List<String> capitals = map.values().stream().toList();
        System.out.println("Map: " + map);
        System.out.println("State: " + states);
        System.out.println("Capitals: " + capitals);
    }
}
