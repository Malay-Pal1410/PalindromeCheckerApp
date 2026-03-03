import java.util.LinkedList;

/**
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList[cite: 91].
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 * - removeFirst()
 * - removeLast() [cite: 92]
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation[cite: 92].
 *
 * @author Developer
 * @version 8.0 [cite: 93]
 */
public class PalindromeApp {

    /**
     * Application entry point for UC8[cite: 93].
     * @param args Command-line arguments [cite: 93]
     */
    public static void main(String[] args) {

        // Define the input string [cite: 94]
        String input = "level"; // [cite: 94]

        // Create a LinkedList to store characters [cite: 95]
        LinkedList<Character> list = new LinkedList<>(); // [cite: 95]

        // Add each character to the linked list [cite: 96]
        for (char c : input.toCharArray()) { // [cite: 96]
            list.add(c);
        }

        // Flag to track palindrome state [cite: 96]
        boolean isPalindrome = true; // [cite: 96]

        // Compare until only one or zero elements remain
        while (list.size() > 1) { //
            // Removing elements from both ends to compare [cite: 92]
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break; // Exit early if a mismatch occurs
            }
        }

        // Display results
        System.out.println("Input: " + input); //
        System.out.println("Is Palindrome?: " + isPalindrome); //
    }
}