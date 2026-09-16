import java.util.InputMismatchException;
import java.util.Scanner;

// Checkpoint after Module 11: base class for the guessing game. Difficulty
// levels are implemented as subclasses (EasyGuessingGame, HardGuessingGame)
// that set the number range and attempt limit.
public class GuessingGame {

    protected final int upperBound;
    protected final int maxAttempts;
    private final int targetNumber;
    private int attemptsNeeded;

    public GuessingGame(int upperBound, int maxAttempts) {
        this.upperBound = upperBound;
        this.maxAttempts = maxAttempts;
        this.targetNumber = (int) (Math.random() * upperBound) + 1;
        this.attemptsNeeded = 0;
    }

    public int play(Scanner scanner) {
        int attempt = 1;

        while (attempt <= maxAttempts) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and " + upperBound + ": ");

            try {
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
            } catch (InputMismatchException e) {
                System.out.println("That wasn't a number. Please enter a whole number.");
                scanner.next();
            }
        }

        System.out.println("No attempts left. The number was " + targetNumber + ".");
        attemptsNeeded = maxAttempts + 1;
        return attemptsNeeded;
    }

    public int getAttemptsNeeded() {
        return attemptsNeeded;
    }

    @Override
    public String toString() {
        return "GuessingGame{upperBound=" + upperBound + ", maxAttempts=" + maxAttempts + "}";
    }
}
