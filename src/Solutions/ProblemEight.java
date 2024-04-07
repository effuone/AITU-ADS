package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemEight {

    /**
     * Recursively checks if a string consists only of digits.
     * Original Problem: Given a string "s", determine if it consists solely of digits.
     *
     * Time Complexity: O(n), where n is the length of the string.
     * Each character of the string is checked exactly once, leading to n recursive calls.
     *
     * @param s The string to check.
     * @param index The current index being checked in the string.
     * @return true if the string consists only of digits, false otherwise.
     */
    private static boolean isAllDigits(String s, int index) {
        if (index == s.length()) {
            return true; // Base case: reached the end of the string without finding a non-digit
        }
        char currentChar = s.charAt(index);
        if (!Character.isDigit(currentChar)) {
            return false; // Found a non-digit character
        }
        return isAllDigits(s, index + 1); // Recursive call to check the next character
    }

    /**
     * Initiates the recursive process to check if a string consists only of digits.
     *
     * @param s The string to be checked.
     * @return true if the string consists only of digits, false otherwise.
     */
    public static boolean checkAllDigits(String s) {
        return isAllDigits(s, 0); // Start the recursion from the first character
    }

    /**
     * Demonstrates checking if a user-input string consists only of digits.
     * Prompts the user for a string, checks if it's all digits using recursion,
     * and prints the result along with the execution time.
     */
    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 8: Checking if a string consists only of digits using recursion.");

        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        // Using Supplier to encapsulate the digit check for measuring execution time
        Supplier<Boolean> checkAllDigitsSupplier = () -> checkAllDigits(s);

        long timeTaken = Benchmarker.measureExecutionTime(checkAllDigitsSupplier);

        // Determine if the string consists only of digits and display the result and execution time
        boolean allDigits = checkAllDigitsSupplier.get();
        System.out.println("The string \"" + s + "\" " + (allDigits ? "consists only of digits." : "contains non-digit characters."));
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}
