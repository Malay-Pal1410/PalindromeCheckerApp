/**
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */
public class PalindromeApp {

    /**
     * Application entry point for UC3.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam"; // Hardcoded string for testing
        String reversed = "";

        // Iterate from the last character to the first.
        for (int i = input.length() - 1; i >= 0; i--) {
            // Using String Concatenation (+) to build the reversed string
            reversed += input.charAt(i);
        }

        // Using equals() Method to compare actual content
        boolean isPalindrome = input.equals(reversed);

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}
