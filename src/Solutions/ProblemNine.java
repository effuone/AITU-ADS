package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemNine {

    /**
     * Calculates the binomial coefficient C(n, k) using recursion.
     * Original Problem: Given two integers "n" and "k", find the binomial coefficient C(n, k),
     * which is the number of ways to choose k elements from a set of n elements.
     * The recursive formula used is C(n, k) = C(n-1, k-1) + C(n-1, k) with base cases C(n, 0) = C(n, n) = 1.
     *
     * Time Complexity: O(2^n), where n is the first parameter.
     * This is due to the nature of the recursive formula, where each call generates two more calls,
     * leading to exponential growth in the number of calls.
     *
     * @param n The total number of elements.
     * @param k The number of elements to choose.
     * @return The binomial coefficient C(n, k).
     */
    public static long binomialCoefficient(int n, int k) {
        // Base cases: C(n, 0) and C(n, n) are 1
        if (k == 0 || k == n) {
            return 1;
        }
        // Recursive step using the formula C(n, k) = C(n-1, k-1) + C(n-1, k)
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    /**
     * Demonstrates calculating the binomial coefficient C(n, k) for user-provided values of n and k.
     * Validates the inputs to ensure they meet the constraints for calculating binomial coefficients
     * and prints the result along with the execution time.
     */
    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 9: Calculating binomial coefficient C(n, k) using recursion.");

        System.out.println("Enter n:");
        int n = scanner.nextInt();

        System.out.println("Enter k:");
        int k = scanner.nextInt();

        // Validate inputs: 0 <= k <= n and n >= 0
        if (n < 0 || k < 0 || k > n) {
            System.out.println("Invalid input. Ensure that 0 <= k <= n and n >= 0.");
            return;
        }

        // Using Supplier to encapsulate the binomial coefficient computation for measuring execution time
        Supplier<Long> binomialCoefficientSupplier = () -> binomialCoefficient(n, k);

        long timeTaken = Benchmarker.measureExecutionTime(binomialCoefficientSupplier);

        // Display the binomial coefficient and execution time
        long result = binomialCoefficientSupplier.get();
        System.out.println("C(" + n + ", " + k + ") = " + result);
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}
