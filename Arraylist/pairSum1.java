
import java.util.*;

public class pairSum1 {

    // -------------------------------------------------------
    // Brute Force Approach
    // Time Complexity: O(n²)
    // Space Complexity: O(1)
    // -------------------------------------------------------
    // This method checks every possible pair of elements
    // and returns the indices of the pair whose sum equals
    // the target value.
    public static int[] pairSum(ArrayList<Integer> list, int t) {

        // Traverse all possible pairs
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                // Check if the current pair equals the target
                if (list.get(i) + list.get(j) == t) {
                    return new int[] { i, j };
                }
            }
        }

        // Return default indices if no valid pair is found
        return new int[] { 0, 0 };
    }

    // -------------------------------------------------------
    // Two Pointer Approach (Optimal)
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -------------------------------------------------------
    // This method works only for a sorted ArrayList.
    // It uses two pointers to efficiently find the target sum.
    public static int[] pairSum1(ArrayList<Integer> list, int t) {

        // Left pointer
        int i = 0;

        // Right pointer
        int j = list.size() - 1;

        // Continue until both pointers meet
        while (i != j) {

            int sum = list.get(i) + list.get(j);

            // Pair found
            if (sum == t) {
                return new int[] { i, j };
            }

            // Move the right pointer if the sum is too large
            if (sum > t) {
                j--;
            }
            // Move the left pointer if the sum is too small
            else {
                i++;
            }
        }

        // Return default indices if no valid pair is found
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {

        // Create a sorted ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add sample elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Find pair whose sum is 5
        System.out.println("Target = 5 : " + Arrays.toString(pairSum1(list, 5)));

        // Find pair whose sum is 6
        System.out.println("Target = 6 : " + Arrays.toString(pairSum1(list, 6)));
    }
}