
import java.util.ArrayList;

public class swapNumber {

    // Function to swap two elements in an ArrayList
    public static void swap2Number(ArrayList<Integer> list, int idx1, int idx2) {

        // Store the first element in a temporary variable
        int temp = list.get(idx1);

        // Replace the first element with the second element
        list.set(idx1, list.get(idx2));

        // Place the stored element at the second index
        list.set(idx2, temp);
    }

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

        // Swap elements at index 1 and index 3
        swap2Number(list, 1, 3);

        // Print the ArrayList after swapping
        System.out.println("ArrayList After Swapping : " + list);
    }
}

