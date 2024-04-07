package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemFive {

    /**
     * Computes the n-th Fibonacci number using recursion.
     * Original Problem: Given a non-negative integer "n", find the n-th number in the Fibonacci sequence,
     * where F0 = 0, F1 = 1, and Fn = Fn-1 + Fn-2 for n > 1.
     *
     * Time Complexity: O(2^n), where n is the input number.
     * The recursive tree grows exponentially as each call to fibonacci generates two more calls.
     *
     * @param n The index in the Fibonacci sequence.
     * @return The n-th Fibonacci number.
     * @throws IllegalArgumentException If n is negative, as the Fibonacci sequence is not defined for negative indices.
     */
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The Fibonacci sequence is not defined for negative numbers.");
        }
        if (n <= 1) {
            return n; // Base cases: F0 = 0, F1 = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive step: Fn = Fn-1 + Fn-2
    }

    /**
     * Demonstrates calculating the n-th Fibonacci number for a user-input number.
     * Prompts the user for a non-negative integer, computes the corresponding Fibonacci number,
     * and prints the result along with the execution time.
     */
    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 5: Calculating the n-th Fibonacci number using recursion.");

        System.out.println("Enter a non-negative integer:");
        int n = scanner.nextInt();

        // Validate input
        if (n < 0) {
            System.out.println("The Fibonacci sequence is not defined for negative numbers.");
            return;
        }

        // Using Supplier to encapsulate the Fibonacci computation for measuring execution time
        Supplier<Long> fibonacciSupplier = () -> fibonacci(n);

        long timeTaken = Benchmarker.measureExecutionTime(fibonacciSupplier);

        // Display the Fibonacci number and execution time
        long result = fibonacciSupplier.get();
        System.out.println("The " + n + "-th Fibonacci number is: " + result);
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}
