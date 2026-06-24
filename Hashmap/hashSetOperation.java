
import java.util.*;

public class hashSetOperation {

    public static void main(String[] args) {

        // Creating a HashSet
        // HashSet stores only unique elements
        HashSet<Integer> hs = new HashSet<>();

        // Adding elements to the HashSet
        hs.add(1);
        hs.add(2);
        hs.add(3);

        // Duplicate values will not be added
        hs.add(2);
        hs.add(1);

        // Printing the HashSet
        System.out.println("HashSet: " + hs);

        // Removing an element from the HashSet
        hs.remove(2);

        // Checking whether an element exists in the HashSet
        System.out.println("Contains 2: " + hs.contains(2));

        // Printing the number of elements in the HashSet
        System.out.println("Size of HashSet: " + hs.size());

        // Checking whether the HashSet is empty
        System.out.println("Is HashSet Empty? " + hs.isEmpty());

        // Removing all elements from the HashSet
        hs.clear();

        // Printing HashSet after clearing
        System.out.println("HashSet after clear(): " + hs);
    }
}

