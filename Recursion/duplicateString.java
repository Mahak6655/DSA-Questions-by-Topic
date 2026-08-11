public class duplicateString {

    // Recursive method to remove duplicate characters from a string
    public static void duplicateStringRemove(
            String str, int i, StringBuilder newStr, boolean map[]) {

        // Base case: when all characters have been processed,
        // print the final string without duplicates
        if (i == str.length()) {
            System.out.println("New String : " + newStr);
            return;
        }

        // Get the current character
        char currChar = str.charAt(i);

        // Check whether the current character has already appeared
        if (map[currChar - 'a'] == true) {

            // If duplicate, skip the character and move to the next one
            duplicateStringRemove(str, i + 1, newStr, map);

        } else {

            // Mark the character as visited
            map[currChar - 'a'] = true;

            // Add the character to the new string and continue recursion
            duplicateStringRemove(
                    str, i + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {

        // Sample input
        duplicateStringRemove(
                "appnnacollege",
                0,
                new StringBuilder(""),
                new boolean[26]
        );
    }
}
