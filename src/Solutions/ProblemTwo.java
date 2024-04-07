package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemTwo {

    // Recursive function to compute the sum of array elements
    private static double sumArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index]; // Base case: return the last element
        }
        return arr[index] + sumArray(arr, index + 1); // Recursive step: element + sum of the rest
    }

    // Function to calculate the average using the sumArray function
    public static double findAverage(int[] arr) {
        if (arr.length == 0) {
            return 0; // Edge case: empty array
        }
        double sum = sumArray(arr, 0); // Start summing from the first element
        return sum / arr.length; // Calculate average
    }

    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 2: Finding the average of array elements using recursion.");
        System.out.println("Do you want to use the default input values? (yes/no)");
        String choice = scanner.next();

        int[] arr;
        if (choice.equalsIgnoreCase("yes")) {
            arr = new int[]{1, 2, 3, 4};
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

        Supplier<Double> findAverageSupplier = () -> findAverage(arr);

        long timeTaken = Benchmarker.measureExecutionTime(findAverageSupplier);

        double average = findAverageSupplier.get();

        System.out.printf("\nThe average of the elements is: %.2f%n", average);
        System.out.println("Execution time: " + timeTaken + " milliseconds");
    }
}

