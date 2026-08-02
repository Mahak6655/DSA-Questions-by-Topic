import java.util.*;

public class hashmapOperation {

    public static void main(String[] args) {

        // Creating a HashMap to store country names as keys
        // and their population values as integers
        HashMap<String, Integer> hm = new HashMap<>();

        // ---------------- INSERT OPERATION ----------------
        // Time Complexity: O(1) on average
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 200);
        hm.put("UK", 150);
        hm.put("Indonesia", 50);

        // Displaying all key-value pairs in the HashMap
        System.out.println("HashMap: " + hm);

        // ---------------- GET OPERATION ----------------
        // Retrieves the value associated with a given key
        // Time Complexity: O(1) on average
        System.out.println("Population of India: " + hm.get("India"));

        // Returns null if the key does not exist
        System.out.println("Population of Japan: " + hm.get("Japan"));

        // ---------------- CONTAINS KEY OPERATION ----------------
        // Checks whether a key exists in the HashMap
        // Time Complexity: O(1) on average
        System.out.println("Does Japan exist? : " + hm.containsKey("Japan"));
        System.out.println("Does India exist? : " + hm.containsKey("India"));

        // ---------------- REMOVE OPERATION ----------------
        // Removes a key-value pair from the HashMap
        // Time Complexity: O(1) on average
        System.out.println("Removed Value: " + hm.remove("Indonesia"));

        // Displaying the updated HashMap
        System.out.println("Updated HashMap: " + hm);

        // ---------------- SIZE OPERATION ----------------
        // Returns the total number of key-value pairs
        System.out.println("Size of HashMap: " + hm.size());

        // ---------------- ISEMPTY OPERATION ----------------
        // Checks whether the HashMap is empty
        System.out.println("Is HashMap Empty? :  " + hm.isEmpty());

        // ---------------- CLEAR OPERATION ----------------
        // Removes all key-value pairs from the HashMap
        hm.clear();

        // Verifying that the HashMap is empty after clearing
        System.out.println("HashMap after clear(): " + hm);
        System.out.println("Is HashMap Empty Now? : " + hm.isEmpty());
    }
}