public class firstOccurance {

    // Recursive method to find the first occurrence of a key in an array
    public static int findFirstOccurrence(int arr[], int i, int key) {

        // Base case: if the end of the array is reached,
        // the key is not present
        if (i == arr.length) {
            return -1;
        }

        // If the current element matches the key,
        // return its index
        if (arr[i] == key) {
            return i;
        }

        // Recursively search in the remaining array
        return findFirstOccurrence(arr, i + 1, key);
    }

    public static void main(String[] args) {

        // Sample array
        int arr[] = {8, 2, 3, 4, 9, 5, 7, 8};

        // Print the index of the first occurrence of the key
        System.out.println(findFirstOccurrence(arr, 0, 5));
    }
}