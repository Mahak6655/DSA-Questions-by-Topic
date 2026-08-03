package String;

import java.util.Arrays;

public class anagram {

    // Method to check whether two strings are anagrams
    public static boolean stringAnagram(String str1, String str2) {

        // Convert both strings to lowercase for case-insensitive comparison
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        } else {

            // Convert strings into character arrays
            char str1charArray[] = str1.toCharArray();
            char str2charArray[] = str2.toCharArray();

            // Sort both character arrays
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // Compare the sorted arrays
            if (Arrays.equals(str1charArray, str2charArray)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {

        // Sample input
        System.out.println(stringAnagram("race", "cabe"));
    }
}