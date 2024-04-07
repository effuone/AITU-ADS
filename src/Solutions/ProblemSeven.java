package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemSeven {

    /**
     * Recursively prints the elements of an array in reverse order.
     * Original Problem: Given an array "arr" of "n" elements, print the elements in reverse order using recursion.
     *
     * Time Complexity: O(n), where n is the number of elements in the array.
     * Each element of the array is printed exactly once, leading to n recursive calls.
     *
     * @param arr The array whose elements are to be printed in reverse order.
     * @param index The current index in the array being processed.
     */
    private static void printReverse(int[] arr, int index) {
        if (index < 0) {
            return; // Base case: when index is out of array bounds, stop the recursion
        }
        System.out.print(arr[index] + " "); // Print the current element
        printReverse(arr, index - 1); // Recursive call to process the previous element
    }

    /**
     * Initiates the recursive process of printing an array's elements in reverse order.
     *
     * @param arr The array to be printed in reverse order.
     */
    public static void reversePrint(int[] arr) {
        printReverse(arr, arr.length - 1); // Start the recursion from the last element
    }

    /**
     * Demonstrates printing an array in reverse order for a user-input array.
     * Prompts the user to input the array elements, then prints them in reverse order
     * along with the execution time of the printing process.
     */
    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 7: Printing an array in reverse order using recursion.");

        System.out.println("Enter the number of elements in your array:");
        int n = scanner.nextInt();

        int[] arr = new int[n]; // Array to hold user inputs
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Populate the array with user inputs
        }

        // Using Supplier to encapsulate the reverse printing process for measuring execution time
        Supplier<Void> reversePrintSupplier = () -> {
            reversePrint(arr);
            return null;
        };

        System.out.println("Reversed array elements:");
        long timeTaken = Benchmarker.measureExecutionTime(reversePrintSupplier); // Measure execution time

        // Print execution time
        System.out.println("\nExecution time: " + timeTaken + " milliseconds");
    }
}
