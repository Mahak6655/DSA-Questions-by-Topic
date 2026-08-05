public class arraySorted {

    // Recursive method to check whether an array is sorted
    // in ascending order
    public static boolean isArraySorted(int arr[], int i) {

        // Base case: if the last element is reached,
        // the array is sorted
        if (i == arr.length - 1) {
            return true;
        }

        // If the current element is greater than the next,
        // the array is not sorted
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // Recursively check the remaining array
        return isArraySorted(arr, i + 1);
    }

    public static void main(String[] args) {

        // Sample array
        int arr[] = {1, 2, 3, 4, 5, 6, 1};

        // Print whether the array is sorted
        System.out.println(isArraySorted(arr, 0));
    }
}