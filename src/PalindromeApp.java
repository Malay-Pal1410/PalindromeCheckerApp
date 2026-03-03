import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 * * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 * If all characters match, the input string is confirmed
 * as a palindrome.
 * * This use case helps understand how FIFO and LIFO
 * behaviors can be combined for symmetric comparison.
 *
 * @author Developer
 * @version 6.0
 */
public class PalindromeApp {

    /**
     * Application entry point for UC6.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string to validate
        String input = "civic";

        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue operation
            stack.push(c); // Push operation
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // Remove from front of queue and top of stack and compare
            if (queue.poll() != stack.pop()) {
                isPalindrome = false;
                break; // Exit early if a mismatch occurs
            }
        }

        // Display results
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}
