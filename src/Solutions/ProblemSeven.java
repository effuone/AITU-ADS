package Solutions;

import Utils.Benchmarker;

import java.util.Scanner;
import java.util.function.Supplier;

public class ProblemSeven {

    // Recursive function to print elements in reverse order
    private static void printReverse(int[] arr, int index) {
        if (index < 0) {
            return; // Base case: when index is out of array bounds
        }
        System.out.print(arr[index] + " "); // Print current element
        printReverse(arr, index - 1); // Recursive call to print previous element
    }

    public static void reversePrint(int[] arr) {
        printReverse(arr, arr.length - 1); // Start from the last element
    }

    public void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Problem 7: Printing an array in reverse order using recursion.");

        System.out.println("Enter the number of elements in your array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Supplier<Void> reversePrintSupplier = () -> {
            reversePrint(arr);
            return null; // Need to return null since Supplier must return something
        };

        System.out.println("Reversed array elements:");
        long timeTaken = Benchmarker.measureExecutionTime(reversePrintSupplier);

        System.out.println("\nExecution time: " + timeTaken + " milliseconds");
    }
}

