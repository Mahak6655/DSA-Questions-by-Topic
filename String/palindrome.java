package String;

public class palindrome {

    // Method to check whether a given string is a palindrome
    public static boolean stringPalindrome(String str) {

        // Compare characters from the beginning and the end
        for (int i = 0; i < str.length() / 2; i++) {

            // If any pair of characters doesn't match, it's not a palindrome
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        // All character pairs matched
        return true;
    }

    public static void main(String[] args) {

        // Example input
        String str = "noona";

        // Print the result
        System.out.println(stringPalindrome(str));
    }
}

// Time Complexity
// Time: O(n) (only half of the string is traversed)
// Space: O(1) (no extra space is used)