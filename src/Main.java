import Solutions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the problem number to run (e.g., 1 for ProblemOne):");
        int problemNumber = scanner.nextInt();
        switch (problemNumber) {
            case 1:
                ProblemOne problem1 = new ProblemOne();
                problem1.demo();
                break;
            case 2:
                ProblemTwo problem2 = new ProblemTwo();
                problem2.demo();
                break;
            case 3:
                ProblemThree problem3 = new ProblemThree();
                problem3.demo();
                break;
            case 4:
                ProblemFour problem4 = new ProblemFour();
                problem4.demo();
                break;
            case 5:
                ProblemFive problem5 = new ProblemFive();
                problem5.demo();
                break;
            case 6:
                ProblemSix problem6 = new ProblemSix();
                problem6.demo();
                break;
            case 7:
                ProblemSeven problem7 = new ProblemSeven();
                problem7.demo();
                break;
            case 8:
                ProblemEight problem8 = new ProblemEight();
                problem8.demo();
                break;
            case 9:
                ProblemNine problem9 = new ProblemNine();
                problem9.demo();
                break;
            case 10:
                ProblemTen problem10 = new ProblemTen();
                problem10.demo();
                break;
            default:
                System.out.println("Invalid problem number");
                break;
        }
    }
}
