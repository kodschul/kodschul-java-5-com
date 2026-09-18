import java.util.Scanner;

// Checkpoint after Module 8: the guessing logic now returns the number of
// attempts needed, so it can feed into a highscore list
// (see HighscoreList.java in this folder).
public class GuessingGame {

    public static void main(String[] args) {


        int attemptsNeeded = playRound();
        System.out.println("Attempts needed: " + attemptsNeeded);
    }

    static int playRound() {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int maxAttempts = 10;
        Scanner scanner = new Scanner(System.in);

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + " - guess a number between 1 and 100: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("Correct! The number was " + targetNumber + ".");
                return attempt;
            } else if (guess < targetNumber) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
        }

        System.out.println("No attempts left. The number was " + targetNumber + ".");
        return maxAttempts + 1;
    }
}
