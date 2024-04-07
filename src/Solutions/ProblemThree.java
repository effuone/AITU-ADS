package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemThree {

    // Function to check if a number is prime
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

    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 3: Checking if a number is prime without using recursion.");

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        // Using Supplier to measure execution time
        Supplier<Boolean> checkPrimeSupplier = () -> checkPrime(n);

        long timeTaken = Benchmarker.measureExecutionTime(checkPrimeSupplier);

        boolean isPrime = checkPrimeSupplier.get(); // Determine whether is prime using the supplier

        System.out.println(n + " is " + (isPrime ? "Prime" : "Composite"));
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}
