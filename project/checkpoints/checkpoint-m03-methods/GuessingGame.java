import java.util.Scanner;

// Checkpoint after Module 3: GuessingGame as a single method.
// Generates a random number (1-100) and checks one single guess via Scanner.
// No branching yet for "too high/too low" (that's Module 4), no repetition
// yet (that's Module 5).
public class GuessingGame {

    public static void main(String[] args) {
        playRound();
    }

    // Generates a random number between 1 and 100 and reads a single guess.
    static void playRound() {
        int targetNumber = (int) (Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: ");
        int guess = scanner.nextInt();

        if (guess == targetNumber) {
            System.out.println("Correct! The number was " + targetNumber + ".");
        } else {
            System.out.println("Wrong. The number was " + targetNumber + ".");
        }
                    

        scanner.close();
    }
}
