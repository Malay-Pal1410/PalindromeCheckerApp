/**
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion[cite: 102].
 * Characters are compared from the outer positions
 * moving inward using recursive calls[cite: 102].
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Developer [cite: 104]
 * @version 9.0 [cite: 104]
 */
public class PalindromeApp {

    /**
     * Application entry point for UC9[cite: 104].
     * @param args Command-line arguments [cite: 104]
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "madam"; // Hardcoded input based on the execution example

        // Call the recursive method
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Display results
        System.out.println("Input: " + input); //[cite: 106]
        System.out.println("Is Palindrome?: " + isPalindrome); //cite: 106]
    }

    /**
     * Recursively checks whether a string is palindrome[cite: 105].
     * @param s Input string [cite: 105]
     * @param start Starting index [cite: 105]
     * @param end Ending index [cite: 105]
     * @return true if palindrome, otherwise false [cite: 105]
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition 1: All characters matched (pointers crossed or met)
        if (start >= end) {
            return true;
        }

        // Base Condition 2: A mismatch is found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive step: move inward [cite: 102]
        return check(s, start + 1, end - 1);
    }
}