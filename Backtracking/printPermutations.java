package Backtracking;

public class printPermutations {

    // Function to generate and print all permutations
    public static void findPermutation(String str, String ans) {

        // Base case:
        // When no characters are left, print the generated permutation
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Try every character as the current character
        for (int i = 0; i < str.length(); i++) {

            // Select the current character
            char curr = str.charAt(i);

            // Remove the selected character from the remaining string
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Recursively generate permutations
            findPermutation(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {

        String str = "abc";

        // Generate all permutations
        findPermutation(str, "");
    }
}