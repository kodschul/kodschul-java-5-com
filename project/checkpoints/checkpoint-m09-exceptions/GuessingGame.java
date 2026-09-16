import java.util.InputMismatchException;
import java.util.Scanner;

// Checkpoint after Module 9: non-numeric input no longer crashes the
// program - it's caught with try-catch instead.
public class GuessingGame {

    public static void main(String[] args) {
        int attemptsNeeded = playRound();
        System.out.println("Attempts needed: " + attemptsNeeded);
    }

    static int playRound() {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int maxAttempts = 10;
        Scanner scanner = new Scanner(System.in);
        int attempt = 1;

        while (attempt <= maxAttempts) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and 100: ");

            try {
                int guess = scanner.nextInt();

                if (guess == 
                    targetNumber) {
                    System.out.println("Correct! The number was " + targetNumber + ".");
                    return attempt;
                } else if (guess < targetNumber) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }

                attempt++;
            } catch (InputMismatchException e) {
                System.out.println("That wasn't a number. Please enter a whole number.");
                scanner.next();
                // this failed attempt does not count
            }
        }

        System.out.println("No attempts left. The number was " + targetNumber + ".");
        return maxAttempts + 1;
    }
}
