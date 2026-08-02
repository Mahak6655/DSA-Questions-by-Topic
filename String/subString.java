package String;

public class subString {

    // Method to create a substring from index 's' (inclusive)
    // to index 'e' (exclusive) without using the built-in method
    public static String printSubString(String str, int s, int e) {
        String newStr = "";

        // Append characters one by one to form the substring
        for (int i = s; i < e; i++) {
            newStr += str.charAt(i);
        }

        return newStr;
    }

    public static void main(String[] args) {

        // Example string
        String str = "HelloWorld";

        // User-defined substring method
        System.out.println("User-defined: " + printSubString(str, 0, 5));

        // Built-in substring method
        System.out.println("Built-in: " + str.substring(0, 5));
    }
}
// Time Complexity
// Time: O(n) (where n = e - s)
// Space: O(n) (stores the extracted substring)