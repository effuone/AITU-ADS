package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemSix {

    // Recursive function to calculate a^n
    public static long power(int a, int n) {
        if (n == 0) {
            return 1; // Base case: any number to the power of 0 is 1
        }
        return a * power(a, n - 1); // Recursive step: a^n = a * a^(n-1)
    }

    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 6: Calculating a^n using recursion.");

        System.out.println("Enter the base (a):");
        int a = scanner.nextInt();

        System.out.println("Enter the exponent (n):");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("This implementation does not handle negative exponents.");
            return;
        }

        Supplier<Long> powerSupplier = () -> power(a, n);

        long timeTaken = Benchmarker.measureExecutionTime(powerSupplier);

        long result = powerSupplier.get();

        System.out.println(a + " raised to the power of " + n + " is: " + result);
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}

