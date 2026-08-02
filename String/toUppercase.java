package String;

public class toUppercase {

    // Method to capitalize the first letter of every word
    public static String toUppercaseLetter(String str) {

        // StringBuilder is used for efficient string manipulation
        StringBuilder sb = new StringBuilder("");

        // Convert the first character to uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Traverse the remaining characters
        for (int i = 1; i < str.length(); i++) {

            // If a space is found, capitalize the next character
            if ((str.charAt(i) == ' ') && (i < str.length() - 1)) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                // Append the current character as it is
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        // Sample input
        String str = "hi, i am learning java programming";

        // Print the formatted string
        System.out.println(toUppercaseLetter(str));
    }
}
