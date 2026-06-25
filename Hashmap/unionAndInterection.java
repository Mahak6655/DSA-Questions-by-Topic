
import java.util.*;

public class unionAndInterection {

    // Function to find the count of elements in the union of two arrays
    public static int unionElement(int arr1[], int arr2[]) {

        // HashSet stores only unique elements
        HashSet<Integer> hs = new HashSet<>();

        // Add all elements of the first array
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        // Add all elements of the second array
        // Duplicate values will be ignored automatically
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }

        // Return the count of unique elements
        return hs.size();
    }

    // Function to find the count of common elements (intersection)
    public static int intersectionElement(int arr1[], int arr2[]) {

        // Store elements of the first array in a HashSet
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        int count = 0;

        // Check each element of the second array
        for (int i = 0; i < arr2.length; i++) {

            // If the element exists in the HashSet,
            // it is part of the intersection
            if (hs.contains(arr2[i])) {
                count++;

                // Remove the element to avoid counting duplicates
                hs.remove(arr2[i]);
            }
        }

        // Return the count of common elements
        return count;
    }

    public static void main(String[] args) {

        // Sample arrays
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        // Print union count
        System.out.println("Union elements count : " + unionElement(arr1, arr2));

        // Print intersection count
        System.out.println("Intersection element count : " + intersectionElement(arr1, arr2));
    }
}

