package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemFour {

    // Recursive function to compute the factorial of n
    public static long factorial(int n) {
        if (n <= 1) {
            return 1; // Base case: 0! = 1! = 1
        }
        return n * factorial(n - 1); // Recursive step: n! = n * (n-1)!
    }

    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 4: Calculating factorial using recursion.");

        System.out.println("Enter a non-negative integer:");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        Supplier<Long> factorialSupplier = () -> factorial(n);

        long timeTaken = Benchmarker.measureExecutionTime(factorialSupplier);

        long result = factorialSupplier.get();

        System.out.println("The factorial of " + n + " is: " + result);
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}

