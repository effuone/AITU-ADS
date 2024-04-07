package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemFive {

    // Recursive function to find the n-th Fibonacci number
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: F0 = 0, F1 = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive step: Fn = Fn-1 + Fn-2
    }

    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 5: Calculating the n-th Fibonacci number using recursion.");

        System.out.println("Enter a non-negative integer:");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("The Fibonacci sequence is not defined for negative numbers.");
            return;
        }

        Supplier<Long> fibonacciSupplier = () -> fibonacci(n);

        long timeTaken = Benchmarker.measureExecutionTime(fibonacciSupplier);

        long result = fibonacciSupplier.get();

        System.out.println("The " + n + "-th Fibonacci number is: " + result);
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}
