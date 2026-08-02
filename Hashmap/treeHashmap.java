
import java.util.*;

public class treeHashmap {

    public static void main(String[] args) {

        // Creating a TreeMap
        // TreeMap stores data in key-value pairs
        // and automatically sorts keys in ascending order
        TreeMap<String, Integer> thm = new TreeMap<>();

        // Adding key-value pairs
        thm.put("China", 150);
        thm.put("India", 100);
        thm.put("US", 200);
        thm.put("UK", 150);
        thm.put("Indonesia", 50);

        // Printing the TreeMap
        // Output will be sorted according to the keys
        System.out.println(thm);
    }
}


