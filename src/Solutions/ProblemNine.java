package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemNine {

    // Recursive function to calculate the binomial coefficient C(n, k)
    public static long binomialCoefficient(int n, int k) {
        // Base cases
        if (k == 0 || k == n) {
            return 1;
        }
        // Recursive step using the formula C(n, k) = C(n-1, k-1) + C(n-1, k)
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 9: Calculating binomial coefficient C(n, k) using recursion.");

        System.out.println("Enter n:");
        int n = scanner.nextInt();

        System.out.println("Enter k:");
        int k = scanner.nextInt();

        if (n < 0 || k < 0 || k > n) {
            System.out.println("Invalid input. Ensure that 0 <= k <= n and n >= 0.");
            return;
        }

        Supplier<Long> binomialCoefficientSupplier = () -> binomialCoefficient(n, k);

        long timeTaken = Benchmarker.measureExecutionTime(binomialCoefficientSupplier);

        long result = binomialCoefficientSupplier.get();

        System.out.println("C(" + n + ", " + k + ") = " + result);
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}

