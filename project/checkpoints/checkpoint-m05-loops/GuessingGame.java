import java.util.Scanner;

// Checkpoint after Module 5: branching and a loop.
// The guess is now evaluated (correct/too high/too low) and the round
// repeats until the player guesses correctly or runs out of attempts.
public class GuessingGame {

    public static void main(String[] args) {
        playRound();
    }

    static void playRound() {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int maxAttempts = 10;
        Scanner scanner = new Scanner(System.in);

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and 100: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("Correct! The number was " + targetNumber + ".");
                scanner.close();
                return;
            } else if (guess 
                    < targetNumber) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
        }

        System.out.println("No attempts left. The number was " + targetNumber + ".");
        scanner.close();
    }
}
