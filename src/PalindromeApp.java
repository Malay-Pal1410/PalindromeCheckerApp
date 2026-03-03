/**
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern. [cite: 124]
 *
 * At this stage, the application:
 * - Defines a common PalindromeStrategy interface [cite: 124]
 * - Implements a concrete Stack based strategy [cite: 124]
 * - Injects the strategy at runtime [cite: 124]
 * - Executes the selected algorithm [cite: 124]
 *
 * No performance comparison is done in this use case. [cite: 124]
 * The focus is purely on algorithm interchangeability.
 * The goal is to teach extensible algorithm design.
 *
 * @author Developer
 * @version 12.0
 */
public class PalindromeApp {

    public static void main(String[] args) {
        // Hardcoded input based on the expected output
        String input = "Level"; //

        // Convert to lowercase to ensure a fair palindrome check
        String normalizedInput = input.toLowerCase();

        // Inject the strategy at runtime [cite: 124]
        PalindromeStrategy strategy = new StackStrategy();

        // Execute the selected algorithm [cite: 124]
        boolean isPalindrome = strategy.check(normalizedInput);

        // Display results
        System.out.println("Input: " + input); //
        System.out.println("Is Palindrome?: " + isPalindrome); //
    }
}

/**
 * INTERFACE - PalindromeStrategy
 *
 * This interface defines a contract for all
 * palindrome checking algorithms.
 * Any new algorithm must implement this interface
 * and provide its own validation logic.
 */
interface PalindromeStrategy { //
    boolean check(String input); //
}

/**
 * CLASS - StackStrategy
 *
 * This class provides a Stack based implementation
 * of the PalindromeStrategy interface.
 * It uses LIFO behavior to reverse characters
 * and compare them with the original sequence.
 */
class StackStrategy implements PalindromeStrategy { //

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) { //
        // Create a stack to store characters.
        java.util.Stack<Character> stack = new java.util.Stack<>(); //

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) { //
            stack.push(c);
        }

        // Compare characters by popping from the stack.
        for (char c : input.toCharArray()) { //
            if (c != stack.pop()) {
                return false; // Mismatch found
            }
        }
        return true; // All characters matched
    }
}