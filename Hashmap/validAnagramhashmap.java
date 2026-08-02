
import java.util.*;

public class validAnagramhashmap {

    // Function to check whether two strings are valid anagrams
    public static boolean validAnagram(String s, String t) {

        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // HashMap to store character frequencies of string s
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character in string s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Increase frequency if character already exists
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Traverse string t and reduce character frequencies
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            // If character exists in the map
            if (map.get(ch) != null) {

                // Remove character if frequency becomes 1
                if (map.get(ch) == 1) {
                    map.remove(ch);
                }

                // Otherwise decrease its frequency
                else {
                    map.put(ch, map.get(ch) - 1);
                }
            }

            // Character not found, so strings are not anagrams
            else {
                return false;
            }
        }

        // If map becomes empty, all characters matched successfully
        return map.isEmpty();
    }

    public static void main(String[] args) {

        // Sample strings
        String s = "race";
        String t = "cabe";

        // Display result
        System.out.println(validAnagram(s, t));
    }
}

