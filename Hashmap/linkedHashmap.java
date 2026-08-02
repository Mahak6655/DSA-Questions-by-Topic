
import java.util.*;

public class linkedHashmap {

    public static void main(String[] args) {

        // Creating a LinkedHashMap
        // LinkedHashMap stores data in key-value pairs
        // and maintains the insertion order of elements
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        // Adding key-value pairs
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 200);
        lhm.put("UK", 150);
        lhm.put("Indonesia", 50);

        // Printing the LinkedHashMap
        // Elements will be displayed in the same order
        // in which they were inserted
        System.out.println(lhm);
    }
}

