public class findSubset {

    // Recursive function to generate all possible subsets
    public static void findAllSubset(String str, int i, String newStr) {

        // Base case:
        // When all characters have been processed,
        // print the current subset
        if (i == str.length()) {
            System.out.print(newStr + " ");
            return;
        }

        // Yes: Include the current character in the subset
        findAllSubset(
            str,
            i + 1,
            newStr + str.charAt(i)
        );

        // No: Exclude the current character from the subset
        findAllSubset(
            str,
            i + 1,
            newStr
        );
    }

    public static void main(String[] args) {

        // Sample input
        String str = "abc";

        // Generate and print all subsets
        findAllSubset(str, 0, "");
    }
}