import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue) [cite: 77].
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 * - removeFirst()
 * - removeLast()
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 *
 * @author Developer [cite: 80]
 * @version 7.0 [cite: 80]
 */
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @version 7.0
 */
public class PalindromeApp {

    /**
     * Application entry point for UC7.
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // Remove from front and back and compare
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break; // Exit early if a mismatch occurs
            }
        }

        // Display results
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}