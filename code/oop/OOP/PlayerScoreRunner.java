package OOP;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerScoreRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        ArrayList<PlayerDetail> players = new ArrayList<>();

        do {
            System.out.print("Enter player name and score (e.g Anna 10): ");
            String userInput = scanner.nextLine();

            if (userInput.isEmpty()) {
                isRunning = false;
                break;
            }
            String[] userInputParts = userInput.split(" ");

            PlayerDetail playerDetail = new PlayerDetail(userInputParts[0], Integer.parseInt(userInputParts[1]));

            System.out.println(playerDetail.name + " score: " + playerDetail.score);
            players.add(playerDetail);

        } while (isRunning);

        PlayerDetail bestPlayer = players.get(0);

        for (PlayerDetail playerDetail : players) {

            if (playerDetail.score > bestPlayer.score) {
                bestPlayer = playerDetail;
            }
        }

        System.out.println("Winner is: " + bestPlayer.name + " with a score of: " + bestPlayer.score);
    }
}
