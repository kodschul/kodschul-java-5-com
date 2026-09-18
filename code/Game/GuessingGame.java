package Game;

import java.util.Scanner;

public class GuessingGame {

    private final int targetNumber;
    private final int maxAttempts;

    private final int lowerBound;
    private final int upperBound;
    private int attemptsNeeded;

    public GuessingGame(int maxAttempts, int lowerBound, int upperBound) {

        this.upperBound = upperBound;
        this.lowerBound = lowerBound;

        this.targetNumber = (int) (Math.random() * this.upperBound) + this.lowerBound;
        this.maxAttempts = maxAttempts;
        this.attemptsNeeded = 0;
    }

    public int play(Scanner scanner) {
        int attempt = 1;

        while (attempt <= maxAttempts) {
            System.out.printf("Attempt %d/%d - guess a number between %d and %d : ", attempt, maxAttempts,
                    this.lowerBound, this.upperBound);

            int guess;
            try {

                String guessNum = scanner.nextLine();
                guess = Integer.parseInt(guessNum);
            } catch (Exception e) {
                System.out.println("Enter a valid num! Try again, attempt is not counted!");

                continue;
            }

            if (guess > 10 || guess < 1) {
                continue;
            }

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
