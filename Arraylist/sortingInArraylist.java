
import java.util.*;

public class sortingInArraylist {

    public static void main(String[] args) {

        // Create an ArrayList of Integer type
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Print the original ArrayList
        System.out.println("Original ArrayList : " + list);

        // ---------------- Ascending Order ----------------
        // Sort the ArrayList in ascending order
        // Time Complexity: O(n log n)
        Collections.sort(list);

        System.out.println("Ascending Order : " + list);

        // ---------------- Descending Order ----------------
        // Sort the ArrayList in descending order
        // using the built-in reverseOrder() comparator
        // Time Complexity: O(n log n)
        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Descending Order : " + list);
    }
}


