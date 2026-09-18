package Game;

import java.util.Scanner;

public class GuessingGame {

    private final int targetNumber;
    private final int maxAttempts;
    private int attemptsNeeded;

    public GuessingGame(int maxAttempts) {
        this.targetNumber = (int) (Math.random() * 10) + 1;
        this.maxAttempts = maxAttempts;
        this.attemptsNeeded = 0;
    }

    public int play(Scanner scanner) {
        int attempt = 1;

        while (attempt <= maxAttempts) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and 10: ");

            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("Correct! The number was " + targetNumber + ".");
                attemptsNeeded = attempt;
                return attemptsNeeded;
            } else if (guess < targetNumber) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }

            attempt++;

        }

        System.out.println("No attempts left. The number was " + targetNumber + ".");
        attemptsNeeded = maxAttempts + 1;
        return attemptsNeeded;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public int getAttemptsNeeded() {
        return attemptsNeeded;
    }

}
