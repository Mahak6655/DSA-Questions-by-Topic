package String;

public class stringCompression {

    // Method to compress a string by replacing consecutive
    // repeated characters with the character followed by its count
    public static String stringCompressionLetter(String str) {

        // StringBuilder is used for efficient string concatenation
        StringBuilder sb = new StringBuilder("");

        // Traverse the string
        for (int i = 0; i < str.length(); i++) {

            // Count occurrences of the current character
            Integer count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append the current character
            sb.append(str.charAt(i));

            // Append the count only if it is greater than 1
            if (count > 1) {
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        // Sample input
        String str = "aaaabbbshhhdddd";

        // Print the compressed string
        System.out.println(stringCompressionLetter(str));
    }
}