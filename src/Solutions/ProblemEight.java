package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemEight {

    // Recursive function to check if a string consists only of digits
    private static boolean isAllDigits(String s, int index) {
        if (index == s.length()) {
            return true; // Reached the end of the string without finding a non-digit character
        }
        char currentChar = s.charAt(index);
        if (!Character.isDigit(currentChar)) {
            return false; // Found a non-digit character
        }
        return isAllDigits(s, index + 1); // Move to the next character
    }

    public static boolean checkAllDigits(String s) {
        return isAllDigits(s, 0); // Start checking from the first character
    }

    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 8: Checking if a string consists only of digits using recursion.");

        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        Supplier<Boolean> checkAllDigitsSupplier = () -> checkAllDigits(s);

        long timeTaken = Benchmarker.measureExecutionTime(checkAllDigitsSupplier);

        boolean allDigits = checkAllDigitsSupplier.get();

        System.out.println("The string \"" + s + "\" " + (allDigits ? "consists only of digits." : "contains non-digit characters."));
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}

