/**
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 */
public class PalindromeApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) { //

        // Define the input string
        String input = "Level"; //
        String normalizedInput = input.toLowerCase();

        // Capture execution start time
        long startTime = System.nanoTime(); //

        // Strategy Implementation: Standard Two-Pointer approach
        boolean isPalindrome = true;
        int start = 0;
        int end = normalizedInput.length() - 1;

        while (start < end) {
            if (normalizedInput.charAt(start) != normalizedInput.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Capture execution end time
        long endTime = System.nanoTime(); //

        // Calculate total execution duration
        long duration = endTime - startTime; //

        // Display benchmarking results
        System.out.println("Input: " + input); //
        System.out.println("Is Palindrome?: " + isPalindrome); //
        System.out.println("Execution Time: " + duration + " ns"); //
    }
}