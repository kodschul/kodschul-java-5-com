import java.util.Scanner;

// Checkpoint after Module 6: every guess is now also stored in an array
// ("we need a list of attempts now").
public class GuessingGame {

    public static void main(String[] args) {
        playRound();
    }

    static void playRound() {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int maxAttempts = 10;
        int[] attemptHistory = new int[maxAttempts];
        int attemptCount = 0;
        Scanner scanner = new Scanner(System.in);

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and 100: ");
            int guess = scanner.nextInt();
            attemptHistory[attemptCount] = guess;
            attemptCount++;

            if (guess == targetNumber) {
                System.out.pr
                    intln("Correct! The number was " + targetNumber + ".");
                break;
            } else if (guess < targetNumber) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
        }

        System.out.print("Your guesses: ");
        for (int i = 0; i < attemptCount; i++) {
            System.out.print(attemptHistory[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
