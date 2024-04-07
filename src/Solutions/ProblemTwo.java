package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemTwo {

    /**
     * Calculates the average of an array of integers.
     * Original Problem: Given an array "arr" of "n" elements, find the average of these elements.
     *
     * Time Complexity: O(n), where n is the number of elements in the array.
     * This is because the method iterates through each element of the array exactly once to compute the sum,
     * and then performs a single division operation to find the average.
     *
     * @param arr The array from which to calculate the average.
     * @return The average of the array elements as a double.
     * @throws IllegalArgumentException If the array is null or empty, as average is undefined in these cases.
     */
    public static double findAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0; // Edge case: null or empty array
        }

        double sum = 0; // Initialize sum
        for (int value : arr) {
            sum += value; // Sum up the array elements
        }
        return sum / arr.length; // Calculate and return the average
    }

    /**
     * Demonstrates finding the average of an array of integers.
     * Allows user interaction for inputting array values or using default values for demonstration.
     */
    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 2: Finding the average of array elements without using recursion.");
        System.out.println("Do you want to use the default input values? (yes/no)");
        String choice = scanner.next();

        int[] arr;
        if (choice.equalsIgnoreCase("yes")) {
            arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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
        Supplier<Double> findAverageSupplier = () -> findAverage(arr);

        long timeTaken = Benchmarker.measureExecutionTime(findAverageSupplier);

        double average = findAverageSupplier.get(); // Get the average using the supplier

        System.out.printf("\nThe average of the elements is: %.2f%n", average);
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}
