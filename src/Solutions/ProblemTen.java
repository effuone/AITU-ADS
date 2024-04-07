package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemTen {

    /**
     * Calculates the Greatest Common Divisor (GCD) of two integers using the Euclidean Algorithm.
     * Original Problem: Given two integers "a" and "b", find their GCD.
     *
     * Time Complexity: O(log(min(a, b))), where a and b are the input integers.
     * The Euclidean Algorithm's time complexity is logarithmic in the smaller of the two numbers
     * due to the reduction in size at each step of the recursion.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The GCD of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: GCD(a, 0) = a
        }
        return gcd(b, a % b); // Recursive step: GCD(a, b) = GCD(b, a % b)
    }

    /**
     * Demonstrates calculating the GCD of two user-input integers using recursion.
     * Prompts the user for two integers, computes their GCD using the Euclidean Algorithm,
     * and prints the result along with the execution time.
     */
    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 10: Calculating GCD(a, b) using recursion with the Euclidean Algorithm.");

        System.out.println("Enter number a:");
        int a = scanner.nextInt();

        System.out.println("Enter number b:");
        int b = scanner.nextInt();

        // Using Supplier to encapsulate the GCD computation for measuring execution time
        Supplier<Integer> gcdSupplier = () -> gcd(a, b);

        long timeTaken = Benchmarker.measureExecutionTime(gcdSupplier);

        // Display the GCD and execution time
        int result = gcdSupplier.get();
        System.out.println("The GCD of " + a + " and " + b + " is: " + result);
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}
