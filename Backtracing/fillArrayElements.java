import java.util.*;

public class fillArrayElements {

    public static int[] changeArrayElements(int arr[], int i, int val) {

        // Base case:
        // When all elements are filled, return the array
        if (i == arr.length) {
            return arr;
        }

        // Assign the current value to the current index
        arr[i] = val;

        // Recursive call to fill the next element
        changeArrayElements(arr, i + 1, val + 1);

        // Backtracking:
        // Modify the current element while returning
        // from the recursive calls
        arr[i] = arr[i] - 2;

        return arr;
    }

    public static void main(String[] args) {

        // Create an array of size 5
        int arr[] = new int[5];

        // Fill the array recursively and print the result
        System.out.println(
            Arrays.toString(changeArrayElements(arr, 0, 1))
        );
    }
}