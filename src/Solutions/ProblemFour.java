package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemFour {

    /**
     * Computes the factorial of a given non-negative integer n using recursion.
     * Original Problem: Given a non-negative integer "n", calculate n! (n factorial),
     * which is the product of all positive integers less than or equal to n.
     *
     * Time Complexity: O(n), where n is the input number.
     * Each call to factorial makes one other call to itself with n-1, leading to n recursive calls.
     *
     * @param n The non-negative integer for which to compute the factorial.
     * @return The factorial of n.
     * @throws IllegalArgumentException If n is negative, as factorial is not defined for negative numbers.
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n <= 1) {
            return 1; // Base case: 0! = 1! = 1
        }
        return n * factorial(n - 1); // Recursive step: n! = n * (n-1)!
    }

    /**
     * Demonstrates calculating the factorial of a user-input number.
     * The function prompts the user for a non-negative integer, computes its factorial,
     * and prints the result along with the execution time.
     */
    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 4: Calculating factorial using recursion.");

        System.out.println("Enter a non-negative integer:");
        int n = scanner.nextInt();

        // Ensure the input is non-negative
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        // Using Supplier to encapsulate the factorial computation for measuring execution time
        Supplier<Long> factorialSupplier = () -> factorial(n);

        long timeTaken = Benchmarker.measureExecutionTime(factorialSupplier);

        // Display the factorial and execution time
        long result = factorialSupplier.get();
        System.out.println("The factorial of " + n + " is: " + result);
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}
