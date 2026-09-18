package Game;

import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean playAgain = true;

        while (playAgain) {
            GuessingGame game = new GuessingGame(3);
            game.play(scanner);

            System.out.print("Do you want to play again? (true/false): ");
            playAgain = scanner.nextBoolean();
        }

        scanner.close();
    }
}