
import java.util.*;

public class implemntationOfFunction {

    // Custom HashMap Implementation
    static class HashMap<K, V> {

        // Node class to store key-value pairs
        private class Node {
            K key;
            V value;

            // Constructor to initialize a node
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        // n = total number of nodes (key-value pairs)
        private int n;

        // N = total number of buckets
        private int N;

        // Array of LinkedLists used for separate chaining
        private LinkedList<Node> bucket[];

        // Constructor
        @SuppressWarnings("unchecked")
        public HashMap() {

            // Initial bucket size
            this.N = 4;

            // Create bucket array
            this.bucket = new LinkedList[4];

            // Initialize each bucket with an empty LinkedList
            for (int i = 0; i < 4; i++) {
                this.bucket[i] = new LinkedList<>();
            }
        }

        // Hash Function
        // Converts a key into a bucket index
        private int hashFunction(K key) {
            int hc = hashCode();
            return Math.abs(hc) % bucket.length;
        }

        // Search a key inside a linked list
        // Returns data index (di) if found, otherwise -1
        private int searchInLL(K key, int bi) {

            LinkedList<Node> ll = bucket[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);

                if (node.key == key) {
                    return di;
                }

                di++;
            }

            return -1;
        }

        // Rehashing Function
        // Doubles the bucket size and reinserts all elements
        @SuppressWarnings("unchecked")
        private void rehash() {

            // Store old bucket reference
            LinkedList<Node> oldBuck[] = bucket;

            // Create new bucket array with double capacity
            bucket = new LinkedList[N * 2];
            N = 2 * N;

            // Initialize new buckets
            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new LinkedList<>();
            }

            // Reinsert all existing nodes
            for (int i = 0; i < oldBuck.length; i++) {

                LinkedList<Node> ll = oldBuck[i];

                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        // Put Function
        // Inserts a new key-value pair or updates an existing key
        public void put(K key, V value) {

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            // Key already exists → update value
            if (di != -1) {
                Node node = bucket[bi].get(di);
                node.value = value;
            }

            // New key → add node
            else {
                bucket[bi].add(new Node(key, value));
                n++;
            }

            // Calculate load factor
            double lambda = n / N;

            // Rehash when load factor becomes too large
            if (lambda > 2.0) {
                // rehash();
            }
        }

        // containsKey() Function
        // Checks whether a key exists in HashMap
        // Time Complexity: O(1) Average
        public boolean containsKey(K key) {

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        // removeKey() Function
        // Removes a key-value pair and returns its value
        // Time Complexity: O(1) Average
        public V removeKey(K key) {

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = bucket[bi].remove(di);
                return node.value;
            } else {
                return null;
            }
        }

        // keySet() Function
        // Returns all keys stored in the HashMap
        public ArrayList<K> keySet() {

            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < bucket.length; i++) {

                LinkedList<Node> ll = bucket[i];

                for (Node node : ll) {
                    keys.add(node.key);
                }
            }

            return keys;
        }

        // isEmpty() Function
        // Returns true if HashMap contains no elements
        public boolean isEmpty() {
            return n == 0;
        }
    }

    // Driver Code
    public static void main(String[] args) {

        // Creating custom HashMap object
        HashMap<String, Integer> hm = new HashMap<>();

        // Inserting key-value pairs
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 200);
        hm.put("UK", 150);
        hm.put("Indonesia", 50);

        // Getting all keys from the HashMap
        ArrayList<String> keys = hm.keySet();

        // Printing all keys
        System.out.println("Keys present in HashMap:");

        for (String key : keys) {
            System.out.println(key);
        }
    }
}
