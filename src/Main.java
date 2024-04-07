import Solutions.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    private static final Map<Integer, Consumer<Scanner>> problemActions = new HashMap<>();

    static {
        problemActions.put(1, scanner -> new ProblemOne().demo());
        problemActions.put(2, scanner -> new ProblemTwo().demo());
        problemActions.put(3, scanner -> new ProblemThree().demo());
        problemActions.put(4, scanner -> new ProblemFour().demo());
        problemActions.put(5, scanner -> new ProblemFive().demo());
        problemActions.put(6, scanner -> new ProblemSix().demo());
        problemActions.put(7, scanner -> new ProblemSeven().demo());
        problemActions.put(8, scanner -> new ProblemEight().demo());
        problemActions.put(9, scanner -> new ProblemNine().demo());
        problemActions.put(10, scanner -> new ProblemTen().demo());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the problem number to run (e.g., 1 for ProblemOne):");
        int problemNumber = scanner.nextInt();

        Consumer<Scanner> action = problemActions.get(problemNumber);
        if (action != null) {
            action.accept(scanner);
        } else {
            System.out.println("Invalid problem number");
        }
    }
}
