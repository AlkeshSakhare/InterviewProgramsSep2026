package javaprograms;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;

public class SortMapValues_80 {
    static void main() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("Maharashtra", "Mumbai");
        map.put("Gujrat", "Gandhinagar");
        map.put("Madhyapradesh", "Bhopal");
        map.put("Rajasthan", "Jaipur");
        map.put("Goa", "Panji");

        List<String> capitals = map.values().stream().toList();
        System.out.println(capitals);
        List<String> order = capitals.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println(order);
        List<String> reversedOrder = capitals.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(reversedOrder);
    }
}
