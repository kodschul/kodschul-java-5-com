package OOP;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerScoreRunnerSimple {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        ArrayList<Integer> scores = new ArrayList<>();
        ArrayList<String> usernames = new ArrayList<>();

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

            scores.add(score);
            usernames.add(username);

            System.out.println(username + " score: " + score);

        } while (isRunning);

        System.out.println("All scores: " + scores + " All Names: " + usernames);

        int bestScoreValue = scores.get(0);
        int bestScoreIndex = 0;

        String bestScoreName = usernames.get(0);

        for (int i = 0; i < scores.size(); i++) {

            if (bestScoreValue < scores.get(i)) {
                bestScoreValue = scores.get(i);
                bestScoreIndex = i;

            }
        }

        bestScoreName = usernames.get(bestScoreIndex);
        System.out.println("Winner is: " + bestScoreName + " with a score of: " + bestScoreValue);
    }
}
