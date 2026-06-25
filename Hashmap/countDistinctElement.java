
import java.util.*;

public class countDistinctElement {

    // Function to count distinct elements in an array
    public static int countDistinct(int arr[]) {

        // HashSet stores only unique values
        HashSet<Integer> hs = new HashSet<>();

        // Add all array elements to the HashSet
        // Duplicate elements will be ignored automatically
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }

        // Return the number of unique elements
        return hs.size();
    }

    public static void main(String[] args) {

        // Sample array containing duplicate elements
        int arr[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};

        // Print the count of distinct elements
        System.out.println("Ans : "+countDistinct(arr));
    }
}


