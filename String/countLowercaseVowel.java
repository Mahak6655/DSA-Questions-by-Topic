package String;

public class countLowercaseVowel {

    // Method to count the number of lowercase vowels in a string
    public static int countLowerCaseVowel(String str) {

        int count = 0;

        // Traverse each character of the string
        for (int i = 0; i < str.length(); i++) {

            // Check if the current character is a lowercase vowel
            if ((str.charAt(i) == 'a') ||
                (str.charAt(i) == 'e') ||
                (str.charAt(i) == 'i') ||
                (str.charAt(i) == 'o') ||
                (str.charAt(i) == 'u')) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        // Sample input
        String str = "mahAk";

        // Print the total number of lowercase vowels
        System.out.println(countLowerCaseVowel(str));
    }
}