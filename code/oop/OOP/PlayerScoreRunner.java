package OOP;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class PlayerScoreRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        do {

            System.out.print("Enter player name and score (e.g Anna 10): ");
            String userInput = scanner.nextLine();

            if (userInput.isEmpty()) {
                isRunning = false;
                break;
            }

            String[] userInputParts = userInput.split(" ");

            String username = userInputParts[0];
            int score = Integer.parseInt(userInputParts[1]);

            System.out.println(username + " score: " + score);

        } while (isRunning);

    }
}
