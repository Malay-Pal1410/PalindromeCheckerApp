/**
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 *
 * This approach provides:
 * - Reusability
 * - Testability
 * - Separation of concerns
 *
 * @author Developer
 * @version 11.0
 */
public class PalindromeApp {

    /**
     * Application entry point for UC11.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Hardcoded input based on the expected output
        String input = "racecar";

        // Instantiate the service class to utilize OOP encapsulation
        PalindromeService service = new PalindromeService();

        // Validate the input using the exposed method
        boolean isPalindrome = service.checkPalindrome(input);

        // Display results
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Traverse inward until the pointers meet or cross
        while (start < end) {
            // Compare characters at current pointers
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }
        return true; // Is a palindrome
    }
}