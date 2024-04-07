package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemThree {

    // Recursive function to check if a number is prime
    private static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return n == 2; // 2 is prime, 1 or less are not
        }
        if (n % i == 0) {
            return false; // If n is divisible by any number other than 1 and itself
        }
        if (i * i > n) {
            return true; // No need to check further if i squared is greater than n
        }
        return isPrime(n, i + 1); // Check for next divisor
    }

    public static boolean checkPrime(int n) {
        return isPrime(n, 2); // Start checking from 2
    }

    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 3: Checking if a number is prime using recursion.");

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        Supplier<Boolean> checkPrimeSupplier = () -> checkPrime(n);

        long timeTaken = Benchmarker.measureExecutionTime(checkPrimeSupplier);

        boolean isPrime = checkPrimeSupplier.get();

        System.out.println(n + " is " + (isPrime ? "Prime" : "Composite"));
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}
