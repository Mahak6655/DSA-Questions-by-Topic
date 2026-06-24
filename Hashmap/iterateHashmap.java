import java.util.HashMap;
import java.util.Set;

public class iterateHashmap {
    public static void main(String[] args) {

        // Creating a HashMap to store country names as keys
        // and their population values as integers
        HashMap<String, Integer> hm = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 200);
        hm.put("UK", 150);
        hm.put("Indonesia", 50);

        // ---------------- ITERATING OVER HASHMAP ----------------
        // keySet() returns a Set containing all keys present in the HashMap
        Set<String> keys = hm.keySet();

        // Printing all keys
        System.out.println("Keys in HashMap: " + keys);

        // Using an enhanced for-loop to iterate through all keys
        for (String k : keys) {

            // Retrieving the value associated with each key
            System.out.println("Key: " + k + ", Value: " + hm.get(k));
        }
    }
}
