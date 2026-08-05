public class lastOccurance {

    // Recursive method to find the last occurrence of a key in an array
    public static int findLastOccurrence(int arr[], int i, int key) {

        // Base case: if the end of the array is reached,
        // the key is not found
        if (i == arr.length) {
            return -1;
        }

        // Recursively search in the remaining array
        int isFound = findLastOccurrence(arr, i + 1, key);

        // If the key is not found ahead and the current element
        // matches the key, return the current index
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        // Otherwise, return the index found in the recursive call
        return isFound;
    }

    public static void main(String[] args) {

        // Sample array
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};

        // Print the index of the last occurrence of the key
        System.out.println(findLastOccurrence(arr, 0, 5));
    }
}
