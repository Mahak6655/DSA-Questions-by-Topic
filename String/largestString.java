package String;

public class largestString {

    // Method to find the lexicographically largest string
    // using compareToIgnoreCase()
    public static String printLargestString(String str[]) {

        // Assume the first string is the largest initially
        String largest = str[0];

        // Compare each string with the current largest string
        for (int i = 0; i < str.length; i++) {

            // Update the largest string if a lexicographically
            // greater string is found (case-insensitive)
            if (largest.compareToIgnoreCase(str[i]) < 0) {
                largest = str[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        // Sample array of strings
        String str[] = {"Apple", "Mango", "Banana"};

        // Print the largest string
        System.out.println(printLargestString(str));
    }
}