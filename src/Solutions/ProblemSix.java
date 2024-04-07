package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemSix {

    /**
     * Calculates the result of a raised to the power of n using recursion.
     * Original Problem: Given a base "a" and an exponent "n", compute a^n.
     *
     * Time Complexity: O(n), where n is the exponent.
     * This is because the function makes n recursive calls, each time reducing the exponent by 1 until it reaches 0.
     *
     * @param a The base.
     * @param n The exponent. Note: This implementation assumes n is non-negative.
     * @return The result of a^n.
     */
    public static long power(int a, int n) {
        if (n == 0) {
            return 1; // Base case: any number to the power of 0 is 1
        }
        return a * power(a, n - 1); // Recursive step: a^n = a * a^(n-1)
    }

    /**
     * Demonstrates calculating a^n for user-provided base and exponent values.
     * The function prompts the user for the base "a" and the exponent "n",
     * ensures that "n" is non-negative, computes a^n, and prints the result along with the execution time.
     */
    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 6: Calculating a^n using recursion.");

        System.out.println("Enter the base (a):");
        int a = scanner.nextInt();

        System.out.println("Enter the exponent (n):");
        int n = scanner.nextInt();

        // Ensure the exponent is non-negative
        if (n < 0) {
            System.out.println("This implementation does not handle negative exponents.");
            return;
        }

        // Using Supplier to encapsulate the power computation for measuring execution time
        Supplier<Long> powerSupplier = () -> power(a, n);

        long timeTaken = Benchmarker.measureExecutionTime(powerSupplier);

        // Display the result and execution time
        long result = powerSupplier.get();
        System.out.println(a + " raised to the power of " + n + " is: " + result);
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}
