package RandomGuess;

import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {

        int correctNum = (int) (Math.random() * 10 + 1);
        int maxTries = 3;

        Scanner scanner = new Scanner(System.in);

        boolean isMaxReached = false;
        boolean isCorrect = false;
        int currentTry = 1;

        // !true = false;
        // !false = true;

        while (!isMaxReached && !isCorrect) {
            System.out.printf("Guess the num (%d/%d):  ", currentTry, maxTries);
            int userNum = scanner.nextInt();
            isCorrect = userNum == correctNum;

            currentTry++;
            isMaxReached = currentTry > maxTries;

            if (!isCorrect && !isMaxReached) {
                System.out.println("Sorry, not correct, please try again!");
            }
            if (!isCorrect && isMaxReached) {
                System.out.println("Sorry, not correct, no tries left! GAME OVER!, the correct number was: "
                        + correctNum);
            }
            if (isCorrect) {
                System.out.println("Well done! It was correct");
            }
        }

        scanner.close();

    }
}
