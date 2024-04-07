package Utils;

import java.util.function.Supplier;
public class Benchmarker {
    public static <T> long measureExecutionTime(Supplier<T> function) {
        long startTime = System.currentTimeMillis();
        function.get(); // Execute the function
        long endTime = System.currentTimeMillis();
        return endTime - startTime; // Return the execution time in milliseconds
    }
}