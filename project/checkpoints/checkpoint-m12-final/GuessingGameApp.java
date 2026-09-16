import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Checkpoint after Module 12: the finished GuessingGame application.
// Choose a difficulty, play the round, record the result in an
// ArrayList<Player> highscore list, and print it sorted. Invalid input is
// caught (inherited from GuessingGame / Module 9).
public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> highscores = new ArrayList<>();

        boolean playAgain = true;
        while (playAgain) {
            System.out.print("What is your name? ");
            String name = scanner.nextLine();

            GuessingGame game = chooseDifficulty(scanner);
            int attempts = game.play(scanner);
            highscores.add(new Player(name, attempts));

            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().trim().equalsIgnoreCase("yes");
        }

        Collections.sort(highscores);
        System.out.println("\nHighscore list (best attempt count first):");
        for (Player player : highscores) {
            System.out.println(player);
        }

        scanner.close();
    }

    private static GuessingGame chooseDifficulty(Scanner scanner) {
        System.out.print("Choose difficulty - 1 = easy, 2 = hard: ");
        String input = scanner.nextLine().trim();

        return switch (input) {
            case "2" -> new HardGuessingGame();
            default -> new EasyGuessingGame();
        };
    }
}
