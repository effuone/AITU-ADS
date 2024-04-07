import Solutions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the problem number to run (e.g., 1 for ProblemOne):");
        int problemNumber = scanner.nextInt();
        switch (problemNumber) {
            case 1:
                ProblemOne problemOne = new ProblemOne();
                problemOne.demo();
                break;
            case 2:
                ProblemTwo problemTwo = new ProblemTwo();
                problemTwo.demo();
                break;
            case 3:
                ProblemThree problemThree = new ProblemThree();
                problemThree.demo();
                break;
            case 4:
                ProblemFour problemFour = new ProblemFour();
                problemFour.demo();
                break;
            case 5:
                ProblemFive problemFive = new ProblemFive();
                problemFive.demo();
                break;
            case 6:
                ProblemSix problemSix = new ProblemSix();
                problemSix.demo();
                break;
            default:
                System.out.println("Invalid problem number");
                break;
        }
    }
}
