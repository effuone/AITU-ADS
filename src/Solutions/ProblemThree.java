package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemThree {

    /**
     * Checks if a given number is prime.
     * Original Problem: Determine whether a given number "n" is prime.
     *
     * Time Complexity: O(sqrt(n)), where n is the number to be checked for primality.
     * This is because the loop iterates only up to the square root of n, checking for divisibility.
     *
     * @param n The number to check for primality.
     * @return true if n is prime, false otherwise.
     */
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false; // 1 and negative numbers are not prime
        }
        if (n == 2) {
            return true; // 2 is the only even prime number
        }
        if (n % 2 == 0) {
            return false; // Other even numbers are not prime
        }
        for (int i = 3; i * i <= n; i += 2) { // Only check the odd numbers
            if (n % i == 0) {
                return false; // Found a divisor, n is not prime
            }
        }
        return true; // No divisors found, n is prime
    }

    /**
     * Demonstrates the primality check for a user-input number.
     * The function prompts the user for a number, checks its primality,
     * and prints whether the number is prime or composite, along with execution time.
     */
    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 3: Checking if a number is prime.");

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        // Using Supplier to encapsulate the primality check for measuring execution time
        Supplier<Boolean> checkPrimeSupplier = () -> checkPrime(n);

        long timeTaken = Benchmarker.measureExecutionTime(checkPrimeSupplier);

        boolean isPrime = checkPrimeSupplier.get(); // Determine whether the number is prime

        System.out.println(n + " is " + (isPrime ? "Prime" : "Composite"));
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}
