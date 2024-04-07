package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemOne {

    // Method to find the minimum element in array
    public static int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int min = arr[0]; // Start with the first element as the minimum
        for (int i = 1; i < arr.length; i++) { // Start from the second element
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
        }
        return min;
    }

    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 1: Finding array minimum.");
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

        // Using Supplier to measure execution time
        Supplier<Integer> findMinimumSupplier = () -> findMinimum(arr);

        long timeTaken = Benchmarker.measureExecutionTime(findMinimumSupplier);

        int minElement = findMinimumSupplier.get(); // Get the minimum element using the supplier

        System.out.println("\nThe minimum element is: " + minElement);
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}
