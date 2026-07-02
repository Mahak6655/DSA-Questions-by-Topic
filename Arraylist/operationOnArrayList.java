```java
import java.util.*;

public class operationsOnArraylist {

    public static void main(String[] args) {

        // Create an ArrayList of Integer type
        ArrayList<Integer> list = new ArrayList<>();

        // ---------------- Add Elements ----------------
        // Time Complexity: O(1) (Average)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print the ArrayList
        System.out.println(list);

        // ---------------- Get Element ----------------
        // Access the element at index 2
        // Time Complexity: O(1)
        System.out.println(list.get(2));

        // ---------------- Remove Element ----------------
        // Remove the element at index 4
        // Time Complexity: O(n)
        System.out.println(list.remove(4));

        // Print the updated ArrayList
        System.out.println(list);

        // ---------------- Update Element ----------------
        // Replace the element at index 2 with 10
        // Time Complexity: O(n)
        list.set(2, 10);

        // Print the updated ArrayList
        System.out.println(list);

        // ---------------- Search Element ----------------
        // Check whether the element exists in the ArrayList
        // Time Complexity: O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(5));
    }
}
```
