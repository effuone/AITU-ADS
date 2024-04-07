package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemOne {

    public static int findMinimum(int[] arr, int index, int n) {
        // Base case: if there's only one element left, it's the minimum
        if (index == n - 1) {
            return arr[index];
        }

        // Find the minimum in the rest of the array
        int minOfRest = findMinimum(arr, index + 1, n);

        // Return the minimum between the current element and the minimum of the rest
        return Math.min(arr[index], minOfRest);
    }

    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 1: Finding array minimum using recursion.");
        System.out.println("Do you want to use the default input values? (yes/no)");
        String choice = scanner.next();

        int[] arr;
        if (choice.equalsIgnoreCase("yes")) {
            arr = new int[]{10, 1, 32, 3, 45};
            System.out.println("Using default input values: ");
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        } else {
            System.out.println("Enter the number of elements in your array:");
            int n = scanner.nextInt();
            arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
        }

        Supplier<Integer> findMinimumSupplier = () -> findMinimum(arr, 0, arr.length);

        long timeTaken = Benchmarker.measureExecutionTime(findMinimumSupplier);

        int minElement = findMinimumSupplier.get();

        System.out.println("\nThe minimum element is: " + minElement);
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}

