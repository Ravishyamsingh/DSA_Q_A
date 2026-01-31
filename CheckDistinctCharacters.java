import java.util.*;

public class CheckDistinctCharacters {

    /**
     * @param str: a string
     * @return: a boolean
     */
    public static boolean is_Unique_str(String str) {

        // Edge case: empty or single-character string
        if (str == null || str.length() <= 1) {
            return true;
        }

        // Convert the input string to a character array
        char[] chars = str.toCharArray();

        // Sort the character array in lexicographical order
        Arrays.sort(chars);

        // Check for repeated characters in the sorted array
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i - 1]) {
                return false;
            }
        }

        // If no repeated characters are found
        return true;
    }

    public static void main(String[] args) {

        // Test case
        String str = "xyyz";

        System.out.println("Original String: " + str);
        System.out.println("String has all unique characters: " + is_Unique_str(str));
    }
}
