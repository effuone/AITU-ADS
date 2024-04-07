package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemTen {

    // Recursive function to calculate GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: GCD(a, 0) = a
        }
        return gcd(b, a % b); // Recursive step: GCD(a, b) = GCD(b, a % b)
    }

    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 10: Calculating GCD(a, b) using recursion with the Euclidean Algorithm.");

        System.out.println("Enter number a:");
        int a = scanner.nextInt();

        System.out.println("Enter number b:");
        int b = scanner.nextInt();

        Supplier<Integer> gcdSupplier = () -> gcd(a, b);

        long timeTaken = Benchmarker.measureExecutionTime(gcdSupplier);

        int result = gcdSupplier.get();

        System.out.println("The GCD of " + a + " and " + b + " is: " + result);
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}
