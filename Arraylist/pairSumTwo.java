
import java.util.*;

public class pairSumTwo {

    // -------------------------------------------------------
    // Pair Sum in a Sorted & Rotated Array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -------------------------------------------------------
    // This method finds two elements whose sum equals the
    // target value using the circular two-pointer technique.
    public static int[] pairSum2(ArrayList<Integer> list, int t) {

        // Find the breaking point (largest element)
        int bp = -1;
        int n = list.size();

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        // Left pointer points to the smallest element
        int lp = bp + 1;

        // Right pointer points to the largest element
        int rp = bp;

        // Continue until both pointers meet
        while (lp != rp) {

            int sum = list.get(lp) + list.get(rp);

            // Pair found
            if (sum == t) {
                return new int[] { lp, rp };
            }

            // Move left pointer forward if sum is smaller
            if (sum < t) {
                lp = (lp + 1) % n;
            }

            // Move right pointer backward if sum is greater
            else {
                rp = (n + rp - 1) % n;
            }
        }

        // Return default indices if no pair is found
        return new int[] { 0, 0 };
    }

    public static void main(String[] args) {

        // Create a sorted and rotated ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add sample elements
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        // Find the pair whose sum is 16
        System.out.println(Arrays.toString(pairSum2(list, 16)));
    }
}
