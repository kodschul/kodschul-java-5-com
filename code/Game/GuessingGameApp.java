package Game;

import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean playAgain = true;

        int upperBound = 10;

        while (playAgain) {

            System.out.print("Choose difficulty: 1 for easy, 2 for advanced, 3 for dynamic ");
            int difficulty = (new Scanner(System.in)).nextInt();

            GuessingGame game = switch (difficulty) {
                case 1 -> new SimpleGuessingGame();
                case 2 -> new AdvancedGuessingGame();
                default -> new GuessingGame(3, 1, upperBound);
            };

            game.play(scanner);

            System.out.print("Do you want to play again? (true/false): ");
            playAgain = scanner.nextBoolean();

            upperBound += 5;
        }

        scanner.close();
    }
}