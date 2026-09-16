package RandomGuess;

import java.util.Scanner;

public class RandomGuessBasic {
    public static void main(String[] args) {

        int correctNum = (int) (Math.random() * 10 + 1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the num:");
        int userNum = scanner.nextInt();

        boolean isCorrect = userNum == correctNum;

        if (isCorrect) {
            System.out.println("You won!");
            System.exit(0);

        } else {
            System.out.println("Please try again!");
        }

        System.out.println("Guess the num:");
        userNum = scanner.nextInt();
        isCorrect = userNum == correctNum;

        if (isCorrect) {
            System.out.println("You won!");
            System.exit(0);

        } else {
            System.out.println("You lost!");
        }

    }
}
