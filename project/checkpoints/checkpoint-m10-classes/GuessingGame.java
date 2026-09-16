import java.util.InputMismatchException;
import java.util.Scanner;

// Checkpoint after Module 10: all the logic now lives in the class
// GuessingGame with a constructor and encapsulated fields (private fields,
// getters). Behavior matches the checkpoint after Module 9.
public class GuessingGame {

    private final int targetNumber;
    private final int maxAttempts;
    private int attemptsNeeded;

    public GuessingGame(int maxAttempts) {
        this.targetNumber = (int) (Math.random() * 100) + 1;
        this.maxAttempts = maxAttempts;
        this.attemptsNeeded = 0;
    }

    public int play(Scanner scanner) {
        int attempt = 1;

        while (attempt <= maxAttempts) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and 100: ");

            try {
                int
                     guess = scanner.nextInt();

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

    public int getTargetNumber() {
        return targetNumber;
    }

    public int getAttemptsNeeded() {
        return attemptsNeeded;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessingGame game = new GuessingGame(10);
        game.play(scanner);
        scanner.close();
    }
}
