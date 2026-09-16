package RandomGuess;

import java.util.Scanner;

public class RandomGuessFunc {
    public static void main(String[] args) {

        int correctNum = (int) (Math.random() * 10 + 1);

        Scanner scanner = new Scanner(System.in);
        boolean isCorrect = checkCorrectNum(scanner, correctNum);

        if (isCorrect) {
            System.exit(0);

        } else {
            System.out.println("Please try again!");
        }

        isCorrect = checkCorrectNum(scanner, correctNum);

        if (isCorrect) {
            System.exit(0);

        } else {
            System.out.println("You lost!");
        }

    }

    public static boolean checkCorrectNum(Scanner scanner, int correctNum) {

        System.out.println("Guess the num:");
        int userNum = scanner.nextInt();

        if (userNum == correctNum) {
            System.out.println("You won!");
            return true;
        }

        return false;
    }

}
