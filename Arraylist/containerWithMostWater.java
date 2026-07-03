
import java.util.*;

public class containerWithMostWater {

    // -------------------------------------------------------
    // Brute Force Approach
    // Time Complexity: O(n²)
    // Space Complexity: O(1)
    // -------------------------------------------------------
    // This method checks every possible pair of lines
    // and returns the maximum amount of water that can be stored.
    public static int storeWater(ArrayList<Integer> height) {

        // Store the maximum water found
        int maxWater = 0;

        // Traverse all possible pairs
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {

                // Height of the container is the smaller of the two lines
                int ht = Math.min(height.get(i), height.get(j));

                // Width is the distance between the two lines
                int width = j - i;

                // Calculate the water stored
                int water = ht * width;

                // Update the maximum water
                maxWater = Math.max(maxWater, water);
            }
        }

        return maxWater;
    }

    // -------------------------------------------------------
    // Two Pointer Approach (Optimal)
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -------------------------------------------------------
    // This method uses two pointers to efficiently find
    // the maximum water container.
    public static int storeWater2(ArrayList<Integer> height) {

        // Store the maximum water found
        int maxWater = 0;

        // Initialize left and right pointers
        int lp = 0;
        int rp = height.size() - 1;

        // Continue until both pointers meet
        while (lp < rp) {

            // Height of the container
            int ht = Math.min(height.get(lp), height.get(rp));

            // Width between the two pointers
            int width = rp - lp;

            // Calculate current water
            int currWater = ht * width;

            // Update the maximum water
            maxWater = Math.max(maxWater, currWater);

            // Move the pointer with the smaller height
            // because it limits the container size
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {

        // Create an ArrayList to store heights
        ArrayList<Integer> height = new ArrayList<>();

        // Add sample heights
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // Find the answer using the Brute Force approach
        System.out.println("Maximum Water Stored (Brute Force): " + storeWater(height));

        // Find the answer using the Optimal Two Pointer approach
        System.out.println("Maximum Water Stored (Optimal): " + storeWater2(height));
    }
}
